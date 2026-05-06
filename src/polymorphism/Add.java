package polymorphism;

// Method Overloading Example
public class Add {
    int a=10;
    int b=20;

    void sum(){
        System.out.println("The sum of a and b is: "+(a+b));
    }
    void sum(int a, int b){
        System.out.println("The sum of a and b is: "+(a+b));
    }
    void sum(double a, double b){
        System.out.println("The sum of a and b is: "+(a+b));
    }
}

//method overloading is a feature in java where we can have multiple methods with the same name but different parameters. 
// It is also known as compile time polymorphism. The method to be called is determined at compile time based on the number and type of arguments passed to the method.
//java does not consider the return type of the method while overloading. The method signature must be different for each overloaded method.
//java checker will check the method signature to determine which method to call. 
// If there are multiple methods with the same name and the same number of parameters, then the compiler will throw an error.
//error: reference to sum is ambiguous

