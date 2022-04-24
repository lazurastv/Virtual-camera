package transformation.view;

import javax.swing.JComponent;

import transformation.model.camera.Camera;

import java.awt.Graphics;
import java.awt.Dimension;

public class Canvas extends JComponent {
    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    private final Camera camera;

    public Canvas(Camera camera) {
        this.camera = camera;
    }

    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.clearRect(0, 0, WIDTH, HEIGHT);
        camera.draw(g);
    }
}
