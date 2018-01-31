public class StaticTest {

    public static void main(String[] args) {

        Test1 test = new Test1();
        Test1 test2 = new Test1();

        Test2 test3 = new Test2();
        Test2 test4 = new Test2();
    }
}

class Test1 {

    int id = 0;

    Test1() {
        id++;
        System.out.println(id);
    }
}

class Test2 {

    static int id2 = 0;

    Test2() {
        id2++;
        System.out.println(id2);
    }
}
