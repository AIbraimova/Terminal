package services;

import classes.BankAccount;
import classes.Person;
import enums.Bank;

public interface BankAccountInterface {
    String createBankAccount(BankAccount... bankAccount);
    BankAccount[] getAllBankAccount();
    double credit(Person person, Bank bank, double deposit, double summa);
}
