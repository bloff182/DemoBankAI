package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    @Test
    public void transfer_WhenEnoughBalance_TransferSuccessful() {
        // Given
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // When
        bankTransfer.transfer(from, to, 30);

        // Then
        assertEquals(69, from.getBalance());
        assertEquals(80, to.getBalance());
    }

    @Test
    public void transfer_WhenNotEnoughBalance_ExceptionThrown() {
        // Given
        BankAccount from = new BankAccount(20);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // When, Then
        assertThrows(IllegalArgumentException.class, () -> bankTransfer.transfer(from, to, 30));
    }

    @Test
    public void openAccount_WithInitialBalance_NewAccountCreated() {
        // Given
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // When
        BankAccount account = bankTransfer.openAccount(100);

        // Then
        assertNotNull(account);
        assertEquals(100, account.getBalance());
    }
}
