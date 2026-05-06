package classAndObject;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 'A');
        Student s2 = new Student();

        s1.getDetails();
        s2.getDetails();
    }
}
