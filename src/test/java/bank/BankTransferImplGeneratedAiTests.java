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
    void transfer_successfulTransfer() {
        // GIVEN
        int amount = 50;
        // WHEN
        bankTransferImpl.transfer(fromAccount, toAccount, amount);
        // THEN
        assertEquals(50, toAccount.getBalance());
        assertEquals(50, fromAccount.getBalance());
    }

    @Test
    void transfer_insufficientFunds() {
        // GIVEN
        int amount = 150;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> bankTransferImpl.transfer(fromAccount, toAccount, amount));
        // THEN
        assertEquals(100, fromAccount.getBalance());
        assertEquals(0, toAccount.getBalance());
    }

    @Test
    void openAccount_defaultBalance() {
        // GIVEN
        // WHEN
        BankAccount newAccount = bankTransferImpl.openAccount(0);
        // THEN
        assertEquals(0, newAccount.getBalance());
    }

    @Test
    void openAccount_positiveBalance() {
        // GIVEN
        int balance = 250;
        // WHEN
        BankAccount newAccount = bankTransferImpl.openAccount(balance);
        // THEN
        assertEquals(balance, newAccount.getBalance());
    }

}