public class Inheritance_superKeyword {

    public static void main(String[] args) {

        AnotherTest test = new AnotherTest();

        test.printInfo();
    }
}

class Test {

    int num = 15;

    public void printInfo() {

        System.out.println(num);
    }
}

class AnotherTest extends Test {

    double d = 1.5;

    public void printInfo() {

        super.printInfo();
        System.out.println(d);
    }
}
