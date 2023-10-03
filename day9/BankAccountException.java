package day9;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(int currentBalance, int withdrawAmount) {
        super("Insufficient Balance " + currentBalance + " for withdrawal of " + withdrawAmount);
    }
}
public class BankAccountException {
    private int balance;
    public BankAccountException(int initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
    }
    public int getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        try {
            BankAccountException account = new BankAccountException(1000);
            System.out.println("Initial Balance: " + account.getBalance());
            account.withdraw(500); 
        } catch (InsufficientBalanceException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
