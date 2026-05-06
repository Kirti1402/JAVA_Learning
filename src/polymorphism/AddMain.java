package polymorphism;

public class AddMain {
    public static void main(String[] args) {
        Add a1 = new Add();
        a1.sum();
        a1.sum(30, 40);
        a1.sum(10.5, 20.5);
    }
}
