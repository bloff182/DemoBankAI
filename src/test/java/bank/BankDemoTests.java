package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankDemoTests {

    @Test
    public void testBankDemo() {
        // Given
        BankTransferImpl bank = new BankTransferImpl();
        
        // When
        BankAccount account1 = bank.openAccount(5000);
        BankAccount account2 = bank.openAccount(1000);
        
        account1.setBalance(6002);

        // Then
        assertNotNull(account1);
        assertNotNull(account2);
        assertEquals(6002, account1.getBalance());
        assertEquals(1000, account2.getBalance());
    }
}
