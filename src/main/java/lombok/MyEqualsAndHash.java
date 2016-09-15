package lombok;

import other.Shape;


@EqualsAndHashCode(exclude = {"id", "shape"})
@ToString(exclude = "shape")
@AllArgsConstructor
public class MyEqualsAndHash {
    private transient int transientVar = 10;
    private String name;
    private double score;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    private int id;

    public String getName() {
        return this.name;
    }

    @EqualsAndHashCode(callSuper = true)
    @ToString(callSuper = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            super(width, height);
            this.width = width;
            this.height = height;
        }
    }
}
