package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountNewGeneratedAiTests {

    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    @Test
    void testGetAmount() {
        // GIVEN - A BankAccount object with an initial balance of 0
        // WHEN - The getAmount method is called
        // THEN - The returned amount should be 0
        assertEquals(0, bankAccount.getAmount());
    }

    @Test
    void testGetBalance() {
        // GIVEN - A BankAccount object with an initial balance of 0
        // WHEN - The getBalance method is called
        // THEN - The returned balance should be 0
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void testSetBalance() {
        // GIVEN - A BankAccount object with an initial balance of 0
        // WHEN - The setBalance method is called with a value of 100
        // THEN - The balance should be updated to 100
        bankAccount.setBalance(100);
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        // GIVEN - A BankAccount object with an initial balance of 0
        // WHEN - The deposit method is called with a value of 50
        // THEN - The balance should be increased by 50
        bankAccount.deposit(50);
        assertEquals(50, bankAccount.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        // GIVEN - A BankAccount object with an initial balance of 0
        // WHEN - The deposit method is called with a negative value (-10)
        // THEN - An IllegalArgumentException should be thrown
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-10));
    }

    @Test
    void testWithdraw() {
        // GIVEN - A BankAccount object with an initial balance of 100
        bankAccount.setBalance(100);
        // WHEN - The withdraw method is called with a value of 25
        // THEN - The balance should be decreased by 25
        bankAccount.withdraw(25);
        assertEquals(75, bankAccount.getBalance());
    }

    @Test
    void testWithdrawNegativeAmount() {
        // GIVEN - A BankAccount object with an initial balance of 100
        bankAccount.setBalance(100);
        // WHEN - The withdraw method is called with a negative value (-25)
        // THEN - An IllegalArgumentException should be thrown
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-25));
    }

    @Test
    void testToString() {
        // GIVEN - A BankAccount object with a balance of 50
        bankAccount.setBalance(50);
        // WHEN - The toString method is called
        // THEN - The returned string should represent the BankAccount object with its balance
        assertEquals("BankAccount [balance=50]", bankAccount.toString());
    }

}