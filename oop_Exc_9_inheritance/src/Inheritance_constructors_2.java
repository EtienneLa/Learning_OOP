public class Inheritance_constructors_2 {

    public static void main(String[] args) {

        E e = new E(2, 4);
    }
}

class D {

    int integer1 = 15;

    public D(int n) {
        integer1 = 2*n;
        System.out.println("constructor D called. " + integer1);
    }
}

class E extends D{

    int integer2 = 20;

    public E(int n, int b) {
        super(n);
        integer2 = 2*b;
        System.out.println("constructor E is called. " + super.integer1 + " " + integer2);
    }
}
