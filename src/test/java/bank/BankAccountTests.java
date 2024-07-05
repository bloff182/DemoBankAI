package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    void testGetAmount() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getAmount());
    }

    @Test
    void testGetBalance() {
        BankAccount account = new BankAccount(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    void testSetBalance() {
        BankAccount account = new BankAccount();
        account.setBalance(200);
        assertEquals(200, account.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(300);
        account.deposit(100);
        assertEquals(400, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testToString() {
        BankAccount account = new BankAccount(500);
        assertEquals("BankAccount [balance=500]", account.toString());
    }
}
