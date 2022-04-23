package transformation.model;

public abstract class RectangleScaler {
    private static final double DEFAULT_ZOOM = 1.1;

    public static void zoomIn(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.scale(point, DEFAULT_ZOOM, DEFAULT_ZOOM, DEFAULT_ZOOM);
        }
    }

    public static void zoomOut(Rectangle rectangle) {
        for (PointMatrix point : rectangle.vertices) {
            MatrixOps.scale(point, 1 / DEFAULT_ZOOM, 1 / DEFAULT_ZOOM, 1 / DEFAULT_ZOOM);
        }
    }
}
