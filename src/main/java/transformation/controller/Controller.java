package transformation.controller;

import java.awt.event.KeyEvent;

import transformation.model.camera.Camera;
import transformation.model.camera.CameraOps;
import transformation.model.camera.ProjectionOps;
import transformation.view.View;

import java.awt.event.KeyAdapter;

public class Controller extends KeyAdapter {
    private final View view;
    private final Camera camera;

    public Controller(View view, Camera camera) {
        this.view = view;
        this.camera = camera;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getExtendedKeyCode()) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                camera.transformCamera(CameraOps.MoveForward);
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                camera.transformCamera(CameraOps.MoveBackward);
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                camera.transformCamera(CameraOps.MoveLeft);
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                camera.transformCamera(CameraOps.MoveRight);
                break;
            case KeyEvent.VK_SPACE:
                camera.transformCamera(CameraOps.MoveUp);
                break;
            case KeyEvent.VK_SHIFT:
                camera.transformCamera(CameraOps.MoveDown);
                break;
            case KeyEvent.VK_PLUS:
            case KeyEvent.VK_ADD:
                camera.transformProjection(ProjectionOps.ZoomIn);
                break;
            case KeyEvent.VK_MINUS:
            case KeyEvent.VK_SUBTRACT:
                camera.transformProjection(ProjectionOps.ZoomOut);
                break;
            case KeyEvent.VK_NUMPAD8:
                camera.transformCamera(CameraOps.LookUp);
                break;
            case KeyEvent.VK_NUMPAD5:
            case KeyEvent.VK_NUMPAD2:
                camera.transformCamera(CameraOps.LookDown);
                break;
            case KeyEvent.VK_NUMPAD6:
                camera.transformCamera(CameraOps.LookRight);
                break;
            case KeyEvent.VK_NUMPAD4:
                camera.transformCamera(CameraOps.LookLeft);
                break;
            case KeyEvent.VK_NUMPAD9:
            case KeyEvent.VK_NUMPAD3:
                camera.transformCamera(CameraOps.RotateClockwise);
                break;
            case KeyEvent.VK_NUMPAD7:
            case KeyEvent.VK_NUMPAD1:
                camera.transformCamera(CameraOps.RotateCounterclockwise);
                break;
            case KeyEvent.VK_BACK_SPACE:
                camera.reset();
                break;
            default:
                System.out.println(KeyEvent.getKeyText(e.getExtendedKeyCode()) + " does nothing");
        }
        view.repaint();
    }
}
