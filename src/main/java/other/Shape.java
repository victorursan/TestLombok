package other;

/**
 * Created by victor on 9/15/16.
 */
public class Shape {
    private final int width, height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Shape)) return false;
        final Shape other = (Shape) o;
        if (!other.canEqual(this)) return false;
        if (this.width != other.width) return false;
        if (this.height != other.height) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.width;
        result = result * PRIME + this.height;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Shape;
    }
}
