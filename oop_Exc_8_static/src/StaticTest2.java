public class StaticTest2 {

    public static void main(String[] args) {

        Test test = new Test();
        Test test2 = new Test();

        int n = Test.num;
        System.out.println(n);
    }
}

class Test {

    static int num = 0;
    String test = "Hey there.";

    Test() {
        num += 2;
        System.out.println(num);
    }

    static {
        num++;
        System.out.println(num);
    }
}
