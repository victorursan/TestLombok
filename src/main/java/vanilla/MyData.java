package vanilla;

import java.util.Arrays;


public class MyData {
    private final String name;
    private int age;
    private final double[] scores;

    @java.beans.ConstructorProperties({"name", "scores"})
    private MyData(String name, double[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public static MyData something(String name, double[] scores) {
        return new MyData(name, scores);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double[] getScores() {
        return this.scores;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MyData)) return false;
        final MyData other = (MyData) o;
        if (!other.canEqual(this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getAge() != other.getAge()) return false;
        if (!Arrays.equals(this.getScores(), other.getScores())) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getAge();
        result = result * PRIME + Arrays.hashCode(this.getScores());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MyData;
    }

    public String toString() {
        return "vanilla.MyData(name=" + this.getName() + ", age=" + this.getAge() + ", scores=" +
                java.util.Arrays.toString(this.getScores()) + ")";
    }
}
