package transformation.view;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Dimension;

import transformation.model.Model;

public class Canvas extends JComponent {
    private final Model model;
    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    public Canvas() {
        model = new Model();
    }

    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.drawLine(model.p1.getX(), model.p1.getY(), model.p2.getX(), model.p2.getY());
        g.drawLine(model.p1.getX(), model.p1.getY(), model.p3.getX(), model.p3.getY());
        g.drawLine(model.p2.getX(), model.p2.getY(), model.p3.getX(), model.p3.getY());
    }
}
