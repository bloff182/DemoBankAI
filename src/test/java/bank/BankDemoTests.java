package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankDemoTests {

    @Test
    void testBankDemo() {
        // Arrange
        BankTransferImpl bank = new BankTransferImpl();
        BankAccount account1 = bank.openAccount(5000);
        BankAccount account2 = bank.openAccount(1000);
        account1.setBalance(6002);

        // Act
        String account1String = account1.toString();
        String account2String = account2.toString();

        // Assert
        assertEquals("BankAccount [balance=6002]", account1String);
        assertEquals("BankAccount [balance=1000]", account2String);
    }
}
