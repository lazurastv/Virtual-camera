package transformation.view;

import javax.swing.JFrame;

import transformation.controller.Controller;
import transformation.model.Model;

public class View extends JFrame {
    private final Canvas canvas;
    private final Model model;

    public View() {
        super("Wirtualna kamera");
        canvas = new Canvas();
        model = new Model();
        add(canvas);
        addKeyListener(new Controller(this, model));
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
