package transformation.model;

public class Model {
    public final OriginMatrix origin;
    public final Rectangle rectangle;

    public Model() {
        origin = new OriginMatrix();
        rectangle = ModelConsts.SINGLE_RECTANGLE;
    }

    public void moveForward() {
        RectangleTranslator.moveForward(rectangle);
    }

    public void moveBackward() {
        RectangleTranslator.moveBackward(rectangle);
    }

    public void moveLeft() {
        RectangleTranslator.moveLeft(rectangle);
    }

    public void moveRight() {
        RectangleTranslator.moveRight(rectangle);
    }

    public void moveUp() {
        RectangleTranslator.moveUp(rectangle);
    }

    public void moveDown() {
        RectangleTranslator.moveDown(rectangle);
    }

    public void zoomIn() {
        RectangleScaler.zoomIn(rectangle);
    }

    public void zoomOut() {
        RectangleScaler.zoomOut(rectangle);
    }

    public void rotateClockwise() {
        RectangleRotator.rotateClockwise();
    }

    public void rotateCounterclockwise() {
        RectangleRotator.rotateCounterclockwise();
    }

    public void lookUp() {
        RectangleRotator.lookUp();
    }

    public void lookDown() {
        RectangleRotator.lookDown();
    }

    public void lookRight() {
        RectangleRotator.lookRight();
    }

    public void lookLeft() {
        RectangleRotator.lookLeft();
    }

    public void reset() {
        System.out.println("Reset view?");
    }
}
