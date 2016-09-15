package vanilla;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyLog {
    private static final Logger log = LoggerFactory.getLogger("CodeBeer");

    public void myInterestingMethod(final String something) {
        log.info(something);
    }
}
