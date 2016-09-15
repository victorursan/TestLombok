package vanilla;

import java.util.Arrays;
import java.util.List;


public class MyOthers {
    private final String a;
    private Double b;
    private Double c;

    @java.beans.ConstructorProperties({"a"})
    public MyOthers(String a) {
        this.a = a;
    }

    @java.beans.ConstructorProperties({"a", "b", "c"})
    public MyOthers(String a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void mySpecialMethod(final String something) {
        final List<String> myList = Arrays.asList(a, something);
        System.out.println(String.format("%s,%s", myList.getClass().toString(), myList.toString()));
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setC(Double c) {
        this.c = c;
    }

    protected Double getB() {
        return this.b;
    }

    Double getC() {
        return this.c;
    }
}
