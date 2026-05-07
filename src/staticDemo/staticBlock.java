package staticDemo;

public class staticBlock {
static int a = 10;
    static{
        System.out.println("Static block before main method");
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        System.out.println("Value of a: " + a);
    }
       static {
        System.out.println("This is static block");
        System.out.println("Value of a in static block: " + a);
    }
    
}

//static block is executed when the class is loaded into memory, before the main method is executed. 
// It is used to initialize static variables or perform any setup that needs to be done before the main method runs. 
// In this example, the static block will print a message and the value of variable 'a' before the main method executes.

//static method are not overridden but they can be hidden. 
// If a subclass defines a static method with the same signature as a static method in the superclass,
//  the subclass's method hides the superclass's method.