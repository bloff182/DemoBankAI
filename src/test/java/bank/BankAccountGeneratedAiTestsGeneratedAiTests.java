package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountGeneratedAiTests {

    private BankAccount account;

    @BeforeEach
    public void setup() {
        account = new BankAccount();
    }

    @Test
    void testGetAmount_InitialBalance() {
        // GIVEN - An account is created with an initial balance of 0.
        // WHEN - The getAmount method is called.
        int actualAmount = account.getAmount();
        // THEN - The returned amount should be 0.
        assertEquals(0, actualAmount);
    }

    @Test
    void testGetBalance_InitialBalance() {
        // GIVEN - An account is created with an initial balance of 0.
        // WHEN - The getBalance method is called.
        int actualBalance = account.getBalance();
        // THEN - The returned balance should be 0.
        assertEquals(0, actualBalance);
    }

    @Test
    void testDeposit_PositiveAmount() {
        // GIVEN - An account with an initial balance of 0.
        // WHEN - A deposit of 100 is made.
        account.deposit(100);
        // THEN - The balance should be 100.
        assertEquals(100, account.getBalance());
    }

    @Test
    void testDeposit_ZeroAmount() {
        // GIVEN - An account with an initial balance of 0.
        // WHEN - A deposit of 0 is made.
        account.deposit(0);
        // THEN - The balance should remain 0.
        assertEquals(0, account.getBalance());
    }

    @Test
    void testWithdraw_PositiveAmount() {
        // GIVEN - An account with an initial balance of 100.
        account.setBalance(100);
        // WHEN - A withdrawal of 50 is made.
        account.withdraw(50);
        // THEN - The balance should be 50.
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdraw_ZeroAmount() {
        // GIVEN - An account with an initial balance of 100.
        account.setBalance(100);
        // WHEN - A withdrawal of 0 is made.
        account.withdraw(0);
        // THEN - The balance should remain 100.
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdraw_ExceedsBalance() {
        // GIVEN - An account with an initial balance of 100.
        account.setBalance(100);
        // WHEN - A withdrawal of 200 is attempted.
        account.withdraw(200);
        // THEN - The balance should remain 100.
        assertEquals(100, account.getBalance());
    }



}