package exception;

public class CheckedException {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started");
        Thread.sleep(5000);
        System.out.println("Program finished");
    }
}

// Checked Exception: These exceptions are checked at compile time, forcing the programmer to handle them explicitly.
//Unchecked Exception: These exceptions are checked at runtime and do not require explicit handling at compile time.