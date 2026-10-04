package labsheet1;

class Student {
    String name;
    int age;
    String college;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Kashish Bhatija";
        student.age = 22;
        student.college = "COER University";

        student.displayDetails();
    }
}