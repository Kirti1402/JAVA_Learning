package staticDemo;

public class staticVarAndMethod {

    static int a = 10;
    int b = 20;

    static void m1() {
        System.out.println("This is static method");
    }

     void m2() {
        System.out.println("This is non-static method");
    }

    void m3() {
        System.out.println(a); // Accessing static variable in non-static method
        m1(); // Accessing static method in non-static method
        m2(); // Accessing non-static method in non-static method;
    }

    //accessing non-static members in static method is not allowed because static methods belong to the class and do not have access to instance variables
    //  or instance methods. To access non-static members, you need to create an instance of the class.
    static void m4() {
        // System.out.println(b); // Accessing non-static variable in static method (This will cause a compile-time error)
        // m2(); // Accessing non-static method in static method (This will cause a compile-time error)
    }
    public static void main(String[] args) {
        System.out.println(a); // Accessing static variable directly
        m1(); // Accessing static method directly
        // m2(); // Accessing non-static method directly (This will cause a compile-time error)

        staticVarAndMethod obj = new staticVarAndMethod();
        System.out.println(obj.b); // Accessing non-static variable through object
        obj.m2(); // Accessing non-static method through object
        obj.m3(); // Accessing non-static method that accesses static members
    }
}


//if we seperate main method in another class then we can not access non-static members of staticVarAndMethod class directly
//  because they are instance members and require an object to access them. 
// However, we can still access the static members directly using the class name. Here's how you can do it:
//classname.methodname for static members
//system is predefined class in java and out is a static member of system class so we can access it directly without creating an object of system class

// main method signature: public static void main(String[] args) {
// public: The main method must be public so that it can be accessed by the Java runtime environment.
// static: The main method must be static so that it can be called without creating an instance
// void: The main method does not return any value, so it is declared as void.
// main method is the entry point of the program, and it is where the execution starts.
//String[] args: The main method takes a single parameter, which is an array of Strings. 
// This parameter is used to pass command-line arguments to the program when it is executed.
//args is the name of the parameter, and it can be any valid identifier.