public class This_3 {

    public static void main(String[] args) {

        Test_3 test = new Test_3(5);

        System.out.println(test.y);
        System.out.println(test.x);

        Test_3 test2 = new Test_3();

        System.out.println(test2.x);
        System.out.println(test2.s);
    }
}

class Test_3 {

    int x;
    int y;
    boolean z;
    String s;

    public Test_3(int x, int y, boolean z, String s) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.s = s;
    }

    public Test_3(int x) {
        this(x, 0, false, null);
    }
    public Test_3(int x, int y) {
        this(x, y, false, null);
    }
    public Test_3() {
        this(0, 0, false, null);
    }
}
