package HW7;
import java.util.ArrayList;

public class Main {

    public static void displayAccounts(ArrayList<BankAccount> account) {
        for (BankAccount i : account)
            System.out.println(i);
    }

    public static void main(String[] args) {

        BankAccount Account1 = new BankAccount("Joe", "Goldberg", "123456789",
                "Main", "Canton", "13617", 100, 5.0);

        BankAccount Account2 = new BankAccount("James", "Charles", "163451298",
                "Street", "City", "12345", 700, 8.1);

        BankAccount Account3 = new BankAccount("Buzz", "Aldrin", "987654321",
                "Road", "Metropolitan", "54321", 100, 2.0);


        System.out.println(Account1.getOwner().equals("Joe Goldberg"));
        System.out.println(Account1.getAccount().equals("123456789"));

        System.out.println(Account2.getAddress().equals("Street, City, 12345"));
        System.out.println(Account2.getBalance() == 700);

        System.out.println(Account3.getInterest() == 2.0);

        System.out.println(Account1.credit(40) == 140);
        System.out.println(Account1.getBalance() == 140);

        System.out.println(Account2.debit(500) == 200);
        System.out.println(Account2.getBalance() == 200);

        System.out.println(Account3.debit(400) == 0);
        System.out.println(Account3.getBalance() == 100);

        Account1.setInterest(6.0);
        System.out.println(Account1.getInterest() == 6.0);

        System.out.println(Account3.addInterest() == 102);
        System.out.println(Account3.getBalance() == 102);


        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(Account1);
        accounts.add(Account2);
        accounts.add(Account3);

        displayAccounts(accounts);

    }

}
