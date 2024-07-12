package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    void testGetAmount() {
        BankAccount bankAccount = new BankAccount(100);
        assertEquals(100, bankAccount.getAmount());
    }

    @Test
    void testGetBalance() {
        BankAccount bankAccount = new BankAccount(200);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    void testSetBalance() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(300);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount bankAccount = new BankAccount(500);
        bankAccount.deposit(100);
        assertEquals(600, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount bankAccount = new BankAccount(800);
        bankAccount.withdraw(200);
        assertEquals(600, bankAccount.getBalance());
    }

    @Test
    void testToString() {
        BankAccount bankAccount = new BankAccount(1000);
        assertEquals("BankAccount [balance=1000]", bankAccount.toString());
    }
}
