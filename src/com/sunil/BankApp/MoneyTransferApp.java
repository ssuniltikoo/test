package com.sunil.BankApp;

public class MoneyTransferApp {
    public static void main(String[] args) {
        Account sav = new SavingAccount(10101,"sunil",3000);
        Account curr = new CurrentAccount(20101," Tikoo",2000);

        Biller biller1 = new Biller("LIC",10239658);

        TransactionClass tr = new TransactionClass();
        tr.Transfer(sav,curr,500);
        tr.PayBill(sav,biller1,1000);
    }
}
