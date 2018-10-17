package com.sunil.oops.AbstractDemo.Account.BankApp;

import com.sunil.oops.AbstractDemo.Account.BankAcc.SavingAccount;

public class BankApp {
    public static void main(String[] args) {
        SavingAccount sc = new SavingAccount(123,"sunil",90909);
        sc.getInfo();
    }
}
