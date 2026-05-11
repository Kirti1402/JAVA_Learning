package exception;

import java.util.Scanner;

class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(100/num); // if num is 0 it will throw airthmetic exception

        String s = null;
        System.out.println(s.length());// it will nullpointerexceptions
    }
}
