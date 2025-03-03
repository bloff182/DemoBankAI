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
    void testDeposit() {
        double amount = 100.0;
        bankAccount.deposit(amount);
        assertEquals(amount, bankAccount.getBalance(), 0.001);
    }

    @Test
    void testWithdraw() {
        double initialBalance = 200.0;
        bankAccount.setBalance(initialBalance);
        double amount = 50.0;
        bankAccount.withdraw(amount);
        assertEquals(initialBalance - amount, bankAccount.getBalance(), 0.001);
    }

    @Test
    void testInsufficientFunds() {
        double initialBalance = 100.0;
        bankAccount.setBalance(initialBalance);
        double amount = 200.0;
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(amount));
    }

    @Test
    void testZeroDeposit() {
        double amount = 0.0;
        bankAccount.deposit(amount);
        assertEquals(0.0, bankAccount.getBalance(), 0.001);
    }


}