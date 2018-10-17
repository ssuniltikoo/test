package com.sunil.oops.AbstractDemo.Account.BankAcc;

public abstract class Account {
    private int accountNo;
    private String accountHolder;
    private double balance;

    Account(int accountNo,
            String accountHolder,double balance){
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void getInfo(){
        System.out.println(accountHolder);
    }
}
