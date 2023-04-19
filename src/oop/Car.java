package oop;

public class Car {
    //Fields
    private String color;
    private String brand;
    private int maxSpeed;

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public int getMaxSpeed() {return maxSpeed;}

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed>=30) {
        this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Invalid input");
        }

    }

    //Method
    public void printCarInfo() {
        System.out.println("Car info: ");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Max speed: " + maxSpeed);

    }

}
