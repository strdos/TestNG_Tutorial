package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module3 {
    @Test
    public void calculateCarLoanWeb() {
        System.out.println("module 3 - test web");
    }
    @Test(enabled = false)
    public void calculateCarLoanMobile() {
        System.out.println("module 3 - test mobile");
    }
    @Test(dependsOnMethods = {"calculateCarLoanWeb"})
    public void calculateCarLoanApi() {
        System.out.println("module 3 - test API");
    }
    @Test(timeOut = 1000)
    public void calculateCarLoanExport() {
        System.out.println("module 3 - test export");
    }
}
