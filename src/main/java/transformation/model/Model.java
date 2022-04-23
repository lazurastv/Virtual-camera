package transformation.model;

public class Model {
    public final Matrix p1;
    public final Matrix p2;
    public final Matrix p3;

    public Model() {
        p1 = new Matrix(100, 200, 0);
        p2 = new Matrix(400, 400, 100);
        p3 = new Matrix(300, 300, 200);
    }
}
