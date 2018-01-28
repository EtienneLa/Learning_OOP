public class referenceTypes_2 {

    public static void main(String[] args) {

        A a = new A();
        a.x = 10;

        System.out.println(a.x);

        B b = new B();
        b.method(a);

        System.out.println(a.x);

    }
}

class A {

    int x;
}

class B {

    void method(A obj) {

        System.out.println(obj.x);
        obj.x = 20;
        obj = null;
        System.out.println(obj);
    }
}
