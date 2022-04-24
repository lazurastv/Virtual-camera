package transformation.model;

public abstract class Scene {
        public static final Rectangle RIGHT_FRONT_HOUSE = new Rectangle(200, 600, 400, 600, -400, 800);

        public static final Rectangle RIGHT_BACK_HOUSE = new Rectangle(400, 600, 2000, 900, -1400, 2500);

        public static final Rectangle LEFT_FRONT_HOUSE = new Rectangle(-1200, 600, 300, -400, -700, 1000);

        public static final Rectangle LEFT_BACK_HOUSE = new Rectangle(-2500, 600, 1200, -1000, 100, 1500);

        public static final Rectangle[] DEFAULT_VIEW = new Rectangle[] {
                        LEFT_FRONT_HOUSE,
                        LEFT_BACK_HOUSE,
                        RIGHT_FRONT_HOUSE,
                        RIGHT_BACK_HOUSE
        };
}
