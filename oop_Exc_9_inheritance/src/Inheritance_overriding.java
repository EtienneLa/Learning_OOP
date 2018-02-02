public class Inheritance_overriding {

    public static void main(String[] args) {

        Bicycle bc = new Bicycle();
        Cycle c = new Cycle();

        bc.printInfo();
        c.printInfo();
    }
}

class Cycle {

    int weight = 10;

    void printInfo() {

        System.out.println(weight);
    }
}

class Bicycle extends Cycle {

    private String brand = "hercules";

    void printInfo() {

        System.out.println(brand);
    }
}