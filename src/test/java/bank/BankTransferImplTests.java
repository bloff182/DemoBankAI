package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTransferImplTests {

    @BeforeEach
    void setUp() {
// improved
    }

    @Test
    void testTransferFunds() {
        BankTransferImpl bankTransferImpl = new BankTransferImpl();
        BankAccount account1 = new BankAccount("123", 100.0);
        BankAccount account2 = new BankAccount("456", 0.0);
        bankTransferImpl.transferFunds(account1, account2, 50.0);
        assertEquals(50.0, account2.getBalance(), 0.01);
        assertEquals(50.0, account1.getBalance(), 0.01);
    }
}