package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50));
    }

    @Test
    public void testToString() {
        BankAccount account = new BankAccount(100);
        assertEquals("BankAccount [balance=100]", account.toString());
    }
}