class MyClass {
    MyClass() {
        System.out.println("Object is created");
    }

    void display() {
        System.out.println("Object is being used");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collector called");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.display();

        obj = null;

        System.out.println("Object reference removed");

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
