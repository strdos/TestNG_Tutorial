package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Module3 {
    @Parameters({"url", "apikey"})
    @Test
    public void calculateCarLoanWeb(String url, String apikey) {
        System.out.println("module 3 - test web");
        System.out.println(url);
        System.out.println(apikey);
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
    @Test(dataProvider="getData")
    public void calculateCarLoanImport(String username, String password) {
        System.out.println(username + " " + password);
    }
    @DataProvider
    public Object[][] getData() {
        // set 1 - username and psw as arguments
        // set 2 - username and psw as arguments
        // set n - username and psw as arguments
        Object[][] data = new Object[3][2]; //3 is number of sets = number of times the test will run; 2 is number of args
        // set 1
        data[0][0] = "username1";
        data[0][1] = "password1";
        //set 2
        data[1][0] = "username2";
        data[1][1] = "password2";
        //set 3
        data[2][0] = "username3";
        data[2][1] = "password3";
        return data;
    }
}
