import java.util.Scanner;

public class oop_Exc_1 {

    public static void main( String[] args ) {

        Car car1 = new Car( "Punto", "Fiat", 5000);
        Car car2 = new Car( "R8", "Audi", 40000);

        System.out.println(car1.getModel() + ", " + car1.getMark() + ", " + car1.getPrize() + " Euro");
        System.out.println(car2.getModel() + ", " + car2.getMark() + ", " + car2.getPrize() + " Euro");
        System.out.println();
        System.out.print("Add a new Car to the list (model mark prize): ");
        Scanner kb = new Scanner(System.in);
        String temp = kb.nextLine();
        Scanner strsc = new Scanner(temp);

        Car car3 = new Car( strsc.next(), strsc.next(), strsc.nextInt());

        System.out.println(car3.getModel() + ", " + car3.getMark() + ", " + car3.getPrize() + " Euro");

        kb.close();
        strsc.close();
    }
}
