package BankingApp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BankAccount ca1 = new CheckingAccount("Hermione", 10000);
        BankAccount sa1 = new SavingsAccount("Harry", 4000);

        ca1.addInterest();
        sa1.addInterest();

        ArrayList<BankAccount> accts = new ArrayList<>();

        accts.add(ca1);
        accts.add(sa1);
        accts.add(new SavingsAccount("Ron", 500));

    }

}
