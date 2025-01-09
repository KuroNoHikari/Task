class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println();
    }
}

public class Tasksheet125 {
    public static void main(String[] args) {
        Car[] car = new Car[]{
                new Car("Toyota","Camry",2022,4),
                new Car("Suzuki","Jimny", 2005, 3),
                new Car("Mazda", "3",2004, 4),
        };
        for (Car c: car) {
            c.displayDetails();
        }
    }

}
