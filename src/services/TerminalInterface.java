package services;

import classes.Person;
import classes.Terminal;

public interface TerminalInterface {
    String creatTerminal(Terminal... terminal);
    Person[] getAllTerminal();
    String transferToCard(Person person, String cardNumber, double summa);


    String transferToPhoneNumber(Person person, String phoneNumber, double summa);
}
