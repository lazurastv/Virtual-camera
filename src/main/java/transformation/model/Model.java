package transformation.model;

public class Model {
    public final OriginMatrix origin;
    public Rectangle rectangle;

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
        RectangleRotator.rotateClockwise(rectangle);
    }

    public void rotateCounterclockwise() {
        RectangleRotator.rotateCounterclockwise(rectangle);
    }

    public void lookUp() {
        RectangleRotator.lookUp(rectangle);
    }

    public void lookDown() {
        RectangleRotator.lookDown(rectangle);
    }

    public void lookRight() {
        RectangleRotator.lookRight(rectangle);
    }

    public void lookLeft() {
        RectangleRotator.lookLeft(rectangle);
    }

    public void reset() {
        rectangle = ModelConsts.SINGLE_RECTANGLE;
    }
}
