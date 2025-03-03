package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    private BankTransferImpl transferImpl = new BankTransferImpl();
    private BankAccount fromAccount;
    private BankAccount toAccount;

    @BeforeEach
    void setUp() {
        fromAccount = new BankAccount(100);
        toAccount = new BankAccount(0);
    }

    @Test
    void testTransferFunds() {
        transferImpl.transferFunds(fromAccount, toAccount, 50);
        assertEquals(50, toAccount.getBalance());
        assertEquals(50, fromAccount.getBalance());
    }
}