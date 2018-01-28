public class This_2 {

    public static void main(String[] args) {

        Test_2 test = new Test_2(5, "Hi");
        System.out.println(test.num + " " + test.s);
    }
}
class Test_2 {

    int num = 1;
    String s = "bye";

    public Test_2(int num, String s) {

        this.num = num;
        this.s = s;
    }
}
