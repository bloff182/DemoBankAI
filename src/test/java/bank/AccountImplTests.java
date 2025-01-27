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
        // WHEN - The number is retrieved
        String actualNumber = account.getNumber();
        // THEN - The returned number should be null
        assertNull(actualNumber);
    }

    @Test
    void testSetNumber() {
        // GIVEN - An account instance
        // WHEN - The number is set to "1234567890"
        account.setNumber("1234567890");
        // THEN - The retrieved number should be "1234567890"
        assertEquals("1234567890", account.getNumber());
    }

    @Test
    void getType() {
        // GIVEN - An account instance
        // WHEN - The type is retrieved
        String actualType = account.getType();
        // THEN - The returned type should be null
        assertNull(actualType);
    }

    @Test
    void setType() {
        // GIVEN - An account instance
        // WHEN - The type is set to "Savings"
        account.setType("Savings");
        // THEN - The retrieved type should be "Savings"
        assertEquals("Savings", account.getType());
    }

    @Test
    void testToString() {
        // GIVEN - An account instance with number "1234567890" and type "Checking"
        account.setNumber("1234567890");
        account.setType("Checking");
        // WHEN - The toString method is called
        String actualString = account.toString();
        // THEN - The returned string should be "AccountImpl{number='1234567890', type='Checking'}"
        assertEquals("AccountImpl{number='1234567890', type='Checking'}", actualString);
    }
}