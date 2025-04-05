package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTransfer_Success() {
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(0);
        int amount = 50;
        assertEquals(from.getBalance(), 50, "From balance should be 50 after transfer");
        assertEquals(to.getBalance(), 50, "To balance should be 50 after transfer");
    }

    @Test
    void testTransfer_InsufficientFunds() {
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(0);
        int amount = 100;
        assertThrows(IllegalArgumentException.class, () -> {
            from.withdraw(amount);
        });
    }

    @Test
    void testTransfer_ZeroAmount() {
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(0);
        int amount = 0;
        assertEquals(from.getBalance(), 100, "From balance should be 100 after transfer");
        assertEquals(to.getBalance(), 0, "To balance should be 0 after transfer");
    }

}