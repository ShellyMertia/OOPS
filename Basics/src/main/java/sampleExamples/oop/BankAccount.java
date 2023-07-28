package sampleExamples.oop;

public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

    double getSimpleInterest(int years){

        return balance*(1+roi*years);

    }
    double getBalanceWithInterest(int years){

        return balance + getSimpleInterest(years);
    }
}
