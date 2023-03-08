package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module4 {
    @Test
    public void calculateHomeLoanWeb() { System.out.println("module 4 - test web"); }
    @Test
    public void calculateHomeLoanMobile() {
        System.out.println("module 4 - test mobile");
    }
    @Test
    public void calculateHomeLoanApi() {
        System.out.println("module 4 - test API");
    }
    @Test
    public void WebLogin1() {
        System.out.println("module 4 - test web 1");
    }
    @Test
    public void WebLogin2() {
        System.out.println("module 4 - test mobile 1");
    }
    @Test
    public void MobileLogin1() {
        System.out.println("module 4 - test web 2");
    }
    @Test
    public void MobileLogin2() {
        System.out.println("module 4 - test mobile 2");
    }
    @BeforeMethod
    public void runBeforeMethod() { System.out.println("test run before every method in module 4");}
}
