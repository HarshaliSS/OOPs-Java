package com.gv.oops.abstraction;

public class MainBank {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", 1000.0, 5.0);
        BankAccount checking = new CheckingAccount("CA123", 2000.0, 500.0);

        savings.deposit(500);
        savings.printBalance(); 

        checking.withdraw(2500);
        checking.printBalance(); 

        ((SavingsAccount) savings).addInterest();
        savings.printBalance(); 
    }
}
