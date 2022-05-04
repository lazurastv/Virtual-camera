package transformation.model;

import java.awt.Graphics;

import org.ejml.simple.SimpleMatrix;

import transformation.model.camera.ProjectionMatrix;

public class Rectangle {
    private final int LEFT_DOWN_FRONT = 0;
    private final int LEFT_DOWN_BACK = 1;
    private final int LEFT_UP_FRONT = 2;
    private final int LEFT_UP_BACK = 3;
    private final int RIGHT_DOWN_FRONT = 4;
    private final int RIGHT_DOWN_BACK = 5;
    private final int RIGHT_UP_FRONT = 6;
    private final int RIGHT_UP_BACK = 7;

    private final PointMatrix[] vertices;

    public Rectangle(double leftX, double downY, double frontZ, double rightX, double upY, double backZ) {
        vertices = new PointMatrix[8];
        vertices[LEFT_DOWN_BACK] = new PointMatrix(leftX, downY, backZ);
        vertices[LEFT_DOWN_FRONT] = new PointMatrix(leftX, downY, frontZ);
        vertices[LEFT_UP_BACK] = new PointMatrix(leftX, upY, backZ);
        vertices[LEFT_UP_FRONT] = new PointMatrix(leftX, upY, frontZ);
        vertices[RIGHT_DOWN_BACK] = new PointMatrix(rightX, downY, backZ);
        vertices[RIGHT_DOWN_FRONT] = new PointMatrix(rightX, downY, frontZ);
        vertices[RIGHT_UP_BACK] = new PointMatrix(rightX, upY, backZ);
        vertices[RIGHT_UP_FRONT] = new PointMatrix(rightX, upY, frontZ);
    }

    public Rectangle(Rectangle rectangle) {
        vertices = new PointMatrix[8];
        for (int i = 0; i < 8; i++) {
            PointMatrix vertex = rectangle.vertices[i];
            vertex.normalize();
            vertices[i] = new PointMatrix(vertex.getX(), vertex.getY(), vertex.getZ());
        }
    }

    private void connectVertices(int firstIndex, int secondIndex, Graphics g, ProjectionMatrix projectMatrix) {
        PointMatrix first = vertices[firstIndex];
        PointMatrix second = vertices[secondIndex];
        double focalLength = projectMatrix.getFocalLenght();

        if (first.getZ() <= focalLength && second.getZ() <= focalLength) {
            return;
        }

        if (first.getZ() <= focalLength || second.getZ() <= focalLength) {
            double t = (focalLength - first.getZ()) / (second.getZ() - first.getZ());
            double x = first.getX() + (second.getX() - first.getX()) * t;
            double y = first.getY() + (second.getY() - first.getY()) * t;
            if (first.getZ() <= focalLength) {
                first = new PointMatrix(x, y, focalLength);
            } else {
                second = new PointMatrix(x, y, focalLength);
            }
        }

        first = first.transform(projectMatrix);
        second = second.transform(projectMatrix);
        g.drawLine(first.projectX(), first.projectY(), second.projectX(), second.projectY());
    }

    public void transform(SimpleMatrix matrix) {
        for (int i = 0; i < 8; i++) {
            vertices[i] = vertices[i].transform(matrix);
        }
    }

    public void draw(Graphics g, ProjectionMatrix matrix) {
        connectVertices(LEFT_DOWN_FRONT, LEFT_DOWN_BACK, g, matrix);
        connectVertices(LEFT_DOWN_FRONT, LEFT_UP_FRONT, g, matrix);
        connectVertices(LEFT_DOWN_FRONT, RIGHT_DOWN_FRONT, g, matrix);

        connectVertices(RIGHT_DOWN_BACK, RIGHT_DOWN_FRONT, g, matrix);
        connectVertices(RIGHT_DOWN_BACK, RIGHT_UP_BACK, g, matrix);
        connectVertices(RIGHT_DOWN_BACK, LEFT_DOWN_BACK, g, matrix);

        connectVertices(LEFT_UP_BACK, LEFT_UP_FRONT, g, matrix);
        connectVertices(LEFT_UP_BACK, LEFT_DOWN_BACK, g, matrix);
        connectVertices(LEFT_UP_BACK, RIGHT_UP_BACK, g, matrix);

        connectVertices(LEFT_UP_FRONT, LEFT_UP_BACK, g, matrix);
        connectVertices(LEFT_UP_FRONT, LEFT_DOWN_FRONT, g, matrix);
        connectVertices(LEFT_UP_FRONT, RIGHT_UP_FRONT, g, matrix);

        connectVertices(RIGHT_UP_FRONT, RIGHT_UP_BACK, g, matrix);
        connectVertices(RIGHT_UP_FRONT, RIGHT_DOWN_FRONT, g, matrix);
        connectVertices(RIGHT_UP_FRONT, LEFT_UP_FRONT, g, matrix);
    }
}
