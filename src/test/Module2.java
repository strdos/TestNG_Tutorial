package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module2 {
    @Test
    public void test1() {
        System.out.println("module 2 - test 1");
    }
    @BeforeTest
    public void runPrerequisiteAction() { System.out.println("prerequisite action");}

    @AfterTest
    public void runTestCleanup() { System.out.println("clean up after test");}
    @AfterSuite
    public void runSuiteCleanup() { System.out.println("clean up after suite");}
}
