package HW7;

public class BankAccount {

    private String owner; // name of owner

    private String account; // account number

    private String address; // address of owner

    private double balance; // balance of bank account

    private double interest; // interest rate of account

    public BankAccount(String first,
                       String last,
                       String account,
                       String street,
                       String city,
                       String zipcode,
                       double balance,
                       double interest) {

        this.owner = first + " " + last;
        if (account.length() > 10)
            throw new IllegalArgumentException("Invalid Argument: Bank account number more than 10 digits");
        if (account.charAt(0) == '0')
            throw new IllegalArgumentException("Invalid Argument: Leading 0");
        this.account = account;
        this.address = street + ", " + city + ", " + zipcode;
        this.balance = balance;
        this.interest = interest;
    }

    /**
     * gets owner's name
     * @return owner's name
     */
    public String getOwner() {
        return owner;
    }

    /**
     * gets account number
     * @return account number
     */
    public String getAccount() {
        return account;
    }

    /**
     * gets owner's address
     * @return owner's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * gets balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * gets interest rate of account
     * @return interest rate
     */
    public double getInterest() {
        return interest;
    }

    /**
     * formats bank account as a string
     * @return bank account information as a string
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", account='" + account + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }

    /**
     * adds amount to balance
     * @param amt to add
     * @return balance
     */
    public double credit(double amt) {
        balance += amt;
        return balance;
    }

    /**
     * subtracts amount from balance
     * @param amt to subtract
     * @return balance or 0 if amount is bigger than balance
     */
    public double debit(double amt) {
        if (balance - amt > 0) {
            balance -= amt;
            return balance;
        } else
            return 0;
    }

    /**
     * applies interest
     * @return balance
     */
    public double addInterest() {
        balance += (interest / 100) * balance;
        return balance;
    }

    /**
     * sets interest rate
     * @param interest applied
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }
}
