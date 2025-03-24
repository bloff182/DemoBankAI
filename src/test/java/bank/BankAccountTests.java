package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    void testGetAmount() {
        BankAccount bankAccount = new BankAccount(100);
        assertEquals(100, bankAccount.getAmount());
    }

    @Test
    void testGetBalance() {
        BankAccount bankAccount = new BankAccount(200);
        assertEquals(200, bankAccount.getBalance());
    }

}