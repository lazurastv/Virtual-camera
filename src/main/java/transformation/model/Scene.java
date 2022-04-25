package transformation.model;

public abstract class Scene {
        public static final Rectangle RIGHT_FRONT_HOUSE = new Rectangle(500, 600, 3400, 900, -400, 3800);

        public static final Rectangle RIGHT_BACK_HOUSE = new Rectangle(700, 600, 5000, 1200, -1400, 5500);

        public static final Rectangle LEFT_FRONT_HOUSE = new Rectangle(-900, 600, 3300, -100, -700, 4000);

        public static final Rectangle LEFT_BACK_HOUSE = new Rectangle(-2200, 600, 4200, -700, 100, 4500);

        public static final Rectangle[] DEFAULT_VIEW = new Rectangle[] {
                        LEFT_FRONT_HOUSE,
                        LEFT_BACK_HOUSE,
                        RIGHT_FRONT_HOUSE,
                        RIGHT_BACK_HOUSE
        };
}
