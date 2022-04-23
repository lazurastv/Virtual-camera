package transformation.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Controller extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getExtendedKeyCode()) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                System.out.println("Move forward");
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                System.out.println("Move backward");
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                System.out.println("Move left");
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                System.out.println("Move right");
                break;
            case KeyEvent.VK_SPACE:
                System.out.println("Move up");
                break;
            case KeyEvent.VK_SHIFT:
                System.out.println("Move down");
                break;
            case KeyEvent.VK_PLUS:
            case KeyEvent.VK_ADD:
                System.out.println("Zoom in");
                break;
            case KeyEvent.VK_MINUS:
            case KeyEvent.VK_SUBTRACT:
                System.out.println("Zoom out");
                break;
            case KeyEvent.VK_NUMPAD8:
                System.out.println("Rotate backward (Look up)");
                break;
            case KeyEvent.VK_NUMPAD2:
                System.out.println("Rotate forward (Look down)");
                break;
            case KeyEvent.VK_NUMPAD6:
                System.out.println("Rotate right (Look right)");
                break;
            case KeyEvent.VK_NUMPAD4:
                System.out.println("Rotate left (Look left)");
                break;
            case KeyEvent.VK_NUMPAD9:
            case KeyEvent.VK_NUMPAD1:
                System.out.println("Rotate clockwise");
                break;
            case KeyEvent.VK_NUMPAD7:
            case KeyEvent.VK_NUMPAD3:
                System.out.println("Rotate counterclockwise");
                break;
            case KeyEvent.VK_NUMPAD5:
                System.out.println("Reset view?");
                break;
            default:
                System.out.println("Do nothing " + e.getExtendedKeyCode());
        }
    }
}
