package transformation.model;

public abstract class RectangleTranslator {
    public static void moveForward(Rectangle rectangle) {
        System.out.println("Move forward");
        PointMatrix.DISTANCE_TO_VIEW *= 2;
    }

    public static void moveBackward(Rectangle rectangle) {
        System.out.println("Move backward");
        PointMatrix.DISTANCE_TO_VIEW /= 2;
    }

    public static void moveLeft(Rectangle rectangle) {
        System.out.println("Move left");
    }

    public static void moveRight(Rectangle rectangle) {
        System.out.println("Move right");
    }

    public static void moveUp(Rectangle rectangle) {
        System.out.println("Move up");
    }

    public static void moveDown(Rectangle rectangle) {
        System.out.println("Move down");
    }
}
