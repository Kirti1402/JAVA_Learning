package abstractaction;

interface Shape {
    int length = 10; // by default public static final
    int width = 20; // by default public static final
    default void square(){
        System.out.println("Square: default interface method");
    } 
    static void rectangle(){
        System.out.println("Rectangle: static interface method");
    } // by default public abstract
    void circle(); // by default public abstract

}


public class  InterfaceDemo implements Shape {
    public void circle() {
        System.out.println("Circle: implemented method");
    } 
     public static void main(String[] args) {
        //scenario 1: creating an instance of the interface and calling the methods
      InterfaceDemo demo = new InterfaceDemo();
      demo.square();
      Shape.rectangle();
      demo.circle();
    //   demo.rectangle(); // This will cause a compile-time error because rectangle() is a static method and cannot be called on an instance.

        //scenario 2: creating a reference of the interface type and calling the methods
        Shape shape = new InterfaceDemo();
        shape.square();
        Shape.rectangle();
        shape.circle();

}
}