package lombok;

import java.util.Set;


@Builder
@Data
public class MyBuilder {
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
}
