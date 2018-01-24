class Circle {

    private double radius;
    private double area;

    void findArea( double r) {

        radius = r;
        area = radius*radius*3.14;
        System.out.println("The area of the circle is " + area);
    }
}
