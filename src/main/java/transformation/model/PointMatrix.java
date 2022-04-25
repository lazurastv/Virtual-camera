package transformation.model;

import org.ejml.simple.SimpleMatrix;

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
        return (int) getX();
    }

    public int projectY() {
        return (int) getY();
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

    public double getF() {
        return get(3, 0);
    }

    public void normalize() {
        if (getZ() > 0) {
            for (int i = 0; i < 4; i++) {
                set(i, 0, get(i, 0) / getF());
            }
        }
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ", " + getF() + ")";
    }
}
