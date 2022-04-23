package transformation.model;

import org.ejml.simple.SimpleMatrix;

public class PointMatrix extends SimpleMatrix {
    public static double DISTANCE_TO_VIEW = 100;

    public PointMatrix(double x, double y, double z) {
        super(new double[][] {
                new double[] { x },
                new double[] { y },
                new double[] { z },
                new double[] { 1 },
        });
    }

    public int projectX() {
        int x = (int) (DISTANCE_TO_VIEW * getX());
        int z = getZ();
        return z > 0 ? x / z : x;
    }

    public int projectY() {
        int y = (int) (DISTANCE_TO_VIEW * getY());
        int z = getZ();
        return z > 0 ? y / z : y;
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

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")\n";
    }
}
