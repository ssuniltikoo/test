package com.sunil.BankApp;

public class TransactionClass {

    public void Transfer(Account debited, Account credited, double amount){
        System.out.println("TRANSFER FUNDS INITIATED ");
        if(debited.getBalance() > amount){
            debited.setBalance(debited.getBalance() - amount);
            debited.getAccountInfo();
            credited.setBalance(credited.getBalance() + amount);

            credited.getAccountInfo();
        }else {
            System.out.println("Insuffiecient balance in ");
            debited.getAccountInfo();
        }

    }

   /*public  void PayBill(Account deb, Biller biller, double amount){
            System.out.println("in pro");
    }*/
}
