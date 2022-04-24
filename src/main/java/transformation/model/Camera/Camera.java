package transformation.model.Camera;

import org.ejml.simple.SimpleMatrix;

import transformation.model.Rectangle;

public class Camera {
    private final CameraMatrix cameraMatrix;
    private final ViewMatrix viewMatrix;
    private final ProjectionMatrix projectionMatrix;

    private SimpleMatrix transformMatrix;

    public Camera() {
        cameraMatrix = new CameraMatrix();
        viewMatrix = new ViewMatrix();
        projectionMatrix = new ProjectionMatrix();
        updateTransformMatrix();
    }

    private void updateTransformMatrix() {
        transformMatrix = SimpleMatrix.identity(4);
        transformMatrix = cameraMatrix.mult(transformMatrix);
        transformMatrix = viewMatrix.mult(transformMatrix);
        transformMatrix = projectionMatrix.mult(transformMatrix);
    }

    public void transformCamera(CameraOps operation) {
        cameraMatrix.transform(operation);
        updateTransformMatrix();
    }

    public void transformProjection(ProjectionOps operation) {
        projectionMatrix.transform(operation);
        updateTransformMatrix();
    }

    public Rectangle project(Rectangle rectangle) {
        Rectangle result = new Rectangle(rectangle);
        result.transform(transformMatrix);
        return result;
    }

    public void reset() {
        cameraMatrix.reset();
        viewMatrix.reset();
        projectionMatrix.reset();
        updateTransformMatrix();
    }
}
