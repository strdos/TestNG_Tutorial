package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module3 {
    @Test
    public void calculateCarLoanWeb() {
        System.out.println("module 3 - test web");
    }
    @Test
    public void calculateCarLoanMobile() {
        System.out.println("module 3 - test mobile");
    }
    @Test
    public void calculateCarLoanApi() {
        System.out.println("module 3 - test API");
    }
}
