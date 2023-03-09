public class Class3 extends Class4 {
    int i;

    //parameterized constructor
    public Class3(int i) {
        super(i); // invokes parent class (Class4) constructor
        this.i = i; // 'this.i' refers to this class's i (declared in line 2); the other i is the i passed to the constructor in line 5
    }

    public int increaseByOne() {
        return i + 1;
    }
    public int decreaseByOne() {
        return i - 1;
    }
}
