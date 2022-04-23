package transformation.model;

public class Model {
    public final OriginMatrix origin;
    public final PointMatrix p1;
    public final PointMatrix p2;
    public final PointMatrix p3;

    public Model() {
        origin = new OriginMatrix();
        p1 = new PointMatrix(300, 499, 499);
        p2 = new PointMatrix(200, 200, 200);
        p3 = new PointMatrix(400, 100, 300);
    }

    public void moveForward() {
        System.out.println("Move forward");
    }

    public void moveBackward() {
        System.out.println("Move backward");
    }

    public void moveLeft() {
        System.out.println("Move left");
    }

    public void moveRight() {
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
