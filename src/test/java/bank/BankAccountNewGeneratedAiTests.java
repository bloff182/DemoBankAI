package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountNewGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // Initialize the account balance to 0 before each test
    }

    @Test
    void testGetBalance_InitialBalance() {
        // GIVEN a new BankAccount object with an initial balance of 100
        BankAccount account = new BankAccount(100);
        // WHEN we get the balance
        int balance = account.getBalance();
        // THEN the balance should be 100
        assertEquals(100, balance);
    }

    @Test
    void testWithdraw_PositiveAmount() {
        // GIVEN a new BankAccount object with an initial balance of 100
        BankAccount account = new BankAccount(100);
        // WHEN we withdraw a positive amount
        int amount = 50;
        account.withdraw(amount);
        // THEN the balance should be decreased by the withdrawn amount
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdraw_ZeroAmount() {
        // GIVEN a new BankAccount object with an initial balance of 100
        BankAccount account = new BankAccount(100);
        // WHEN we withdraw a zero amount
        int amount = 0;
        account.withdraw(amount);
        // THEN the balance should remain unchanged
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdraw_NegativeAmount() {
        // GIVEN a new BankAccount object with an initial balance of 100
        BankAccount account = new BankAccount(100);
        // WHEN we withdraw a negative amount
        int amount = -50;
        account.withdraw(amount);
        // THEN the balance should remain unchanged
        assertEquals(100, account.getBalance());
    }

}