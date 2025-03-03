package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @BeforeEach
    void setUp() {
        // Reset the balance for each test case
    }

    @Test
    void testGetBalance() {
        // GIVEN a BankAccount object with an initial balance of 0
        BankAccount account = new BankAccount();
        // WHEN we get the balance using the getBalance method
        int actualBalance = account.getBalance();
        // THEN the balance should be equal to 0
        assertEquals(0, actualBalance);
    }

    @Test
    void testDeposit() {
        // GIVEN a BankAccount object with an initial balance of 0
        BankAccount account = new BankAccount();
        // WHEN we deposit $100 using the deposit method
        account.deposit(100);
        // THEN the balance should be equal to $100
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdraw() {
        // GIVEN a BankAccount object with an initial balance of 100
        BankAccount account = new BankAccount(100);
        // WHEN we withdraw $50 using the withdraw method
        account.withdraw(50);
        // THEN the balance should be equal to $50
        assertEquals(50, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        // GIVEN a BankAccount object with an initial balance of 100
        BankAccount account = new BankAccount();
        // WHEN we deposit a negative amount using the deposit method
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }

    @Test
    void testWithdrawNegativeAmount() {
        // GIVEN a BankAccount object with an initial balance of 100
        BankAccount account = new BankAccount();
        // WHEN we withdraw a negative amount using the withdraw method
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
    }

}