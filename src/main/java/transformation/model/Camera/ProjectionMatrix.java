package transformation.model.camera;

import org.ejml.simple.SimpleMatrix;

public class ProjectionMatrix extends SimpleMatrix {
    private static final double DEFAULT_ZOOM = 1.1;

    private double focalLength = 500.0;

    public ProjectionMatrix() {
        super(SimpleMatrix.identity(4));
        set(3, 3, 0);
        update();
    }

    private void multiplyFocalLength(double value) {
        focalLength /= value;
        update();
    }

    private void update() {
        set(3, 2, 1 / focalLength);
    }

    public double getFocalLenght() {
        return focalLength;
    }

    public void transform(ProjectionOps operation) {
        switch (operation) {
            case ZoomIn:
                multiplyFocalLength(1 / DEFAULT_ZOOM);
                break;
            case ZoomOut:
                multiplyFocalLength(DEFAULT_ZOOM);
                break;
            default:
                break;
        }
    }
}
