package com.sunil.BankApp;

public abstract class Account {
    private int accountNo;
    private String customerName;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public int getAccountNo() {
        return accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

     double getBalance() {
        return balance;
    }

    public Account(int accountNo,String customerName,double balance){
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void Deposit(double amount) {
        double bal = getBalance() + amount;
        System.out.println("Amount deposited.balance " + bal);

    }

    public void Withdraw(double amount) {
        double bal = getBalance()  - amount;
        System.out.println("Amount withdraw. bal" + bal);
    }


    public void getAccountInfo(){
        System.out.println("Account statement. Net Balance in Account  "+getAccountNo()+ " is "+getBalance()+ " Customer Name " + getCustomerName());
    }

}
