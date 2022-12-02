import classes.BankAccount;
import classes.Person;
import classes.Terminal;
import enums.Bank;
import enums.Mobile;
import services.impl.BankAccountImpl;
import services.impl.PersonImpl;
import services.impl.TerminalImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount(Bank.BAKAY_BANK,500000,"345 678 000","4566");
        BankAccount bankAccount2 = new BankAccount(Bank.AIYL_BANK,600000,"345 678 111","4567");
        BankAccount bankAccount3 = new BankAccount(Bank.KYRGYZSTAN_BANK,700000,"345 678 222","4568");
        BankAccount bankAccount4 = new BankAccount(Bank.OPTIMA_BANK,800000,"345 678 333","4569");
        BankAccount bankAccount5 = new BankAccount(Bank.RSK_BANK,900000,"345 678 444","4565");
        BankAccount [] bankAccounts ={bankAccount1,bankAccount2,bankAccount3,bankAccount4,bankAccount5};

        Person person1 = new Person("Aiperi","Ibraimova","dcrftvgb","345678967","4560",bankAccount1);
        Person person2 = new Person("Aigerim","Ibraeva","dcrftvgb","345678967","4561",bankAccount2);
        Person person3 = new Person("Aizada","Bektenova","dcrftvgb","345678967","4562",bankAccount3);
        Person person4 = new Person("Aliya","Tashieva","dcrftvgb","345678967","4563",bankAccount4);
        Person person5 = new Person("Aruuzat","Akmatova","dcrftvgb","345678967","4564",bankAccount5);
        Person [] people ={person1,person2,person3,person4,person5};

        Terminal terminal1 = new Terminal(Mobile.O,"white");
        Terminal terminal2 = new Terminal(Mobile.BEELINE,"black");
        Terminal terminal3 = new Terminal(Mobile.MEGACOM,"yellow");
        Terminal [] terminals = {terminal1,terminal2,terminal3};

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                BankAccountImpl bankAccount = new BankAccountImpl();
                bankAccount.createBankAccount(bankAccount1,bankAccount2,bankAccount3);
                bankAccount.createBankAccount(bankAccount4,bankAccount5);
                System.out.println(Arrays.toString(bankAccount.getAllBankAccount()));
                System.out.print("credit: ");
                double summa = scanner.nextDouble();
                System.out.println("Your credit : "+bankAccount.credit(person1, Bank.AIYL_BANK, 0, summa));
                break;
            case 2:
                PersonImpl personImp = new PersonImpl();
                personImp.createPerson(person1,person2,person3);
                System.out.println(Arrays.toString(personImp.getAllPeople()));
                break;
            case 3:

                TerminalImpl terminal = new TerminalImpl();
                String name  = scanner.nextLine();
                System.out.println("card number");
                String cardNumber = scanner.nextLine();
                System.out.println("summa");
                double sum = scanner.nextDouble();
                System.out.println(terminal.transferToCard(person1, cardNumber, sum));
                break;
            default:
                System.err.println("ERROR");

        }





    }
}