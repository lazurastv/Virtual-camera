package transformation.model;

public class Model {
    public final OriginMatrix origin;
    public Rectangle[] rectangles;

    public Model() {
        origin = new OriginMatrix();
        rectangles = ModelConsts.DEFAULT_VIEW;
    }

    public void moveForward() {
        for (Rectangle rectangle : rectangles) {
            RectangleTranslator.moveForward(rectangle);
        }
    }

    public void moveBackward() {
        for (Rectangle rectangle : rectangles) {
            RectangleTranslator.moveBackward(rectangle);
        }
    }

    public void moveLeft() {
        for (Rectangle rectangle : rectangles) {
            RectangleTranslator.moveLeft(rectangle);
        }
    }

    public void moveRight() {
        for (Rectangle rectangle : rectangles) {
            RectangleTranslator.moveRight(rectangle);
        }
    }

    public void moveUp() {
        for (Rectangle rectangle : rectangles) {
            RectangleTranslator.moveUp(rectangle);
        }
    }

    public void moveDown() {
        for (Rectangle rectangle : rectangles) {
            RectangleTranslator.moveDown(rectangle);
        }
    }

    public void zoomIn() {
        PointMatrix.DISTANCE_TO_VIEW *= 1.1;
    }

    public void zoomOut() {
        PointMatrix.DISTANCE_TO_VIEW /= 1.1;
    }

    public void rotateClockwise() {
        for (Rectangle rectangle : rectangles) {
            RectangleRotator.rotateClockwise(rectangle);
        }
    }

    public void rotateCounterclockwise() {
        for (Rectangle rectangle : rectangles) {
            RectangleRotator.rotateCounterclockwise(rectangle);
        }
    }

    public void lookUp() {
        for (Rectangle rectangle : rectangles) {
            RectangleRotator.lookUp(rectangle);
        }
    }

    public void lookDown() {
        for (Rectangle rectangle : rectangles) {
            RectangleRotator.lookDown(rectangle);
        }
    }

    public void lookRight() {
        for (Rectangle rectangle : rectangles) {
            RectangleRotator.lookRight(rectangle);
        }
    }

    public void lookLeft() {
        for (Rectangle rectangle : rectangles) {
            RectangleRotator.lookLeft(rectangle);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Rectangle rectangle : rectangles) {
            for (PointMatrix point : rectangle.vertices) {
                result += point.toString();
            }
        }
        return result;
    }
}
