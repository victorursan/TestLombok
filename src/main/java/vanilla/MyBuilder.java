package vanilla;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


public class MyBuilder {
    private String name;
    private int age;
    private Set<String> occupations;

    @java.beans.ConstructorProperties({"name", "age", "occupations"})
    MyBuilder(String name, int age, Set<String> occupations) {
        this.name = name;
        this.age = age;
        this.occupations = occupations;
    }

    public static MyBuilderBuilder builder() {
        return new MyBuilderBuilder();
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Set<String> getOccupations() {
        return this.occupations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupations(Set<String> occupations) {
        this.occupations = occupations;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MyBuilder)) return false;
        final MyBuilder other = (MyBuilder) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getAge() != other.getAge()) return false;
        final Object this$occupations = this.getOccupations();
        final Object other$occupations = other.getOccupations();
        if (this$occupations == null ? other$occupations != null : !this$occupations.equals(other$occupations))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getAge();
        final Object $occupations = this.getOccupations();
        result = result * PRIME + ($occupations == null ? 43 : $occupations.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MyBuilder;
    }

    public String toString() {
        return "vanilla.MyBuilder(name=" + this.getName() + ", age=" + this.getAge() + ", occupations=" + this.getOccupations() + ")";
    }

    public static class MyBuilderBuilder {
        private String name;
        private int age;
        private ArrayList<String> occupations;

        MyBuilderBuilder() {
        }

        public MyBuilderBuilder name(String name) {
            this.name = name;
            return this;
        }

        public MyBuilderBuilder age(int age) {
            this.age = age;
            return this;
        }

        public MyBuilderBuilder occupation(String occupation) {
            if (this.occupations == null) this.occupations = new ArrayList<String>();
            this.occupations.add(occupation);
            return this;
        }

        public MyBuilderBuilder occupations(Collection<? extends String> occupations) {
            if (this.occupations == null) this.occupations = new ArrayList<String>();
            this.occupations.addAll(occupations);
            return this;
        }

        public MyBuilderBuilder clearOccupations() {
            if (this.occupations != null)
                this.occupations.clear();

            return this;
        }

        public MyBuilder build() {
            Set<String> occupations;
            switch (this.occupations == null ? 0 : this.occupations.size()) {
                case 0:
                    occupations = java.util.Collections.emptySet();
                    break;
                case 1:
                    occupations = java.util.Collections.singleton(this.occupations.get(0));
                    break;
                default:
                    occupations = new java.util.LinkedHashSet<String>(this.occupations.size() < 1073741824 ? 1 + this.occupations.size() + (this.occupations.size() - 3) / 3 : Integer.MAX_VALUE);
                    occupations.addAll(this.occupations);
                    occupations = java.util.Collections.unmodifiableSet(occupations);
            }

            return new MyBuilder(name, age, occupations);
        }

        public String toString() {
            return "vanilla.MyBuilder.MyBuilderBuilder(name=" + this.name + ", age=" + this.age + ", occupations=" + this.occupations + ")";
        }
    }
}
