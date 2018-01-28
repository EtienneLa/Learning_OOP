public class referenceTypes {

    public static void main(String[] args) {

        Test a = new Test();
        Test b = new Test();

        System.out.println(a.message);
        System.out.println(b.message);

        Test c = b = a;

        System.out.println(c.message);

        b.change();

        System.out.println(a.message + " " + b.message + " " + c.message);
    }
}

class Test {

    String message = "hi";

    void change() {

        message = "bye";
    }
}
