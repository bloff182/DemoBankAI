package bank;

public class BankTransferImpl implements BankTransfer{

	@Override
	public void transfer(BankAccount from, BankAccount to, int amount) {
		
		if(from.getBalance() < amount)
			throw new IllegalArgumentException("You have no enought money!!!");
		
		from.withdraw(amount);
		
		to.deposit(amount);
	}
	
	public BankAccount openAccount(int balance) {
		return new BankAccount(balance);
	}
}
