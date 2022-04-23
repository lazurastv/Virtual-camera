package transformation.model;

public class Model {
    public final OriginMatrix origin;
    public final Rectangle rectangle;

    public Model() {
        origin = new OriginMatrix();
        rectangle = ModelConsts.SINGLE_RECTANGLE;
    }

    public void moveForward() {
        PointMatrix.DISTANCE_TO_VIEW *= 2;
        System.out.println("Move forward");
    }

    public void moveBackward() {
        PointMatrix.DISTANCE_TO_VIEW /= 2;
        System.out.println("Move backward");
    }

    public void moveLeft() {
        PointMatrix.DISTANCE_TO_VIEW *= 1.1;
        System.out.println("Move left");
    }

    public void moveRight() {
        PointMatrix.DISTANCE_TO_VIEW /= 1.1;
        System.out.println("Move right");
    }

    public void moveUp() {
        System.out.println("Move up");
    }

    public void moveDown() {
        System.out.println("Move down");
    }

    public void zoomIn() {
        System.out.println("Zoom in");
    }

    public void zoomOut() {
        System.out.println("Zoom out");
    }

    public void rotateClockwise() {
        System.out.println("Rotate clockwise");
    }

    public void rotateCounterclockwise() {
        System.out.println("Rotate counterclockwise");
    }

    public void lookUp() {
        System.out.println("Rotate backward (Look up)");
    }

    public void lookDown() {
        System.out.println("Rotate forward (Look down)");
    }

    public void lookRight() {
        System.out.println("Rotate right (Look right)");
    }

    public void lookLeft() {
        System.out.println("Rotate left (Look left)");
    }

    public void reset() {
        System.out.println("Reset view?");
    }
}
