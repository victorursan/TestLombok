package lombok;

import java.io.IOException;
import java.util.Arrays;


@RequiredArgsConstructor
@AllArgsConstructor
@Setter
public class MyOthers {
    private final String a;
    @Getter(value = AccessLevel.PROTECTED)
    private Double b;
    @Getter(value = AccessLevel.MODULE)
    private Double c;

    public void mySpecialMethod(final String something) {
        val myList = Arrays.asList(a, something);
        System.out.println(String.format("%s,%s", myList.getClass().toString(), myList.toString()));
    }

    @SneakyThrows
    public void thisThrowsSomething() {
        throw new IOException();
    }
}
