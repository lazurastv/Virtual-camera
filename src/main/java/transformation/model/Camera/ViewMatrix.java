package transformation.model.Camera;

import org.ejml.simple.SimpleMatrix;

public class ViewMatrix extends SimpleMatrix {
    public ViewMatrix() {
        super(SimpleMatrix.identity(4));
    }

    public void reset() {
        set(SimpleMatrix.identity(4));
    }
}
