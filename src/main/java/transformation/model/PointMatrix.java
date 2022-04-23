package transformation.model;

import org.ejml.simple.SimpleMatrix;

public class PointMatrix extends SimpleMatrix {
    public static double DISTANCE_TO_VIEW = 1.0;

    public PointMatrix(double x, double y, double z) {
        super(new double[][] {
                new double[] { x },
                new double[] { y },
                new double[] { z },
                new double[] { 1d },
        });
    }

    public int projectX() {
        return (int) (DISTANCE_TO_VIEW * getX() / getZ());
    }

    public int projectY() {
        return (int) (DISTANCE_TO_VIEW * getY() / getZ());
    }

    public int getX() {
        return (int) get(0, 0);
    }

    public int getY() {
        return (int) get(1, 0);
    }

    public int getZ() {
        return (int) get(2, 0);
    }
}
