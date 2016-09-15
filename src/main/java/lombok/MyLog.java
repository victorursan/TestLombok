package lombok;

import lombok.extern.slf4j.Slf4j;


@Slf4j(topic = "CodeBeer")
public class MyLog {
    public void myInterestingMethod(final String something) {
        log.info(something);
    }
}
