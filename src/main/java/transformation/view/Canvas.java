package transformation.view;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Dimension;

import org.ejml.simple.SimpleMatrix;

public class Canvas extends JComponent {
    private final SimpleMatrix p1;
    private final SimpleMatrix p2;
    private final SimpleMatrix p3;
    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    public Canvas() {
        p1 = new SimpleMatrix(new double[][] {
                new double[] { 100d },
                new double[] { 200d },
                new double[] { 0d },
                new double[] { 1d },
        });

        p2 = new SimpleMatrix(new double[][] {
                new double[] { 400d },
                new double[] { 400d },
                new double[] { 100d },
                new double[] { 1d },
        });

        p3 = new SimpleMatrix(new double[][] {
                new double[] { 300d },
                new double[] { 300d },
                new double[] { 200d },
                new double[] { 1d },
        });
    }

    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.drawLine((int) p1.get(0, 0), (int) p1.get(1, 0), (int) p2.get(0, 0), (int) p2.get(1, 0));
        g.drawLine((int) p1.get(0, 0), (int) p1.get(1, 0), (int) p3.get(0, 0), (int) p3.get(1, 0));
        g.drawLine((int) p2.get(0, 0), (int) p2.get(1, 0), (int) p3.get(0, 0), (int) p3.get(1, 0));
    }
}
