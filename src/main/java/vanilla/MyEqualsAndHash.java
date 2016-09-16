package vanilla;

import other.Shape;

import java.util.Arrays;


public class MyEqualsAndHash {
    private transient int transientVar = 10;
    private String name;
    private double score;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    private int id;

    @java.beans.ConstructorProperties({"transientVar", "name", "score", "shape", "tags", "id"})
    public MyEqualsAndHash(int transientVar, String name, double score, Shape shape, String[] tags, int id) {
        this.transientVar = transientVar;
        this.name = name;
        this.score = score;
        this.shape = shape;
        this.tags = tags;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MyEqualsAndHash)) return false;
        final MyEqualsAndHash other = (MyEqualsAndHash) o;
        if (!other.canEqual(this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (Double.compare(this.score, other.score) != 0) return false;
        if (!java.util.Arrays.deepEquals(this.tags, other.tags)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final long $score = Double.doubleToLongBits(this.score);
        result = result * PRIME + (int) ($score >>> 32 ^ $score);
        result = result * PRIME + Arrays.deepHashCode(this.tags);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MyEqualsAndHash;
    }

    public String toString() {
        return "vanila.MyEqualsAndHash(transientVar=" + this.transientVar + ", name=" + this.getName() + ", score=" + this.score + ", tags=" + java.util.Arrays.deepToString(this.tags) + ", id=" + this.id + ")";
    }

    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            super(width, height);
            this.width = width;
            this.height = height;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Square)) return false;
            final Square other = (Square) o;
            if (!other.canEqual(this)) return false;
            if (!super.equals(o)) return false;
            if (this.width != other.width) return false;
            return this.height == other.height;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + super.hashCode();
            result = result * PRIME + this.width;
            return result * PRIME + this.height;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Square;
        }

        public String toString() {
            return "vanilla.MyEqualsAndHash.Square(super=" + super.toString() + ", width=" + this.width + ", height=" + this.height + ")";
        }
    }
}
