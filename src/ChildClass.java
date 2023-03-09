import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChildClass extends ParentClass {
    @Test
    public void runTest() {
        doThis();
        Class3 class3 = new Class3(7); //creating an instance of the class via parameterized constructor
        System.out.println(class3.increaseByOne());
        System.out.println(class3.multiplyByTwo());
    }
}
