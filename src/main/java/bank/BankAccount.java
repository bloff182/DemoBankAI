package bank;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public int getAmount() {
        return balance;
    }

    public void setBalance(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        this.balance = amount;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (this.balance < amount) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        this.balance -= amount;
    }

    public void setAmount(int amount) {
        this.balance = amount;
    }
}



package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        assertEquals(100, bankAccount.getAmount());
    }

    @Test
    void testWithdraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withdraw(50);
        assertEquals(50, bankAccount.getAmount());
    }

    @Test
    void testSetAmount() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAmount(200);
        assertEquals(200, bankAccount.getAmount());
    }
}