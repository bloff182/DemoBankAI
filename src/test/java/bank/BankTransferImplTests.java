package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransferImplTests {

    private BankTransferImpl transferImpl;
    private BankAccount fromAccount;
    private BankAccount toAccount;

    @BeforeEach
    void setUp() {
        transferImpl = new BankTransferImpl();
        fromAccount = new BankAccount(100);
        toAccount = new BankAccount(0);
    }

    @Test
    void transfer_SuccessfulTransfer() {
        // GIVEN
        int amount = 50;
        // WHEN
        transferImpl.transfer(fromAccount, toAccount, amount);
        // THEN
        assertEquals(50, toAccount.getBalance());
        assertEquals(50, fromAccount.getBalance());
    }

    @Test
    void transfer_InsufficientFunds() {
        // GIVEN
        int amount = 150;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> transferImpl.transfer(fromAccount, toAccount, amount));
        // THEN
        assertEquals(100, fromAccount.getBalance());
    }

    @Test
    void openAccount_InitialBalance() {
        // GIVEN
        int balance = 250;
        // WHEN
        BankAccount newAccount = transferImpl.openAccount(balance);
        // THEN
        assertEquals(balance, newAccount.getBalance());
    }
}