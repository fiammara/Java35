package oop.abstraction;

abstract class Animal {

    protected String name;
    public void sleep() {
        System.out.println("ZZZ");
    }
    public abstract void animalSound();

}
class Pig extends Animal {

    @Override
    public void animalSound() {
        System.out.println("oink oink");
    }
}


public class AbstractClassExample {
    public static void main(String[] args) {

        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();
    }
}
