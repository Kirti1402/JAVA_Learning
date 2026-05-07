package inheritence;

//inheritence is a mechanism in which one class acquires the properties (fields) and behaviors (methods) of another class. 
// The class that inherits the properties and behaviors is called the subclass (or child class), and the class from which it inherits is called the superclass (or parent class).
//features of inheritence
//1. Code Reusability: Inheritence promotes code reusability by allowing subclasses
//to reuse the code of the superclass. This reduces redundancy and makes the code more efficient.
//2. Method Overriding: Subclasses can provide their own implementation of methods defined in
//the superclass. This is known as method overriding and allows for dynamic method dispatch, enabling polymorphism.
//3. Hierarchical Inheritence: A single superclass can have multiple subclasses, creating a
//hierarchical structure. This allows for a more organized and modular codebase.

//types of inheritence
//1. Single Inheritence: In single inheritence, a subclass inherits from a single superclass.
//2. Multilevel Inheritence: In multilevel inheritence, a subclass inherits from
//another subclass, creating a chain of inheritance.
//3. Hierarchical Inheritence: In hierarchical inheritence, multiple subclasses inherit from a
//single superclass.
//4. Multiple Inheritence: In multiple inheritence, a subclass can inherit from multiple superclasses. 
// However, Java does not support multiple inheritence directly to avoid ambiguity issues. Instead, it uses interfaces to achieve similar functionality.

//one rule one java file have one public class and the name of the public class should be same as the name of the java file.

class A{
    int a=100;
    void display(){
        System.out.println(a);
    }
    void methodOveriding(){
        System.out.println("This is method overriding in class A");
    }
}

class B extends A{
    int b=200;
    void show(){
        System.out.println(b);
    }
     void methodOveriding(){
        System.out.println("This is method overriding in class A");
    }
}


public class InheritenceDemo {
    public static void main(String[] args) {
       B obj=new B();//object of class B
         obj.display(); // inherited method from class A
         obj.show(); // method defined in class B
         obj.methodOveriding(); // this will call the methodOveriding method of class B because it overrides the method defined in class A.

        //  B obj1= new A(); // this will give error because we cannot assign a superclass object to a subclass reference variable.
        A obj2= new B(); // this is allowed because a subclass object can be assigned to a superclass reference variable.
         obj2.display(); // this will call the display method of class A
         // obj2.show(); // this will give error because the reference variable obj2 is of type A and it does not have access to the show method defined in class B.
         obj2.methodOveriding(); // this will call the methodOveriding method of class B because it overrides the method defined in class A.
    
        }
}
