package transformation.model.camera;

import org.ejml.simple.SimpleMatrix;

public class CameraMatrix extends SimpleMatrix {
    private static final double DEFAULT_SHIFT = 100;
    private static final double DEFAULT_ANGLE = Math.PI / 30;

    private enum RotationAxis {
        X, Y, Z
    }

    public CameraMatrix() {
        super(SimpleMatrix.identity(4));
    }

    private SimpleMatrix getTranslationMatrx(double x, double y, double z) {
        return new SimpleMatrix(new double[][] {
                new double[] { 1, 0, 0, x },
                new double[] { 0, 1, 0, y },
                new double[] { 0, 0, 1, z },
                new double[] { 0, 0, 0, 1 },
        });
    }

    private SimpleMatrix getRotationMatrix(double angle, RotationAxis axis) {
        switch (axis) {
            case X:
                return new SimpleMatrix(new double[][] {
                        new double[] { 1, 0, 0, 0 },
                        new double[] { 0, Math.cos(angle), -Math.sin(angle), 0 },
                        new double[] { 0, Math.sin(angle), Math.cos(angle), 0 },
                        new double[] { 0, 0, 0, 1 },
                });
            case Y:
                return new SimpleMatrix(new double[][] {
                        new double[] { Math.cos(angle), 0, Math.sin(angle), 0 },
                        new double[] { 0, 1, 0, 0 },
                        new double[] { -Math.sin(angle), 0, Math.cos(angle), 0 },
                        new double[] { 0, 0, 0, 1 },
                });
            case Z:
                return new SimpleMatrix(new double[][] {
                        new double[] { Math.cos(angle), -Math.sin(angle), 0, 0 },
                        new double[] { Math.sin(angle), Math.cos(angle), 0, 0 },
                        new double[] { 0, 0, 1, 0 },
                        new double[] { 0, 0, 0, 1 },
                });
            default:
                throw new RuntimeException();
        }
    }

    private SimpleMatrix getScalingMatrix(double x, double y, double z) {
        return new SimpleMatrix(new double[][] {
                new double[] { x, 0, 0, 0 },
                new double[] { 0, y, 0, 0 },
                new double[] { 0, 0, z, 0 },
                new double[] { 0, 0, 0, 1 },
        });
    }

    private void translate(double x, double y, double z) {
        set(getTranslationMatrx(x, y, z).mult(this));
    }

    private void rotateX(double angle) {
        set(getRotationMatrix(angle, RotationAxis.X).mult(this));
    }

    private void rotateY(double angle) {
        set(getRotationMatrix(angle, RotationAxis.Y).mult(this));
    }

    private void rotateZ(double angle) {
        set(getRotationMatrix(angle, RotationAxis.Z).mult(this));
    }

    private void scale(double x, double y, double z) {
        set(getScalingMatrix(x, y, z).mult(this));
    }

    public void transform(CameraOps operation) {
        switch (operation) {
            case MoveForward:
                translate(0, 0, -DEFAULT_SHIFT);
                break;
            case MoveBackward:
                translate(0, 0, DEFAULT_SHIFT);
                break;
            case MoveDown:
                translate(0, -DEFAULT_SHIFT, 0);
                break;
            case MoveLeft:
                translate(DEFAULT_SHIFT, 0, 0);
                break;
            case MoveRight:
                translate(-DEFAULT_SHIFT, 0, 0);
                break;
            case MoveUp:
                translate(0, DEFAULT_SHIFT, 0);
                break;
            case LookDown:
                rotateX(DEFAULT_ANGLE);
                break;
            case LookLeft:
                rotateY(DEFAULT_ANGLE);
                break;
            case LookRight:
                rotateY(-DEFAULT_ANGLE);
                break;
            case LookUp:
                rotateX(-DEFAULT_ANGLE);
                break;
            case RotateClockwise:
                rotateZ(DEFAULT_ANGLE);
                break;
            case RotateCounterclockwise:
                rotateZ(-DEFAULT_ANGLE);
                break;
            default:
                break;
        }
    }
}
