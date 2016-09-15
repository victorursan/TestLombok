package lombok;


@Data(staticConstructor = "something")
public class MyData {
    private final String name;
    private int age;
    private final double[] scores;
}
