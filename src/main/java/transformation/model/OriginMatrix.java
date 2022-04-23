package transformation.model;

import org.ejml.simple.SimpleMatrix;

public class OriginMatrix extends SimpleMatrix {
    public OriginMatrix() {
        super(new double[][] {
                new double[] { 1, 0, 0 },
                new double[] { 0, 1, 0 },
                new double[] { 0, 0, 1 }
        });
    }
}
