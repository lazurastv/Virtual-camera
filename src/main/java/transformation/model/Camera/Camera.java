package transformation.model.camera;

import transformation.model.Rectangle;
import transformation.model.Scene;

import java.awt.Graphics;

public class Camera {
    private CameraMatrix cameraMatrix;
    private ProjectionMatrix projectionMatrix;

    public Camera() {
        reset();
    }

    public void transformCamera(CameraOps operation) {
        cameraMatrix.transform(operation);
    }

    public void transformProjection(ProjectionOps operation) {
        projectionMatrix.transform(operation);
    }

    private Rectangle project(Rectangle rectangle) {
        Rectangle result = new Rectangle(rectangle);
        result.transform(cameraMatrix);
        return result;
    }

    public void draw(Graphics g) {
        for (Rectangle rectangle : Scene.DEFAULT_VIEW) {
            project(rectangle).draw(g, projectionMatrix);
        }
    }

    public void reset() {
        cameraMatrix = new CameraMatrix();
        projectionMatrix = new ProjectionMatrix();
    }
}
