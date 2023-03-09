import org.testng.annotations.BeforeTest;

public class ParentClass {
    @BeforeTest
    public void runBefore() {
        System.out.println("runBefore method");
    }
    public void doThis() {
        System.out.println("doThis method");
    }
}
