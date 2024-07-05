package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    public void givenNewAccount_whenGetAmount_thenZero() {
        BankAccount account = new BankAccount();
        int amount = account.getAmount();
        assertEquals(0, amount);
    }

    @Test
    public void givenAccountWithBalance_whenGetAmount_thenBalance() {
        BankAccount account = new BankAccount(100);
        int amount = account.getAmount();
        assertEquals(100, amount);
    }

    @Test
    public void givenAccountWithBalance_whenGetBalance_thenBalance() {
        BankAccount account = new BankAccount(200);
        int balance = account.getBalance();
        assertEquals(200, balance);
    }

    @Test
    public void givenAccount_whenSetBalance_thenUpdatedBalance() {
        BankAccount account = new BankAccount();
        account.setBalance(300);
        int balance = account.getBalance();
        assertEquals(300, balance);
    }

    @Test
    public void givenAccount_whenDepositValidAmount_thenBalanceIncreased() {
        BankAccount account = new BankAccount();
        account.deposit(50);
        int balance = account.getBalance();
        assertEquals(50, balance);
    }

    @Test
    public void givenAccount_whenWithdrawValidAmount_thenBalanceDecreased() {
        BankAccount account = new BankAccount(100);
        account.withdraw(30);
        int balance = account.getBalance();
        assertEquals(70, balance);
    }

    @Test
    public void givenAccount_whenWithdrawNegativeAmount_thenExceptionThrown() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-30));
    }

    @Test
    public void givenAccount_whenToString_thenCorrectStringRepresentation() {
        BankAccount account = new BankAccount(150);
        String expected = "BankAccount [balance=150]";
        String actual = account.toString();
        assertEquals(expected, actual);
    }
}
