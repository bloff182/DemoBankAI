package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    @Test
    public void testTransfer_sufficientBalance_successfulTransfer() {
        BankAccount from = new BankAccount(100);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        bankTransfer.transfer(from, to, 30);

        assertEquals(69, from.getBalance());
        assertEquals(80, to.getBalance());
    }

    @Test
    public void testTransfer_insufficientBalance_throwException() {
        BankAccount from = new BankAccount(20);
        BankAccount to = new BankAccount(50);
        BankTransferImpl bankTransfer = new BankTransferImpl();

        assertThrows(IllegalArgumentException.class, () -> bankTransfer.transfer(from, to, 30));
    }

    @Test
    public void testOpenAccount_validBalance_newAccountCreated() {
        BankTransferImpl bankTransfer = new BankTransferImpl();

        BankAccount account = bankTransfer.openAccount(100);

        assertNotNull(account);
        assertEquals(100, account.getBalance());
    }
}
