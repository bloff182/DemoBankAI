package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountNewGeneratedAiTests {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    @Test
    void testGetAmount() {
        // GIVEN - A bank account with an initial balance of 0
        int expectedAmount = 0;
        // WHEN - We call the getAmount method
        int actualAmount = bankAccount.getAmount();
        // THEN - The returned amount should be equal to the expected amount
        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    void testGetBalance() {
        // GIVEN - A bank account with an initial balance of 0
        int expectedBalance = 0;
        // WHEN - We call the getBalance method
        int actualBalance = bankAccount.getBalance();
        // THEN - The returned balance should be equal to the expected balance
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    void testSetBalance() {
        // GIVEN - A bank account with an initial balance of 0
        int newBalance = 100;
        // WHEN - We call the setBalance method with the new balance
        bankAccount.setBalance(newBalance);
        // THEN - The balance should be updated to the new balance
        assertEquals(newBalance, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        // GIVEN - A bank account with an initial balance of 0
        int depositAmount = 50;
        // WHEN - We call the deposit method with the deposit amount
        bankAccount.deposit(depositAmount);
        // THEN - The balance should be increased by the deposit amount
        assertEquals(depositAmount, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        // GIVEN - A bank account with an initial balance of 100
        bankAccount = new BankAccount(100);
        int withdrawAmount = 25;
        // WHEN - We call the withdraw method with the withdraw amount
        bankAccount.withdraw(withdrawAmount);
        // THEN - The balance should be decreased by the withdraw amount
        assertEquals(75, bankAccount.getBalance());
    }

    @Test
    void testToString() {
        // GIVEN - A bank account with a balance of 50
        bankAccount = new BankAccount(50);
        // WHEN - We call the toString method
        String actualString = bankAccount.toString();
        // THEN - The returned string should contain the balance
        assertTrue(actualString.contains("50"));
    }

}