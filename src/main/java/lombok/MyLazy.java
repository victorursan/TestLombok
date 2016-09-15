package lombok;


public class MyLazy {
    @Getter(lazy = true)
    private final double[] cached = expensive();

    private double[] expensive() {
        double[] result = new double[100000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return new double[]{1};
    }
}