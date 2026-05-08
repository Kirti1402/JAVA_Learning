package abstractaction;

public class C1 extends C2 implements InterfaceI1, InterfaceI2 {
    @Override
    public void method1() {
        System.out.println("Method 1 implemented in C1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implemented in C1");
    }

    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.method1();
        c1.method2();
        c1.method3();
    }
}
