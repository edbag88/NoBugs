package org.example.task1;

public class BankAccount implements Printable {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void print() {
        System.out.println(this.balance);
    }
}
