package transformation.model;

public class Model {
    public final OriginMatrix origin;
    public final PointMatrix p1;
    public final PointMatrix p2;
    public final PointMatrix p3;

    public Model() {
        origin = new OriginMatrix();
        p1 = new PointMatrix(100, 200, 0);
        p2 = new PointMatrix(400, 400, 100);
        p3 = new PointMatrix(300, 300, 200);
    }
}
