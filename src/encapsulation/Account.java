package encapsulation;
// Encapsulation is an OOP concept where data and methods are bundled together inside a class, and direct access to internal data is restricted.
//We achieve encapsulation by keeping variables private and providing controlled access through methods.
// The main purpose of encapsulation is:
// data protection
// controlled access
// hiding internal implementation
// improving maintainability

//if variable are private, they cannot be accessed directly from outside the class. 
// Instead, we provide public getter and setter methods to access and modify the private variables.
// This allows us to control how the data is accessed and modified, ensuring that it remains in a valid state.


public class Account {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor to initialize the account
    public Account(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    // Getter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }
    

}
