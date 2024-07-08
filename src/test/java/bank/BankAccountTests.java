package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    public void testGetAmount() {
        BankAccount bankAccount = new BankAccount(100);
        assertEquals(100, bankAccount.getAmount());
    }

    @Test
    public void testGetBalance() {
        BankAccount bankAccount = new BankAccount(50);
        assertEquals(50, bankAccount.getBalance());
    }

    @Test
    public void testSetBalance() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(200);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(300);
        bankAccount.deposit(100);
        assertEquals(400, bankAccount.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(200);
        bankAccount.withdraw(50);
        assertEquals(150, bankAccount.getBalance());
    }

    @Test
    public void testToString() {
        BankAccount bankAccount = new BankAccount(500);
        assertEquals("BankAccount [balance=500]", bankAccount.toString());
    }
}
