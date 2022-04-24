package transformation.model;

public abstract class Scene {
        public static final Rectangle RIGHT_FRONT_HOUSE = new Rectangle(new PointMatrix[] {
                        new PointMatrix(200, 100, 400),
                        new PointMatrix(200, 100, 800),
                        new PointMatrix(200, 1000, 400),
                        new PointMatrix(200, 1000, 800),
                        new PointMatrix(600, 100, 400),
                        new PointMatrix(600, 100, 800),
                        new PointMatrix(600, 1000, 400),
                        new PointMatrix(600, 1000, 800)
        });

        public static final Rectangle RIGHT_BACK_HOUSE = new Rectangle(new PointMatrix[] {
                        new PointMatrix(400, 100, 2000),
                        new PointMatrix(400, 100, 2500),
                        new PointMatrix(400, 2000, 2000),
                        new PointMatrix(400, 2000, 2500),
                        new PointMatrix(900, 100, 2000),
                        new PointMatrix(900, 100, 2500),
                        new PointMatrix(900, 2000, 2000),
                        new PointMatrix(900, 2000, 2500)
        });

        public static final Rectangle LEFT_FRONT_HOUSE = new Rectangle(new PointMatrix[] {
                        new PointMatrix(-1200, 100, 300),
                        new PointMatrix(-1200, 100, 1000),
                        new PointMatrix(-1200, 1300, 300),
                        new PointMatrix(-1200, 1300, 1000),
                        new PointMatrix(-400, 100, 300),
                        new PointMatrix(-400, 100, 1000),
                        new PointMatrix(-400, 1300, 300),
                        new PointMatrix(-400, 1300, 1000)
        });

        public static final Rectangle LEFT_BACK_HOUSE = new Rectangle(new PointMatrix[] {
                        new PointMatrix(-2500, 100, 1200),
                        new PointMatrix(-2500, 100, 1500),
                        new PointMatrix(-2500, 500, 1200),
                        new PointMatrix(-2500, 500, 1500),
                        new PointMatrix(-1000, 100, 1200),
                        new PointMatrix(-1000, 100, 1500),
                        new PointMatrix(-1000, 500, 1200),
                        new PointMatrix(-1000, 500, 1500)
        });

        public static final Rectangle[] DEFAULT_VIEW = new Rectangle[] {
                        LEFT_FRONT_HOUSE,
                        LEFT_BACK_HOUSE,
                        RIGHT_FRONT_HOUSE,
                        RIGHT_BACK_HOUSE
        };
}
