package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountTests {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Balance should be 150 after depositing 50");
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), "Balance should be 50 after withdrawing 50");
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150), 
                     "Should throw IllegalArgumentException when withdrawing more than balance");
    }
}