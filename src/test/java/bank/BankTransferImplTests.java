package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    @Test
    void transfer_WhenSufficientBalance_TransfersSuccessfully() {
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
    void transfer_WhenInsufficientBalance_ThrowsException() {
        // Arrange
        BankAccount from = new BankAccount(20);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> bankTransfer.transfer(from, to, 30));
    }

    @Test
    void openAccount_WithPositiveBalance_CreatesAccountSuccessfully() {
        // Arrange
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // Act
        BankAccount account = bankTransfer.openAccount(100);

        // Assert
        assertEquals(100, account.getBalance());
    }
}
