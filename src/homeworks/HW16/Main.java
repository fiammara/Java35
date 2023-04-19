package homeworks.HW16;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob", 21, "13433", "d 1-2", 20000, "lawyer");
        Manager manager = new Manager("John", 41, "17339", "n 1-2", 10000, "sales");
        employee.printSalary();
        manager.printSalary();
    }
}
