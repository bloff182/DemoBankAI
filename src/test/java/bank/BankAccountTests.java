package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    @Test
    void testGetAmount_InitialBalance() {
        // GIVEN - An account with an initial balance of 0
        int expectedAmount = 0;
        // WHEN - We get the amount from the bank account
        int actualAmount = bankAccount.getAmount();
        // THEN - The actual amount should equal the expected amount
        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    void testGetBalance_InitialBalance() {
        // GIVEN - An account with an initial balance of 0
        int expectedBalance = 0;
        // WHEN - We get the balance from the bank account
        int actualBalance = bankAccount.getBalance();
        // THEN - The actual balance should equal the expected balance
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    void testSetBalance_NewBalance() {
        // GIVEN - An account with an initial balance of 0
        int newBalance = 100;
        // WHEN - We set a new balance for the bank account
        bankAccount.setBalance(newBalance);
        // THEN - The actual balance should equal the new balance
        assertEquals(newBalance, bankAccount.getBalance());
    }

    @Test
    void testDeposit_PositiveAmount() {
        // GIVEN - An account with an initial balance of 0
        int depositAmount = 50;
        // WHEN - We deposit a positive amount into the bank account
        bankAccount.deposit(depositAmount);
        // THEN - The actual balance should equal the expected balance (initial balance + deposit amount)
        assertEquals(depositAmount, bankAccount.getBalance());
    }

    @Test
    void testWithdraw_PositiveAmount() {
        // GIVEN - An account with an initial balance of 100
        bankAccount = new BankAccount(100);
        int withdrawAmount = 25;
        // WHEN - We withdraw a positive amount from the bank account
        bankAccount.withdraw(withdrawAmount);
        // THEN - The actual balance should equal the expected balance (initial balance - withdraw amount)
        assertEquals(75, bankAccount.getBalance());
    }

    @Test
    void testDeposit_NegativeAmount() {
        // GIVEN - An account with an initial balance of 0
        int depositAmount = -50;
        // WHEN - We attempt to deposit a negative amount into the bank account
        // THEN - An IllegalArgumentException should be thrown
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(depositAmount));
    }

    @Test
    void testWithdraw_NegativeAmount() {
        // GIVEN - An account with an initial balance of 0
        int withdrawAmount = -50;
        // WHEN - We attempt to withdraw a negative amount from the bank account
        // THEN - An IllegalArgumentException should be thrown
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(withdrawAmount));
    }

}