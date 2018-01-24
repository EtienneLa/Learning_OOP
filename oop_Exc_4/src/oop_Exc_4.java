public class oop_Exc_4 {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.amountOfFuel = 12.5;
        myCar.fuelCapacity = 60;
        myCar.kmPerLitre = 20;
        myCar.drive(500);
        System.out.println(myCar.getFuelLevel());
        myCar.addGas(40);
        myCar.drive(500);

    }
}

class Car {

    double kmPerLitre;
    double amountOfFuel;
    double fuelCapacity;


    public void drive(double distance) {

        double fuelNeeded = distance / kmPerLitre;
        if (amountOfFuel >= fuelNeeded) {
            amountOfFuel -= fuelNeeded;
            System.out.println("You travelled " + distance + " km.");
        }
        else {
            System.out.println("You don't have enough fuel.");
        }
    }
    public void addGas(double amount) {

        double emptySpace = fuelCapacity - amountOfFuel;
        if (emptySpace > amount) {
            amountOfFuel += amount;
            System.out.println("Successfully added " + amount + " litres of gas.");
            System.out.println("Tank has now filled " + amountOfFuel + " litres.");
        }
        else {
            amountOfFuel = fuelCapacity;
            System.out.println("Successfully added " + emptySpace + " litres of gas.");
            System.out.println("Tank is now full.");
        }
    }
    public String getFuelLevel() {

        return "Tank: " + amountOfFuel + " litres.";
    }
}
