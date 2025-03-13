package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTransferImplTests {

    private BankAccount fromAccount;
    private BankAccount toAccount;
    private BankTransferImpl bankTransfer;

    @BeforeEach
    public void setUp() {
        // GIVEN: Initialize accounts and transfer service before each test
        fromAccount = new BankAccount(100);  // Starting balance of 100
        toAccount = new BankAccount(0);      // Starting balance of 0
        bankTransfer = new BankTransferImpl();
    }

    @Test
    public void testSuccessfulTransfer() {
        // GIVEN: Sufficient funds in the source account
        int transferAmount = 10;
        
        // WHEN: Transfer is executed
        bankTransfer.transfer(fromAccount, toAccount, transferAmount);
        
        // THEN: The balance of both accounts should be updated correctly
        assertEquals(89, fromAccount.getBalance(), "The source account balance should decrease by the amount plus fee.");
        assertEquals(10, toAccount.getBalance(), "The destination account balance should increase by the transferred amount.");
    }

    @Test
    public void testTransferWithInsufficientFunds() {
        // GIVEN: Insufficient funds in the source account
        int transferAmount = 100;
        
        // WHEN: Attempting a transfer that exceeds available balance including fee
        assertThrows(IllegalArgumentException.class, () -> {
            bankTransfer.transfer(fromAccount, toAccount, transferAmount);
        }, "Expected an IllegalArgumentException due to insufficient funds.");
        
        // THEN: The source account balance should remain unchanged
        assertEquals(100, fromAccount.getBalance(), "The source account balance should not change when the transfer fails.");
    }

    @Test
    public void testOpenNewAccount() {
        // GIVEN: No initial setup needed for opening a new account
        
        // WHEN: A new account is opened with an initial balance
        BankAccount newAccount = bankTransfer.openAccount(50);
        
        // THEN: The new account should have the correct starting balance
        assertEquals(50, newAccount.getBalance(), "The new account should start with the specified balance.");
    }
}