package transformation.model;

import org.ejml.simple.SimpleMatrix;

public class PointMatrix extends SimpleMatrix {
    public PointMatrix(double x, double y, double z) {
        super(new double[][] {
                new double[] { x },
                new double[] { y },
                new double[] { z },
                new double[] { 1d },
        });
    }

    public int getX() {
        return (int) get(0, 0);
    }

    public int getY() {
        return (int) get(1, 0);
    }
}
