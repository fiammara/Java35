package homeworks.HW17;

public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public float getFuel() {
        return fuel;
    }

    public float getFuelUsage() {
        return fuelUsage;
    }

    public int getPassengers() {
        return passengers;
    }

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;

    }

    public float maxDistance() {

        return fuel/(fuelUsage + ((fuelUsage * 0.05f) * passengers))*100;
}
    public float maxDistance(float fuel, float fuelUsage, int passengers) {

        return fuel/(fuelUsage + ((fuelUsage * 0.05f) * passengers))*100;
    }

}
