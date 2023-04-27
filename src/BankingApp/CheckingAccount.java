package BankingApp;

public class CheckingAccount extends BankAccount {
    private double rate;

    public CheckingAccount(String name, double balance) {
        // super in this context refers to the
        // constructor in the base/super class
        super(name, balance);
        this.rate = .01; // 1%
    }

    public double getRate() {
        return rate;
    }


}
