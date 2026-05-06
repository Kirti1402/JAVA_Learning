package polymorphism;
//yes we can overload main method in java but it will not be called by JVM as entry point of the program,
//  JVM will always call the main method with String[] args as parameter. 
// The overloaded main method can be called from the main method with String[] args or from any other method in the program.
public class OverloadMainMethod {
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        OverloadMainMethod obj = new OverloadMainMethod();
        obj.main("Hello, World!");
    }
    void main(String arg) {
        System.out.println("Main method with String arg: " + arg);
    }
}
