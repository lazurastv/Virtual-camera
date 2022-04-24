package transformation.view;

import javax.swing.JFrame;

import transformation.controller.Controller;
import transformation.model.camera.Camera;

public class View extends JFrame {
    public View() {
        super("Wirtualna kamera");

        Camera camera = new Camera();
        Canvas canvas = new Canvas(camera);
        Controller controller = new Controller(this, camera);

        add(canvas);
        addKeyListener(controller);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
