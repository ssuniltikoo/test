package com.sunil.Demo.BankInterface.AccInterface;

public interface AccountInterface {

    double interestRate = 9.9;

    public void CalculateSimpleInterestRate();

    public void getBalance();

    public void CalculateCompoundInterest();

    default double getInterestRate(){
        return interestRate;
    }


}
