package thisKeyword;

//this keyword is used to refer to the current object in a method or constructor.
// It is commonly used to resolve naming conflicts between instance variables and parameters, and to call other constructors in the same class.

public class Person {
    int age;
    String name;

    //if we do not use this keyword, the constructor parameters will shadow the instance variables,
    //  and we won't be able to assign values to the instance variables correctly.
    // public Person(String name, int age) {
    //     name = name; // This will not work as expected, it assigns the parameter to itself
    //     age = age;   // This will not work as expected, it assigns the parameter to itself
    // }

    public Person(String name, int age) {
        this.name = name; // 'this' refers to the current object's name variable
        this.age = age;   // 'this' refers to the current object's age variable
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);//here we are using 'this' to refer to the current object's name variable,
        //  but it's optional in this context since there is no naming conflict.
        System.out.println("Age: " + this.age);
    }
}
