public class SavingAccount {

    private final int accountNumber;
    private static int totalNumberOfAccounts = 0;
    private double balance;
    private int interestRate;

    /**
     * A saving account has a balance that can be changed by deposits and withdrawals.
     */
    public SavingAccount(int initialInterestRate) {
        totalNumberOfAccounts++;
        accountNumber = totalNumberOfAccounts;
        balance = 0;
        interestRate = initialInterestRate;
    }

    public SavingAccount(double initialBalance, int initialInterestRate) {
        totalNumberOfAccounts++;
        accountNumber = totalNumberOfAccounts;
        balance = initialBalance;
        interestRate = initialInterestRate;
    }

    /**
     * Deposit money to the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * Adds interest
     */
    public void addInterest(){
        double interest = balance * interestRate * 90 / 36000;
        balance = balance + interest;
    }

    /**
     * Gets the number of the saving account.
     *
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets the current balance of the saving account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the current interest rate of the saving account
     *
     * @return the current interestRate
     */
    public int getInterestRate (){
        return interestRate;
    }

    /**
     * Sets the interest rate of the saving account
     *
     * @param interestRate interest rate to seton the saving account
     */
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}