package test;

import org.testng.annotations.Test;

public class Introduction {

    // in TestNG, every method is treated as a test case
    @Test
    public void Demo() {
        System.out.println("Intro - test 1");
    }

    @Test
    public void TestCase2() { System.out.println("Intro - test 2"); }
}
