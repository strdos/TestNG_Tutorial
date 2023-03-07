package test;

import org.testng.annotations.*;

public class Module2 {
    @Parameters({"url"})
    @Test (groups = "Smoke")
    public void test1(String url) {
        System.out.println("module 2 - test 1");
        System.out.println(url);
    }
    @BeforeTest
    public void runPrerequisiteAction() { System.out.println("prerequisite action");}

    @AfterTest
    public void runTestCleanup() { System.out.println("clean up after test");}
    @AfterSuite
    public void runSuiteCleanup() { System.out.println("clean up after suite");}
}
