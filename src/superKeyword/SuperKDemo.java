package superKeyword;


class  Test3{
    int a = 10;
    Test3(){
        System.out.println("Constructor of Test3");
    }
    void display(){
        System.out.println("Value of a in Test3: " + a+"Test3");
    }
}

class Test4 extends Test3{
    int a = 20;
    Test4(){ // Calls the constructor of Test3
        System.out.println("Constructor of Test4");
    }
    void display(){
        System.out.println("Value of a in Test4: " + a);
        System.out.println("Value of a in Test3: " + super.a);
            super.display(); // Calls the display method of Test3
    }

}

public class SuperKDemo {
    public static void main(String[] args) {
        Test4 obj = new Test4();
        obj.display();
    }
}
