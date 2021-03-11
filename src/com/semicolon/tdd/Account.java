package com.semicolon.tdd;

public class Account {

    private double balance;

    public void deposit(double depositAmount) {
        if (depositAmount >= 0) {
            balance = balance + depositAmount;
        }
    }
    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double withdrawalAmount) {
        if (balance> withdrawalAmount){
            balance = balance - withdrawalAmount;
        }
    }
}
