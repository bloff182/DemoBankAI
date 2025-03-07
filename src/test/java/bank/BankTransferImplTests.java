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
        fromAccount = new BankAccount("From Account", 1000);
        toAccount = new BankAccount("To Account", 0);
    }

    @Test
    void testTransferFunds() {
        transferImpl.transfer(fromAccount, toAccount, 50);
        assertEquals(950, fromAccount.getBalance());
        assertEquals(50, toAccount.getBalance());
    }
}