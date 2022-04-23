package transformation.model;

public abstract class RectangleRotator {
    private static final double DEFAULT_ANGLE = Math.PI / 6;

    public static void rotateClockwise(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.rotateZ(point, DEFAULT_ANGLE);
        }
    }

    public static void rotateCounterclockwise(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.rotateY(point, -DEFAULT_ANGLE);
        }
    }

    public static void lookUp(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.rotateX(point, DEFAULT_ANGLE);
        }
    }

    public static void lookDown(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.rotateX(point, -DEFAULT_ANGLE);
        }
    }

    public static void lookRight(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.rotateY(point, DEFAULT_ANGLE);
        }
    }

    public static void lookLeft(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.rotateY(point, -DEFAULT_ANGLE);
        }
    }
}
