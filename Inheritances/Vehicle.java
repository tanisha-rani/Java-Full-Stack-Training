package Inheritances;

public class Vehicle {
    String vehicleNumber;
    int fuelCapacity;

    Vehicle() {
    }

    Vehicle(String vehicleNumber, int fuelCapacity) {
        this.vehicleNumber = vehicleNumber;
        this.fuelCapacity = fuelCapacity;
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fuel Capacity: " + fuelCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck() {
    }

    Truck(String vehicleNumber, int fuelCapacity, int loadCapacity) {
        super(vehicleNumber, fuelCapacity);
        this.loadCapacity = loadCapacity;
    }

    public void canCarryLoad() {
        if (loadCapacity <= 5000) {
            System.out.println("Truck can carry the load");
        } else {
            System.out.println("Truck cannot carry the load");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("TN10AB1234", 120);
        v1.displayVehicleInfo();

        Truck t1 = new Truck("TN10AB1234", 120, 4500);
        t1.canCarryLoad();
    }
}
