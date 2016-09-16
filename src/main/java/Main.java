import lombok.*;
import other.Shape;

import java.util.Arrays;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
//        testMyBuilder();
//        testMyData();
//        testMyEqualsAndHash();
//        testMyLazy();
//        testMyLog();
//        testMyOther();
//        testMyValue();

    }

    private static void testMyBuilder() {
        final MyBuilder myBuilder = MyBuilder.builder()
                .name("John")
                .age(10)
                .occupation("Dev")
                .occupation("QA")
                .occupation("Support")
                .clearOccupations()
                .occupations(Arrays.asList("dev", "qa"))
                .occupation("Support")
                .build();
        System.out.println(myBuilder.toString());
    }

    private static void testMyData() {
        final MyData myData = MyData.something("John", new double[]{1, 2, 3});
        myData.setAge(12);
        System.out.println(myData.toString());
    }

    private static void testMyEqualsAndHash() {
        final MyEqualsAndHash myEqualsAndHash1 =
                new MyEqualsAndHash(1, "a", 1.2, new Shape(1, 2), "a,b".split(","), 1);
        final MyEqualsAndHash myEqualsAndHash2 =
                new MyEqualsAndHash(1, "a", 1.2, new Shape(3, 2), "a,b".split(","), 12);
        System.out.println(myEqualsAndHash1.equals(myEqualsAndHash2));
    }

    private static void testMyLazy() {
        System.out.println(new Date().getTime());
        MyLazy myLazy = new MyLazy();
        System.out.println(new Date().getTime());
        System.out.println(Arrays.toString(myLazy.getCached()));
        System.out.println(new Date().getTime());
        System.out.println(Arrays.toString(myLazy.getCached()));
        System.out.println(new Date().getTime());
    }

    private static void testMyLog() {
        MyLog myLog = new MyLog();
        myLog.myInterestingMethod("something");
    }

    private static void testMyOther() {
        MyOthers myOthers = new MyOthers("a", 1.0, 2.3);
        try {
            myOthers.thisThrowsSomething();
        } catch (Exception e) {
            System.out.println(e.getClass().toString());
        }
        myOthers.mySpecialMethod("something");
    }

    private static void testMyValue() {
        val myValue1 = new MyValue("name", 1, 2.0);
        val myValue2 = new MyValue("name", 1, 2.0);

        System.out.println(myValue1.equals(myValue2));
    }
}
