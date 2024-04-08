package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    @Test
    public void testTransfer_EnoughBalance() {
        // Arrange
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(50);
        BankTransferImpl transfer = new BankTransferImpl();

        // Act
        transfer.transfer(from, to, 30);

        // Assert
        assertEquals(69, from.getBalance());
        assertEquals(80, to.getBalance());
    }

    @Test
    public void testTransfer_NotEnoughBalance() {
        // Arrange
        BankAccount from = new BankAccount(20);
        BankAccount to = new BankAccount(50);
        BankTransferImpl transfer = new BankTransferImpl();

        // Act and Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            transfer.transfer(from, to, 30);
        });
        assertEquals("You have no enought money!!!", exception.getMessage());
    }

    @Test
    public void testOpenAccount() {
        // Arrange
        BankTransferImpl transfer = new BankTransferImpl();

        // Act
        BankAccount account = transfer.openAccount(100);

        // Assert
        assertEquals(100, account.getBalance());
    }
}