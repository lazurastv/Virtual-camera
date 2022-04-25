package transformation.model.camera;

import org.ejml.simple.SimpleMatrix;

import transformation.model.Rectangle;
import transformation.model.Scene;

import java.awt.Graphics;

public class Camera {
    private CameraMatrix cameraMatrix;
    private ProjectionMatrix projectionMatrix;

    private SimpleMatrix transformMatrix;

    public Camera() {
        reset();
    }

    private void updateTransformMatrix() {
        transformMatrix = SimpleMatrix.identity(4);
        transformMatrix = cameraMatrix.mult(transformMatrix);
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

    private Rectangle project(Rectangle rectangle) {
        Rectangle result = new Rectangle(rectangle);
        result.transform(transformMatrix);
        return result;
    }

    public void draw(Graphics g) {
        for (Rectangle rectangle : Scene.DEFAULT_VIEW) {
            project(rectangle).draw(g);
        }
    }

    public void reset() {
        cameraMatrix = new CameraMatrix();
        projectionMatrix = new ProjectionMatrix();
        updateTransformMatrix();
    }
}
