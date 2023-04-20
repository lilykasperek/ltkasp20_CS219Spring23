package BankingApp;

public abstract class BankAccount {

    protected String name;
    protected double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void credit(double amt) {
        balance += amt;
    }

    public abstract double getRate();

    public void addInterest() {
        balance *= (1 + getRate());
    }

}
