package com.sunil.BankApp;

public class MoneyTransferApp {
    public static void main(String[] args) {
        Account sav = new SavingAccount(10101,"sunil",3000);
        Account curr = new CurrentAccount(20101," Tikoo",2000);

        TransactionClass tr = new TransactionClass();
        tr.Transfer(sav,curr,500);
    }
}
