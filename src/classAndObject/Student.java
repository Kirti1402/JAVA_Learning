package classAndObject;

public class Student {
    int rollNo;
    String name;
    char grade;

    Student(int rollNo, String name, char grade) {

        System.out.println("Student object created");
         this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }
    Student() {
        System.out.println("Default constructor called");
    }

    void getDetails(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}
