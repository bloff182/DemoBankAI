package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTransfer_Success() {
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(0);
        int amount = 50;
        try {
            BankTransferImpl.transfer(from, to, amount);
        } catch (IllegalArgumentException e) {
            fail("Expected no exception");
        }
    }

    @Test
    void testTransfer_InsufficientFunds() {
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(0);
        int amount = 150;
        try {
            BankTransferImpl.transfer(from, to, amount);
        } catch (IllegalArgumentException e) {
            assertEquals("You have no enought money!!!", e.getMessage());
        }
    }

    @Test
    void testTransfer_ZeroAmount() {
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(0);
        int amount = 0;
        try {
            BankTransferImpl.transfer(from, to, amount);
        } catch (IllegalArgumentException e) {
            assertEquals("Amount is negative", e.getMessage());
        }
    }

}