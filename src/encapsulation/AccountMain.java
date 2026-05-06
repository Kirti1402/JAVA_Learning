package encapsulation;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(123456789, 1000.0, "John Doe");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
    }
}
