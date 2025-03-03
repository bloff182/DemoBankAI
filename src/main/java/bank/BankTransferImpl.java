package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTransferImplTests {

    private BankTransferImpl transferImpl = new BankTransferImpl();
    private BankAccount account1 = new BankAccount(100);
    private BankAccount account2 = new BankAccount(0);

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTransferFunds() {
        transferImpl.transferFunds(account1, account2, 50);
        assertEquals(50, account1.getBalance());
        assertEquals(50, account2.getBalance());
    }
}