package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountImplTests {

    @Test
    public void testGetNumber() {
        AccountImpl account = new AccountImpl();
        account.setNumber("12345");
        assertEquals("12345", account.getNumber());
    }

    @Test
    public void testGetType() {
        AccountImpl account = new AccountImpl();
        account.setType("Savings");
        assertEquals("Savings", account.getType());
    }

    @Test
    public void testToString() {
        AccountImpl account = new AccountImpl();
        account.setNumber("12345");
        account.setType("Savings");
        assertEquals("AccountImpl{number='12345', type='Savings'}", account.toString());
    }
}