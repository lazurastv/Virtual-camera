package transformation.model;

import java.awt.Graphics;

import org.ejml.simple.SimpleMatrix;

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

    public Rectangle(PointMatrix[] vertices) {
        this.vertices = vertices;
    }

    public Rectangle(Rectangle rectangle) {
        vertices = new PointMatrix[8];
        for (int i = 0; i < 8; i++) {
            PointMatrix vertex = rectangle.vertices[i];
            vertex.normalize();
            vertices[i] = new PointMatrix(vertex.getX(), vertex.getY(), vertex.getZ());
        }
    }

    private void connectVertices(int firstIndex, int secondIndex, Graphics g) {
        PointMatrix first = vertices[firstIndex];
        PointMatrix second = vertices[secondIndex];
        g.drawLine(first.projectX() + 250, first.projectY() + 250, second.projectX() + 250, second.projectY() + 250);
    }

    public void transform(SimpleMatrix matrix) {
        for (PointMatrix point : vertices) {
            point.set(matrix.mult(point));
            point.normalize();
        }
    }

    public void draw(Graphics g) {
        connectVertices(LEFT_DOWN_FRONT, LEFT_DOWN_BACK, g);
        connectVertices(LEFT_DOWN_FRONT, LEFT_UP_FRONT, g);
        connectVertices(LEFT_DOWN_FRONT, RIGHT_DOWN_FRONT, g);

        connectVertices(RIGHT_DOWN_BACK, RIGHT_DOWN_FRONT, g);
        connectVertices(RIGHT_DOWN_BACK, RIGHT_UP_BACK, g);
        connectVertices(RIGHT_DOWN_BACK, LEFT_DOWN_BACK, g);

        connectVertices(LEFT_UP_BACK, LEFT_UP_FRONT, g);
        connectVertices(LEFT_UP_BACK, LEFT_DOWN_BACK, g);
        connectVertices(LEFT_UP_BACK, RIGHT_UP_BACK, g);

        connectVertices(LEFT_UP_FRONT, LEFT_UP_BACK, g);
        connectVertices(LEFT_UP_FRONT, LEFT_DOWN_FRONT, g);
        connectVertices(LEFT_UP_FRONT, RIGHT_UP_FRONT, g);

        connectVertices(RIGHT_UP_FRONT, RIGHT_UP_BACK, g);
        connectVertices(RIGHT_UP_FRONT, RIGHT_DOWN_FRONT, g);
        connectVertices(RIGHT_UP_FRONT, LEFT_UP_FRONT, g);
    }

    @Override
    public String toString() {
        String result = "";
        for (PointMatrix point : vertices) {
            result += point + "\n";
        }
        return result;
    }
}
