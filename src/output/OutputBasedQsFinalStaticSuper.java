package output;

// -----------------------------------------------------------------------------------------------------------------------------
// class Parent {
//     static void show() {
//         System.out.println("Parent");
//     }
// }

// class Child extends Parent {
//     static void show() {
//         System.out.println("Child");
//     }
// }

// public class OutputBasedQsFinalStaticSuper {
//     public static void main(String[] args) {
//         Parent p = new Child();
//         p.show();
//     }
// }
//Explanation
// In this code, we have a Parent class with a static method show() and a Child class that extends Parent and also has a static method show().
//  When we create an instance of Child and assign it to a reference of type Parent, the static method show() that gets called is determined by the reference type (Parent) rather
//  than the actual object type (Child). Therefore, the output will be "Parent".
//show() is a static method, and static methods are not overridden — they are hidden.
//--------------------------------------------------------------------------------------------------------------------------------
// class Test {
//     static int x = 10;

//     Test() {
//         x++;
//     }
// }

// public class OutputBasedQsFinalStaticSuper  {
//     public static void main(String[] args) {
//         new Test();
//         new Test();
//         new Test();

//         System.out.println(Test.x);
//     }
// }
//Explaination
// In this code, we have a class Test with a static variable x initialized to 10. The constructor of the Test class increments x by 1 each time an instance of Test is created.
// In the main method, we create three instances of Test, which means the constructor is called three times, incrementing x by 1 each time. 
// Therefore, after creating three instances, x will be 10 + 3 = 13. Hence, the output will be 13.
//---------------------------------------------------------------------------------------------------------------------------------
// class Test {
//     int x = 10;
// }

// public class OutputBasedQsFinalStaticSuper {
//     public static void main(String[] args) {
//         final Test t = new Test();

//         t.x = 50;

//         System.out.println(t.x);
//     }
// }
//Explanation
// In this code, we have a class Test with an instance variable x initialized to 10. In the main method, we create a final reference t of type Test and assign it a new instance of Test.
// The final keyword means that the reference t cannot point to a different object after it has been assigned. 
// However, it does not make the object itself immutable. Therefore, we can still modify the instance variable x of the object that t references.
// In this case, we assign the value 50 to t.x, which is perfectly valid. Finally, when we print t.x, it will output 50.
//----------------------------------------------------------------------------------------------------------------------------------
// class Parent {
//     final void show() {
//         System.out.println("Parent show");
//     }
// }

// class Child extends Parent {
//     void display() {
//         System.out.println("Child display");
//     }
// }

// public class OutputBasedQsFinalStaticSuper {
//     public static void main(String[] args) {
//         Parent p = new Child();
//         p.show();
//     }
// }
//Explanation
// In this code, we have a Parent class with a final method show() and a Child
// class that extends Parent and has its own method display(). The final keyword in the show() method means that it cannot be overridden by any subclass.
// In the main method, we create an instance of Child and assign it to a reference of type Parent. When we call p.show(), it will call the show() method defined in the Parent class,
// since the Child class cannot override it. Therefore, the output will be "Parent show".
//----------------------------------------------------------------------------------------------------------------------------------
// class A {
//     static {
//         System.out.println("A Static");
//     }
// }

// class B extends A {
//     static {
//         System.out.println("B Static");
//     }
// }

// public class OutputBasedQsFinalStaticSuper {
//     public static void main(String[] args) {
//         B obj = new B();
//     }
// }
//Explanation
// In this code, we have two classes A and B, where B extends A. Both classes have static blocks that print messages when they are executed.
// When we create an instance of B, the static block of class A will be executed first, followed by the static block of class B.
// Therefore, the output will be:
// A Static
// B Static
//static block are not overridden, they are executed in the order of class loading. Since B extends A, A's static block is executed before B's static block.
//----------------------------------------------------------------------------------------------------------------------------------
// class Parent {
//     Parent() {
//         System.out.println("Parent Constructor");
//     }
// }

// class Child extends Parent {
//     Child() {
//         System.out.println("Child Constructor");
//     }
// }

// public class OutputBasedQsFinalStaticSuper {
//     public static void main(String[] args) {
//         new Child();
//     }
// }
//Explanation
// In this code, we have a Parent class with a constructor that prints "Parent Constructor" and a Child class that extends Parent with its own constructor that prints "Child Constructor".
// When we create a new instance of Child, the constructor of Parent is called first (due to the implicit call to super()), which prints "Parent Constructor".
// After that, the constructor of Child is executed, printing "Child Constructor". Therefore, the output will be:
// Parent Constructor
// Child Constructor
//------------------------------------------------------------------------------------------------------------------------------------
class Test {
    static int x = 10;

    static {
        x = x + 5;
    }

    public static void OutputBasedQsFinalStaticSuper(String[] args) {
        System.out.println(x);
    }
}
//Explanation
// In this code, we have a class Test with a static variable x initialized to 10. There is also a static block that adds 5 to x, making it 15.