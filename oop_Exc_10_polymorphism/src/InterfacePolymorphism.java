public class InterfacePolymorphism {

    public static void main(String[] args) {

        Measurable r1 = new Rectangle(5.5, 2.5);
        Measurable c1 = new Circle(8.5);

        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}

class Rectangle implements Measurable {

    double breadth, length;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (breadth+length);
    }
    @Override
    public double getArea() {
        return breadth*length;
    }
}

class Circle implements Measurable {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
    @Override
    public double getArea() {
        return pi * radius * radius;
    }
}

interface Measurable {

    float pi = 3.14F;
    double getPerimeter();
    double getArea();
}