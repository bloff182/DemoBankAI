package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTransferImplTests {

    private BankAccount from;
    private BankAccount to;
    private BankTransferImpl transfer;

    @BeforeEach
    public void setup() {
        from = new BankAccount(100);
        to = new BankAccount(0);
        transfer = new BankTransferImpl();
    }

    @Test
    public void testTransfer_GivenEnoughBalance_WhenTransferredThenBalanceIsUpdatedCorrectly() {
        // GIVEN
        int amount = 50;

        // WHEN
        transfer.transfer(from, to, amount);

        // THEN
        assertEquals(50, from.getBalance());
        assertEquals(50, to.getBalance());
    }

    @Test
    public void testTransfer_LowBalance_WhenTransferredThenThrowException() {
        // GIVEN
        int amount = 100;

        // WHEN
        assertThrows(IllegalArgumentException.class, () -> transfer.transfer(from, to, amount));
    }
}