package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    @Test
    public void transfer_WhenEnoughBalance_TransferSuccessful() {
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        bankTransfer.transfer(from, to, 30);

        assertEquals(69, from.getBalance());
        assertEquals(80, to.getBalance());
    }

    @Test
    public void transfer_WhenNotEnoughBalance_ExceptionThrown() {
        BankAccount from = new BankAccount(20);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        assertThrows(IllegalArgumentException.class, () -> bankTransfer.transfer(from, to, 30));
    }

    @Test
    public void openAccount_WithPositiveBalance_NewAccountCreated() {
        BankTransferImpl bankTransfer = new BankTransferImpl();

        BankAccount account = bankTransfer.openAccount(100);

        assertNotNull(account);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void openAccount_WithZeroBalance_NewAccountCreated() {
        BankTransferImpl bankTransfer = new BankTransferImpl();

        BankAccount account = bankTransfer.openAccount(0);

        assertNotNull(account);
        assertEquals(0, account.getBalance());
    }
}
