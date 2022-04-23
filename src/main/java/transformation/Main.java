package transformation;

import transformation.view.View;

public class Main {
    public final Model model;
    public final View view;
    public final Controller controller;

    public Main() {
        model = new Model();
        view = new View();
        controller = new Controller();
    }

    public void start() {
        view.setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
