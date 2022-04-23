package transformation.model;

public abstract class RectangleTranslator {
    private static final double DEFAULT_SHIFT = 10;

    public static void moveForward(Rectangle rectangle) {
        PointMatrix.DISTANCE_TO_VIEW *= 1.1;
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.translate(point, 0, 0, DEFAULT_SHIFT);
        }
    }

    public static void moveBackward(Rectangle rectangle) {
        PointMatrix.DISTANCE_TO_VIEW /= 1.1;
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.translate(point, 0, 0, -DEFAULT_SHIFT);
        }
    }

    public static void moveLeft(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.translate(point, -DEFAULT_SHIFT, 0, 0);
        }
    }

    public static void moveRight(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.translate(point, DEFAULT_SHIFT, 0, 0);
        }
    }

    public static void moveUp(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.translate(point, 0, -DEFAULT_SHIFT, 0);
        }
    }

    public static void moveDown(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.translate(point, 0, DEFAULT_SHIFT, 0);
        }
    }
}
