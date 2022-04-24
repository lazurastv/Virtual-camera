package transformation.view;

import javax.swing.JFrame;

import transformation.controller.Controller;
import transformation.model.Model;

public class View extends JFrame {
    public View() {
        super("Wirtualna kamera");

        Model model = new Model();
        Canvas canvas = new Canvas(model);
        Controller controller = new Controller(this, model);

        add(canvas);
        addKeyListener(controller);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
