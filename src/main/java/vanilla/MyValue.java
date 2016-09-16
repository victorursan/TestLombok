package vanilla;


public final class MyValue {
    private final String name;
    private final int age;
    protected final double score;

    @java.beans.ConstructorProperties({"name", "age", "score"})
    public MyValue(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getScore() {
        return this.score;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MyValue)) return false;
        final MyValue other = (MyValue) o;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getAge() != other.getAge()) return false;
        return Double.compare(this.getScore(), other.getScore()) == 0;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getAge();
        final long $score = Double.doubleToLongBits(this.getScore());
        result = result * PRIME + (int) ($score >>> 32 ^ $score);
        return result;
    }

    public String toString() {
        return "vanilla.MyValue(name=" + this.getName() + ", age=" + this.getAge() + ", score=" + this.getScore() + ")";
    }
}
