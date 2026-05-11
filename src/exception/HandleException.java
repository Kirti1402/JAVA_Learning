package exception;

import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // try {
        //     int div = 100/num;
        // } catch (ArithmeticException e) {
        //     System.out.println("Invalid Data");
        // }

        // System.out.println("Program is completed");
//one try block can have multiple catch block but if exception is unknown then we can handle in below ways
        String s = null;

        try {
            s.length();
        } catch (Exception e) {
            System.out.println("Exception:"+ e.getMessage());
        }

        try {
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Exception:"+ e.getMessage());
        }finally{
            System.out.println("Finally block");
        }
        

    }
}

//finally block will always execute 
//when catch do not handle exception finally will still occur but rest program terminate

//checked expecption
//compiter time
//handled: Try and catch block , throws keyword defined at method level

