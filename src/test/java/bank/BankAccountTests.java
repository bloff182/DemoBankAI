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
    void testSetBalance_NewAmount() {
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
        // WHEN - We deposit a positive amount into the account
        bankAccount.deposit(depositAmount);
        // THEN - The actual balance should be equal to the expected balance
        assertEquals(depositAmount, bankAccount.getBalance());
    }

    @Test
    void testWithdraw_PositiveAmount() {
        // GIVEN - An account with an initial balance of 100
        int withdrawAmount = 50;
        // WHEN - We withdraw a positive amount from the account
        bankAccount.withdraw(withdrawAmount);
        // THEN - The actual balance should be equal to the expected balance
        assertEquals(50, bankAccount.getBalance());
    }

    @Test
    void testWithdraw_ExceedingBalance() {
        // GIVEN - An account with an initial balance of 100
        int withdrawAmount = 200;
        // WHEN - We attempt to withdraw an amount exceeding the balance
        bankAccount.withdraw(withdrawAmount);
        // THEN - An exception should be thrown indicating insufficient funds
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(withdrawAmount));
    }

    @Test
    void testWithdraw_ZeroAmount() {
        // GIVEN - An account with an initial balance of 100
        int withdrawAmount = 0;
        // WHEN - We attempt to withdraw zero amount
        bankAccount.withdraw(withdrawAmount);
        // THEN - The balance should remain unchanged
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void testWithdraw_NegativeAmount() {
        // GIVEN - An account with an initial balance of 100
        int withdrawAmount = -50;
        // WHEN - We attempt to withdraw a negative amount
        bankAccount.withdraw(withdrawAmount);
        // THEN - An exception should be thrown indicating an invalid withdrawal amount
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(withdrawAmount));
    }



}