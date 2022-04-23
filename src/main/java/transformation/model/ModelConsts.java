package transformation.model;

public abstract class ModelConsts {
    public static final Rectangle SINGLE_RECTANGLE = new Rectangle(new PointMatrix[] {
            new PointMatrix(100, 100, 100),
            new PointMatrix(100, 100, 400),
            new PointMatrix(100, 400, 100),
            new PointMatrix(100, 400, 400),
            new PointMatrix(400, 100, 100),
            new PointMatrix(400, 100, 400),
            new PointMatrix(400, 400, 100),
            new PointMatrix(400, 400, 400),
    });
}
