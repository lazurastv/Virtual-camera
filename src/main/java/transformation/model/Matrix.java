package transformation.model;

import org.ejml.simple.SimpleMatrix;

public class Matrix {
    private final SimpleMatrix matrix;

    public Matrix(double x, double y, double z) {
        matrix = new SimpleMatrix(new double[][] {
                new double[] { x },
                new double[] { y },
                new double[] { z },
                new double[] { 1d },
        });
    }

    public int getX() {
        return (int) matrix.get(0, 0);
    }

    public int getY() {
        return (int) matrix.get(1, 0);
    }
}
