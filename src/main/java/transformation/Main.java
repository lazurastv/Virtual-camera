package transformation;

import transformation.view.View;

public class Main {
    public final View view;

    public Main() {
        view = new View();
    }

    public void start() {
        view.setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
