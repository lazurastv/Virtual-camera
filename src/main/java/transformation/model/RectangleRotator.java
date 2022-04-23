package transformation.model;

public abstract class RectangleRotator {
    public static void rotateClockwise() {
        System.out.println("Rotate clockwise");
    }

    public static void rotateCounterclockwise() {
        System.out.println("Rotate counterclockwise");
    }

    public static void lookUp() {
        System.out.println("Rotate backward (Look up)");
    }

    public static void lookDown() {
        System.out.println("Rotate forward (Look down)");
    }

    public static void lookRight() {
        System.out.println("Rotate right (Look right)");
    }

    public static void lookLeft() {
        System.out.println("Rotate left (Look left)");
    }

    public static void reset() {
        System.out.println("Reset view?");
    }
}
