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
        // GIVEN - A BankAccount object is created with an initial balance of 0.
        // WHEN - The getAmount method is called on the bankAccount object.
        int actualAmount = bankAccount.getAmount();
        // THEN - The returned amount should be equal to the initial balance, which is 0.
        assertEquals(0, actualAmount);
    }

    @Test
    void testGetBalance() {
        // GIVEN - A BankAccount object is created with an initial balance of 0.
        // WHEN - The getBalance method is called on the bankAccount object.
        int actualBalance = bankAccount.getBalance();
        // THEN - The returned balance should be equal to the initial balance, which is 0.
        assertEquals(0, actualBalance);
    }

    @Test
    void testSetBalance() {
        // GIVEN - A BankAccount object is created with an initial balance of 0.
        // WHEN - The setBalance method is called on the bankAccount object, setting the balance to 100.
        bankAccount.setBalance(100);
        // THEN - The balance should be updated to 100 when calling getAmount or getBalance.
        assertEquals(100, bankAccount.getAmount());
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        // GIVEN - A BankAccount object is created with an initial balance of 0.
        // WHEN - The deposit method is called on the bankAccount object, depositing 50.
        bankAccount.deposit(50);
        // THEN - The balance should be increased by 50.
        assertEquals(50, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        // GIVEN - A BankAccount object is created with an initial balance of 100.
        bankAccount.setBalance(100);
        // WHEN - The withdraw method is called on the bankAccount object, withdrawing 50.
        bankAccount.withdraw(50);
        // THEN - The balance should be decreased by 50.
        assertEquals(50, bankAccount.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        // GIVEN - A BankAccount object is created with an initial balance of 100.
        bankAccount.setBalance(100);
        // WHEN - The deposit method is called on the bankAccount object, attempting to deposit a negative amount (-50).
        // THEN - An IllegalArgumentException should be thrown because the amount is negative.
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-50));
    }

    @Test
    void testWithdrawNegativeAmount() {
        // GIVEN - A BankAccount object is created with an initial balance of 100.
        bankAccount.setBalance(100);
        // WHEN - The withdraw method is called on the bankAccount object, attempting to withdraw a negative amount (-50).
        // THEN - An IllegalArgumentException should be thrown because the amount is negative.
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-50));
    }

}