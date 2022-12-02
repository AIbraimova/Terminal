package services.impl;

import classes.Person;
import classes.Terminal;
import services.TerminalInterface;

public class TerminalImpl implements TerminalInterface {

    private Terminal[] terminals;

    public TerminalImpl(Terminal[] terminals) {
        this.terminals = terminals;
    }

    public TerminalImpl() {

    }

    public Terminal[] getTerminals() {
        return terminals;
    }

    public void setTerminals(Terminal[] terminals) {
        this.terminals = terminals;
    }

    @Override
    public String creatTerminal(Terminal... terminal) {

        return null;
    }

    @Override
    public Person[] getAllTerminal() {
        return new Person[0];
    }

    @Override
    public String transferToCard(Person person, String cardNumber, double summa) {
        try{
            if(person.getBankAccount().getCardNumber().equals(cardNumber)){
                person.getBankAccount().setBalance(person.getBankAccount().getBalance()+summa);
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            System.err.println("Card number does not exist!");
        }

        return "Transfer completed successfully!";
    }

    @Override
    public String transferToPhoneNumber(Person person, String phoneNumber, double summa) {

        try {
            if(person.getPhoneNumber().equals(phoneNumber)){
                person.getBankAccount().setBalance(person.getBankAccount().getBalance()-summa);

            }else {
                throw new Exception();
            }
        }catch (Exception e){
            System.err.println("Number not found!");
        }
        return null;
    }
}
