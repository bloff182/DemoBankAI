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
    void testGetAmount() {
        assertEquals(0, bankAccount.getAmount());
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(100);
        assertEquals(100, bankAccount.getAmount());
    }

    @Test
    void testWithdraw() {
        bankAccount.deposit(100);
        bankAccount.withdraw(50);
        assertEquals(50, bankAccount.getAmount());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(100));
    }


}