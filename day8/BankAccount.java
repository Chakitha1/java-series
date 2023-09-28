//Create an interface called account operation with methods deposit, getBalance.Implement this interface in account class.
package day8;
interface AccountOperation {
	void deposit(int amount);
	int getBalance();
}
class Account implements AccountOperation {
	private int balance;
	public Account(int initialBalance) {
	   this.balance = initialBalance;
	}
	public void deposit(int amount) {
	   balance += amount;
	   System.out.println("Deposited " + amount + " rupees");
	}
	public int getBalance() {
	   return balance;
	}
}
public class BankAccount {
	public static void main(String[] args) {
		 Account myAccount = new Account(1000);
		 myAccount.deposit(500);
		 int balance = myAccount.getBalance();
		 System.out.println("Current Balance: " + balance + " rupees");
	}
}
