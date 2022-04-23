package transformation.view;

import javax.swing.JFrame;

public class View extends JFrame {
    private final Canvas canvas;

    public View() {
        canvas = new Canvas();
        add(canvas);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
}
