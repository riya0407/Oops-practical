
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple inheritance using interfaces
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Hybrid inheritance using class and interface
class Machine {
    void start() {
        System.out.println("Machine is starting...");
    }
}

class SmartPrinter extends Machine implements Printable {

    public void print() {
        System.out.println("Smart Printer is printing...");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Multiple Inheritance:");
        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        System.out.println("\nHybrid Inheritance:");
        SmartPrinter s = new SmartPrinter();
        s.start();
        s.print();
    }
}
