package finalKeyword;
class Test1{

   void display(){
        System.out.println("This is a instance method.");
    }
    final void show(){
        System.out.println("This is a final method.");
    }
    
}

class Test2 extends Test1{
    void display(){
        System.out.println("This is a instance method in Test2 class.");
    }
    // void show(){ // we cannot override the final method
    //     System.out.println("This is a final method in Test2 class.");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.display();
        obj.show();
    }
}
