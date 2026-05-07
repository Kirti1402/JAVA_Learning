package inheritence;

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
        System.out.println("This is method overriding in class B");
    }

}

class C extends B{
    int c=300;
    void print(){
        System.out.println(c);
    }
     void methodOveriding(){
        System.out.println("This is method overriding in class C");
    }
}

public class multiLevelInheritence {
    public static void main(String[] args) {

        C obj=new C(); // object of class C
        obj.display(); // inherited method from class A
        obj.show(); // inherited method from class B
        obj.methodOveriding(); // this will call the methodOveriding method of class C because it overrides the method defined in class A and class B.

        obj.a=500; // we can access the variable a of class A because it is inherited by class C through class B
        obj.b=600; // we can access the variable b of class B because it is inherited by class C
        obj.c=700; // we can access the variable c of class C because it is
        obj.display();
        obj.show();
        obj.print();

    }
}


//why multiple level of inheritence is not supported in java?
//Multiple level of inheritance is supported in java but it is not recommended because it can lead to a complex and difficult to maintain codebase.
//In multiple level of inheritance, a subclass can inherit from multiple superclasses, 
// which can lead to ambiguity issues if the superclasses have methods with the same signature.
//  This can make it difficult to determine which method should be called when a method is invoked on an object of the subclass.
//To avoid these issues, Java does not support multiple level of inheritance directly. 
// Instead, it uses interfaces to achieve similar functionality. An interface is a collection of abstract methods that can be implemented by any class, 
// allowing for multiple inheritance of behavior without the ambiguity issues associated with multiple level of inheritance.
