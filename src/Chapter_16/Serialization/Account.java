package Chapter_16.Serialization;

import java.io.Serializable;

// Account.java
// Serializable Account class for storing records as objects.
public class Account implements Serializable {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // initializes an Account with default values
    public Account() {
        this(0, "", "", 0.0); // call other constructor
    }

    // initializes an Account with provided values
    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
