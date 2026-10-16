class Student {
    int rollNumber;
    String name;
    int subject1, subject2, subject3;

    Student(int rollNumber, String name, int subject1, int subject2, int subject3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    int totalMarks() {
        return subject1 + subject2 + subject3;
    }

    double percentage() {
        return totalMarks() / 3.0;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks());
        System.out.printf("Percentage: %.2f%%%n%n", percentage());
    }
}

public class Practical1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", 85, 90, 80);
        Student s2 = new Student(2, "Riya", 92, 88, 95);
        Student s3 = new Student(3, "Neha", 75, 82, 79);

        s1.display();
        s2.display();
        s3.display();
    }
}
