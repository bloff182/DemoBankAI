package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountImplTests {

    private AccountImpl account;

    @BeforeEach
    void setUp() {
        account = new AccountImpl();
    }

    @Test
    void testGetNumber() {
        // GIVEN - An account instance
        // WHEN - The getNumber method is called
        String number = account.getNumber();
        // THEN - The returned number should be null
        assertNull(number);
    }

    @Test
    void testSetNumber() {
        // GIVEN - An account instance
        // WHEN - The setNumber method is called with a value
        account.setNumber("1234567890");
        // THEN - The returned number should be the set value
        assertEquals("1234567890", account.getNumber());
    }

    @Test
    void testGetType() {
        // GIVEN - An account instance
        // WHEN - The getType method is called
        String type = account.getType();
        // THEN - The returned type should be null
        assertNull(type);
    }

    @Test
    void testSetType() {
        // GIVEN - An account instance
        // WHEN - The setType method is called with a value
        account.setType("Savings");
        // THEN - The returned type should be the set value
        assertEquals("Savings", account.getType());
    }

    @Test
    void testToString() {
        // GIVEN - An account instance
        // WHEN - The toString method is called
        String accountString = account.toString();
        // THEN - The returned string should contain the number and type
        assertTrue(accountString.contains("number='"));
        assertTrue(accountString.contains("type='"));
    }
}