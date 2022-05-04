package transformation.model;

import org.ejml.simple.SimpleMatrix;

import transformation.view.Canvas;

public class PointMatrix extends SimpleMatrix {
    public PointMatrix(double x, double y, double z) {
        super(new double[][] {
                new double[] { x },
                new double[] { y },
                new double[] { z },
                new double[] { 1 },
        });
    }

    public int projectX() {
        return (int) getX() + Canvas.WIDTH / 2;
    }

    public int projectY() {
        return (int) getY() + Canvas.HEIGHT / 2;
    }

    public double getX() {
        return get(0, 0);
    }

    public double getY() {
        return get(1, 0);
    }

    public double getZ() {
        return get(2, 0);
    }

    private double getW() {
        return get(3, 0);
    }

    public PointMatrix transform(SimpleMatrix matrix) {
        PointMatrix result = new PointMatrix(0, 0, 0);
        result.set(matrix.mult(this));
        result.normalize();
        return result;
    }

    public void normalize() {
        set(divide(getW()));
    }
}
