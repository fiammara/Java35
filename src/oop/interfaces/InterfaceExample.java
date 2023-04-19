package oop.interfaces;


interface Bug {

    public void bugSound();
    public void bugSize();

}
class Ant implements Bug, Location {
    public void bugSound() {
        System.out.println("tsss");
    }
    @Override
    public void bugSize() {
        System.out.println("Small");
    }

    @Override
    public void location() {

    }
}
interface Location {
    public void location();
}
public class InterfaceExample {
    public static void main(String[] args) {
       Ant ant = new Ant();
       ant.bugSize();
       ant.bugSound();
    }

}
