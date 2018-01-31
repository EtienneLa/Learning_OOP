import java.util.Scanner;

public class StaticTest4 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your address: ");
        Person person = new Person();
        person.address = kb.next();
        System.out.print("Please enter your name: ");
        person.name = kb.next();
        System.out.println(person.name + ", your ID is: " + Person.id);
        System.out.println();
        System.out.print("Please enter your year of birth (yyyy): ");
        int year = kb.nextInt();
        Person.calculateAge(year);




    }
}

class Person {

    String address;
    String name;
    static int id = 1000;

    Person() {
        id++;
    }

    private String getAdress() {
        return address;
    }
    private String getName() {
        return name;
    }
    private int getId() {
        return id;
    }

    static void calculateAge(int year) {
        int currentyear = 2018;

        int result = currentyear - year;

        System.out.println("You are " + result + " years old.");
    }

}
