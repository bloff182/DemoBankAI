package bank;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount();
    }

    @Test
    void testGetAmount() {
        // GIVEN
        int expectedBalance = 0;
        
        // WHEN
        int actualBalance = account.getAmount();
        
        // THEN
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    void testGetBalance() {
        // GIVEN
        int expectedBalance = 100;
        
        // WHEN
        account.setBalance(100);
        int actualBalance = account.getBalance();
        
        // THEN
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    void testSetBalance() {
        // GIVEN
        int expectedBalance = 100;
        
        // WHEN
        account.setBalance(100);
        
        // THEN
        assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    void testDeposit() {
        // GIVEN
        int initialBalance = 0;
        int depositAmount = 100;
        
        // WHEN
        account.deposit(depositAmount);
        
        // THEN
        assertEquals(initialBalance + depositAmount, account.getAmount());
    }

    @Test
    void testWithdraw() {
        // GIVEN
        int initialBalance = 100;
        int withdrawAmount = 50;
        
        // WHEN
        account.withdraw(withdrawAmount);
        
        // THEN
        assertEquals(initialBalance - withdrawAmount, account.getAmount());
    }

    @Test
    void testDepositNegativeAmount() {
        // GIVEN
        int initialBalance = 0;
        int depositAmount = -100;
        
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> account.deposit(depositAmount));
    }

    @Test
    void testWithdrawNegativeAmount() {
        // GIVEN
        int initialBalance = 100;
        int withdrawAmount = -50;
        
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(withdrawAmount));
    }
}