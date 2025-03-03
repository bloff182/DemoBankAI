package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTransferImplTests {

    @BeforeEach
    void setUp() {
        // Setup code here
    }

    @Test
    void testTransferFunds() {
        BankAccount fromAccount = new BankAccount("1234567890", 1000.0);
        BankAccount toAccount = new BankAccount("9876543210", 0.0);

        BankTransferImpl transfer = new BankTransferImpl();
        transfer.transferFunds(fromAccount, toAccount, 500.0);

        assert fromAccount.getBalance() == 500.0;
        assert toAccount.getBalance() == 500.0;
    }
}