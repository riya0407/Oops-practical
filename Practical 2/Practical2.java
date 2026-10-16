
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Single Inheritance
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Multilevel Inheritance
class Person {
    void showPerson() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("I am a Manager");
    }
}

class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    void areaCircle(double r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void areaRectangle(double l, double b) {
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Car c = new Car();
        c.start();
        c.drive();

        System.out.println("\nMultilevel Inheritance:");
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        System.out.println("\nHierarchical Inheritance:");
        Circle ci = new Circle();
        ci.display();
        ci.areaCircle(5);

        Rectangle re = new Rectangle();
        re.display();
        re.areaRectangle(4, 6);
    }
}
