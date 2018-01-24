import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {

        Circle c = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        System.out.print("Radius of the first circle? ");
        Scanner kb = new Scanner(System.in);
        double r = kb.nextDouble();
        c.findArea(r);
        System.out.print("Radius of the second circle? ");
        r = kb.nextDouble();
        c2.findArea(r);
        System.out.print("Radius of the third circle? ");
        r = kb.nextDouble();
        c3.findArea(r);
    }
}
