package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    @Test
    public void givenValidTransfer_whenTransfer_thenAmountTransferred() {
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
    public void givenInsufficientFunds_whenTransfer_thenThrowException() {
        // Given
        BankAccount from = new BankAccount(20);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // When, Then
        assertThrows(IllegalArgumentException.class, () -> bankTransfer.transfer(from, to, 30));
    }

    @Test
    public void givenNegativeAmount_whenTransfer_thenThrowException() {
        // Given
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        // When, Then
        assertThrows(IllegalArgumentException.class, () -> bankTransfer.transfer(from, to, -10));
    }
}
