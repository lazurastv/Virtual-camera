package transformation.model.Camera;

import org.ejml.simple.SimpleMatrix;

public class ProjectionMatrix extends SimpleMatrix {
    private static final double DEFAULT_FOCAL_LENGTH = 100;
    private static final double DEFAULT_ZOOM = 1.1;

    public ProjectionMatrix() {
        super(SimpleMatrix.identity(4));
        set(3, 3, 0);
        set(3, 2, 1 / DEFAULT_FOCAL_LENGTH);
    }

    private void multiplyFocalLength(double value) {
        set(3, 2, get(3, 2) * value);
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

    public void reset() {
        set(SimpleMatrix.identity(4));
        set(3, 3, 0);
        set(3, 2, 1 / DEFAULT_FOCAL_LENGTH);
    }
}
