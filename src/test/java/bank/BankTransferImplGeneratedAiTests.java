package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransferImplGeneratedAiTests {

    private BankTransferImpl bankTransferImpl;
    private BankAccount fromAccount;
    private BankAccount toAccount;

    @BeforeEach
    void setUp() {
        bankTransferImpl = new BankTransferImpl();
        fromAccount = bankTransferImpl.openAccount(100);
        toAccount = bankTransferImpl.openAccount(0);
    }

    @Test
    void transfer_SuccessfulTransfer() {
        // GIVEN
        int amount = 50;
        // WHEN
        bankTransferImpl.transfer(fromAccount, toAccount, amount);
        // THEN
        assertEquals(50, toAccount.getBalance());
        assertEquals(50, fromAccount.getBalance());
    }

    @Test
    void transfer_InsufficientFunds() {
        // GIVEN
        int amount = 150;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> bankTransferImpl.transfer(fromAccount, toAccount, amount));
        // THEN
        assertEquals(100, fromAccount.getBalance());
    }

    @Test
    void openAccount_DefaultBalance() {
        // GIVEN
        // WHEN
        BankAccount account = bankTransferImpl.openAccount(0);
        // THEN
        assertEquals(0, account.getBalance());
    }

    @Test
    void openAccount_InitialBalance() {
        // GIVEN
        int balance = 250;
        // WHEN
        BankAccount account = bankTransferImpl.openAccount(balance);
        // THEN
        assertEquals(balance, account.getBalance());
    }
}