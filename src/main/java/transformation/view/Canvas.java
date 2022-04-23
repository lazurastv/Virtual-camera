package transformation.view;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Dimension;

import transformation.model.Model;

public class Canvas extends JComponent {
    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    private final Model model;

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
        model.rectangle.draw(g);
    }
}
