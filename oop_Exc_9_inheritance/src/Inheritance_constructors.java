public class Inheritance_constructors {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
    }
}

class A {

    A() {
        System.out.println("A");
    }
}

class B extends A {

    B() {
        System.out.println("B");
    }
}

class C extends B {

    C() {
        System.out.println("C");
    }
}
