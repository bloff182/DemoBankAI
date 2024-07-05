package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    @Test
    void transfer_WhenEnoughBalance_TransferSuccessful() {
        // Arrange
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // Act
        bankTransfer.transfer(from, to, 30);

        // Assert
        assertEquals(69, from.getBalance());
        assertEquals(80, to.getBalance());
    }

    @Test
    void transfer_WhenNotEnoughBalance_ExceptionThrown() {
        // Arrange
        BankAccount from = new BankAccount(20);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> bankTransfer.transfer(from, to, 30));
    }

    @Test
    void openAccount_WithInitialBalance_NewAccountCreated() {
        // Arrange
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // Act
        BankAccount account = bankTransfer.openAccount(100);

        // Assert
        assertNotNull(account);
        assertEquals(100, account.getBalance());
    }
}
