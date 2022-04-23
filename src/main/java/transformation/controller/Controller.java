package transformation.controller;

import java.awt.event.KeyEvent;

import transformation.model.Model;
import transformation.view.View;

import java.awt.event.KeyAdapter;

public class Controller extends KeyAdapter {
    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getExtendedKeyCode()) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                model.moveForward();
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                model.moveBackward();
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                model.moveLeft();
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                model.moveRight();
                break;
            case KeyEvent.VK_SPACE:
                model.moveUp();
                break;
            case KeyEvent.VK_SHIFT:
                model.moveDown();
                break;
            case KeyEvent.VK_PLUS:
            case KeyEvent.VK_ADD:
                model.zoomIn();
                break;
            case KeyEvent.VK_MINUS:
            case KeyEvent.VK_SUBTRACT:
                model.zoomOut();
                break;
            case KeyEvent.VK_NUMPAD8:
                model.lookUp();
                break;
            case KeyEvent.VK_NUMPAD2:
                model.lookDown();
                break;
            case KeyEvent.VK_NUMPAD6:
                model.lookRight();
                break;
            case KeyEvent.VK_NUMPAD4:
                model.lookLeft();
                break;
            case KeyEvent.VK_NUMPAD9:
            case KeyEvent.VK_NUMPAD1:
                model.rotateClockwise();
                break;
            case KeyEvent.VK_NUMPAD7:
            case KeyEvent.VK_NUMPAD3:
                model.rotateCounterclockwise();
                break;
            case KeyEvent.VK_NUMPAD5:
                model.reset();
                break;
            default:
                System.out.println(KeyEvent.getKeyText(e.getExtendedKeyCode()) + " does nothing");
        }
        view.repaint();
    }
}
