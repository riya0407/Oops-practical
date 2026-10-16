class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Person {
    void introduce() {
        System.out.println("I am a person.");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager manages the team.");
    }
}

class Shape {
    void describe() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void area(double radius) {
        System.out.println("Circle area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    void area(double length, double width) {
        System.out.println("Rectangle area: " + (length * width));
    }
}

public class Practical2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();

        Manager manager = new Manager();
        manager.introduce();
        manager.work();
        manager.manage();

        Circle circle = new Circle();
        circle.describe();
        circle.area(3);

        Rectangle rectangle = new Rectangle();
        rectangle.describe();
        rectangle.area(4, 5);
    }
}
