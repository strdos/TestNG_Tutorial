package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("failure in test: " + result.getName());
    }
}
