package homeworks.HW17;

public class Car extends Vehicle{
    boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }
    public float maxDistance() {

       if(airConditioner) {
           return super.maxDistance(super.getFuel(), super.getFuelUsage() + (super.getFuelUsage() * 0.1f), super.getPassengers());

    }
    else {
           return super.maxDistance();
         }
    }
}
