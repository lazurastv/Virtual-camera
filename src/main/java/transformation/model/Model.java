package transformation.model;

import transformation.model.Camera.Camera;
import transformation.model.Camera.CameraOps;
import transformation.model.Camera.ProjectionOps;

import java.awt.Graphics;

public class Model {
    private final Camera camera;

    public Model() {
        camera = new Camera();
    }

    public void tranformCamera(CameraOps operation) {
        camera.transformCamera(operation);
    }

    public void transformProjection(ProjectionOps operation) {
        camera.transformProjection(operation);
    }

    public void draw(Graphics g) {
        for (Rectangle rectangle : ModelConsts.DEFAULT_VIEW) {
            camera.project(rectangle).draw(g);
        }
    }

    public void reset() {
        camera.reset();
    }
}
