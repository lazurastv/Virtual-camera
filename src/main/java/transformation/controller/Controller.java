package transformation.controller;

import java.awt.event.KeyEvent;

import transformation.model.Model;
import transformation.model.Camera.CameraOps;
import transformation.model.Camera.ProjectionOps;
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
                model.tranformCamera(CameraOps.MoveForward);
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                model.tranformCamera(CameraOps.MoveBackward);
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                model.tranformCamera(CameraOps.MoveLeft);
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                model.tranformCamera(CameraOps.MoveRight);
                break;
            case KeyEvent.VK_SPACE:
                model.tranformCamera(CameraOps.MoveUp);
                break;
            case KeyEvent.VK_SHIFT:
                model.tranformCamera(CameraOps.MoveDown);
                break;
            case KeyEvent.VK_PLUS:
            case KeyEvent.VK_ADD:
                model.transformProjection(ProjectionOps.ZoomIn);
                break;
            case KeyEvent.VK_MINUS:
            case KeyEvent.VK_SUBTRACT:
                model.transformProjection(ProjectionOps.ZoomOut);
                break;
            case KeyEvent.VK_NUMPAD8:
                model.tranformCamera(CameraOps.LookUp);
                break;
            case KeyEvent.VK_NUMPAD5:
            case KeyEvent.VK_NUMPAD2:
                model.tranformCamera(CameraOps.LookDown);
                break;
            case KeyEvent.VK_NUMPAD6:
                model.tranformCamera(CameraOps.LookRight);
                break;
            case KeyEvent.VK_NUMPAD4:
                model.tranformCamera(CameraOps.LookLeft);
                break;
            case KeyEvent.VK_NUMPAD9:
            case KeyEvent.VK_NUMPAD3:
                model.tranformCamera(CameraOps.RotateClockwise);
                break;
            case KeyEvent.VK_NUMPAD7:
            case KeyEvent.VK_NUMPAD1:
                model.tranformCamera(CameraOps.RotateCounterclockwise);
                break;
            case KeyEvent.VK_BACK_SPACE:
                model.reset();
                break;
            default:
                System.out.println(KeyEvent.getKeyText(e.getExtendedKeyCode()) + " does nothing");
        }
        view.repaint();
    }
}
