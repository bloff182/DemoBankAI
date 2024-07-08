package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountImplTests {

    @Test
    public void givenAccountNumber_whenGetNumber_thenReturnNumber() {
        // GIVEN
        AccountImpl account = new AccountImpl();
        account.setNumber("123456");

        // WHEN
        String number = account.getNumber();

        // THEN
        assertEquals("123456", number);
    }

    @Test
    public void givenAccountType_whenGetType_thenReturnType() {
        // GIVEN
        AccountImpl account = new AccountImpl();
        account.setType("Savings");

        // WHEN
        String type = account.getType();

        // THEN
        assertEquals("Savings", type);
    }

    @Test
    public void givenAccountDetails_whenToString_thenReturnFormattedString() {
        // GIVEN
        AccountImpl account = new AccountImpl();
        account.setNumber("789012");
        account.setType("Checking");

        // WHEN
        String accountString = account.toString();

        // THEN
        assertEquals("AccountImpl{number='789012', type='Checking'}", accountString);
    }
}
