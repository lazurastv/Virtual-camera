package transformation.view;

import javax.swing.JFrame;

import transformation.controller.Controller;

public class View extends JFrame {
    private final Canvas canvas;

    public View() {
        super("Wirtualna kamera");
        canvas = new Canvas();
        add(canvas);
        addKeyListener(new Controller());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
}
