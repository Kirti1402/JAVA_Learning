package finalKeyword;
class Test{
    int x = 100;
    final int y = 50; // final variable

    
}
public class FinalKDemo {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println("Value of x: "+obj.x);
        obj.x = 200; // we can change the value of x
        System.out.println("Value of x after change: "+obj.x);
        // obj.y = 100; // we cannot change the value of y because it is final
            System.out.println("Value of y: "+obj.y);

    }
}
