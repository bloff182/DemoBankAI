package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankDemoTests {

    @Test
    void testBankDemo() {
        BankTransferImpl bank = new BankTransferImpl();
        BankAccount account1 = bank.openAccount(5000);
        BankAccount account2 = bank.openAccount(1000);
        account1.setBalance(6002);
        assertEquals("BankAccount [balance=6002]", account1.toString());
        assertEquals("BankAccount [balance=1000]", account2.toString());
    }
}
