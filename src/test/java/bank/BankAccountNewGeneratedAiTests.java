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
        // GIVEN - A BankAccount object is created
        // WHEN - The getAmount method is called
        int actualAmount = bankAccount.getAmount();
        // THEN - The returned amount should be 0
        assertEquals(0, actualAmount);
    }

    @Test
    void testGetBalance() {
        // GIVEN - A BankAccount object is created
        // WHEN - The getBalance method is called
        int actualBalance = bankAccount.getBalance();
        // THEN - The returned balance should be 0
        assertEquals(0, actualBalance);
    }

    @Test
    void testSetBalance() {
        // GIVEN - A BankAccount object is created
        // WHEN - The setBalance method is called with a value of 100
        bankAccount.setBalance(100);
        // THEN - The balance should be updated to 100
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        // GIVEN - A BankAccount object is created
        // WHEN - The deposit method is called with a value of 50
        bankAccount.deposit(50);
        // THEN - The balance should be increased by 50
        assertEquals(50, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        // GIVEN - A BankAccount object is created and the balance is set to 100
        bankAccount.setBalance(100);
        // WHEN - The withdraw method is called with a value of 25
        bankAccount.withdraw(25);
        // THEN - The balance should be decreased by 25
        assertEquals(75, bankAccount.getBalance());
    }

    @Test
    void testToString() {
        // GIVEN - A BankAccount object is created and the balance is set to 100
        bankAccount.setBalance(100);
        // WHEN - The toString method is called
        String actualString = bankAccount.toString();
        // THEN - The returned string should represent the BankAccount object with its balance
        assertTrue(actualString.contains("BankAccount [balance=100]"));
    }

    @Test
    void testDepositNegativeAmount() {
        // GIVEN - A BankAccount object is created
        // WHEN - The deposit method is called with a negative amount (-5)
        try {
            bankAccount.deposit(-5);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // THEN - An IllegalArgumentException should be thrown with the message "Amount is negative"
            assertEquals("Amount is negative", e.getMessage());
        }
    }

    @Test
    void testWithdrawNegativeAmount() {
        // GIVEN - A BankAccount object is created and the balance is set to 100
        bankAccount.setBalance(100);
        // WHEN - The withdraw method is called with a negative amount (-25)
        try {
            bankAccount.withdraw(-25);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // THEN - An IllegalArgumentException should be thrown with the message "Amount is negative"
            assertEquals("Amount is negative", e.getMessage());
        }
    }

}