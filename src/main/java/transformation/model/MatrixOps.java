package transformation.model;

import org.ejml.simple.SimpleMatrix;

public abstract class MatrixOps {

    public static void translate(PointMatrix point, double x, double y, double z) {
        point.set(new SimpleMatrix(new double[][] {
                new double[] { 1, 0, 0, x },
                new double[] { 0, 1, 0, y },
                new double[] { 0, 0, 1, z },
                new double[] { 0, 0, 0, 1 },
        }).mult(point));
    }

    public static void rotateX(PointMatrix point, double angle) {
        point.set(new SimpleMatrix(new double[][] {
                new double[] { 1, 0, 0, 0 },
                new double[] { 0, Math.cos(angle), -Math.sin(angle), 0 },
                new double[] { 0, Math.sin(angle), Math.cos(angle), 0 },
                new double[] { 0, 0, 0, 1 },
        }).mult(point));
    }

    public static void rotateY(PointMatrix point, double angle) {
        point.set(new SimpleMatrix(new double[][] {
                new double[] { Math.cos(angle), 0, Math.sin(angle), 0 },
                new double[] { 0, 1, 0, 0 },
                new double[] { -Math.sin(angle), 0, Math.cos(angle), 0 },
                new double[] { 0, 0, 0, 1 },
        }).mult(point));
    }

    public static void rotateZ(PointMatrix point, double angle) {
        point.set(new SimpleMatrix(new double[][] {
                new double[] { Math.cos(angle), -Math.sin(angle), 0, 0 },
                new double[] { Math.sin(angle), Math.cos(angle), 0, 0 },
                new double[] { 0, 0, 1, 0 },
                new double[] { 0, 0, 0, 1 },
        }).mult(point));
    }

    public static void scale(PointMatrix point, double x, double y, double z) {
        point.set(new SimpleMatrix(new double[][] {
                new double[] { x, 0, 0, 0 },
                new double[] { 0, y, 0, 0 },
                new double[] { 0, 0, z, 0 },
                new double[] { 0, 0, 0, 1 },
        }).mult(point));
    }
}
