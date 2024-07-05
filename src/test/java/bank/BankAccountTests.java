package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    public void givenNewAccount_whenGetAmount_thenBalanceIsZero() {
        BankAccount account = new BankAccount();
        int amount = account.getAmount();
        assertEquals(0, amount);
    }

    @Test
    public void givenAccountWithBalance100_whenGetBalance_thenReturn100() {
        BankAccount account = new BankAccount(100);
        int balance = account.getBalance();
        assertEquals(100, balance);
    }

    @Test
    public void givenAccountWithBalance50_whenDeposit100_thenBalanceIs150() {
        BankAccount account = new BankAccount(50);
        account.deposit(100);
        int balance = account.getBalance();
        assertEquals(150, balance);
    }

    @Test
    public void givenAccountWithBalance200_whenWithdraw50_thenBalanceIs150() {
        BankAccount account = new BankAccount(200);
        account.withdraw(50);
        int balance = account.getBalance();
        assertEquals(150, balance);
    }

    @Test
    public void givenAccountWithBalance300_whenWithdraw200_thenBalanceIs100() {
        BankAccount account = new BankAccount(300);
        account.withdraw(200);
        int balance = account.getBalance();
        assertEquals(100, balance);
    }

    @Test
    public void givenAccountWithBalance500_whenToString_thenCorrectStringRepresentation() {
        BankAccount account = new BankAccount(500);
        String expected = "BankAccount [balance=500]";
        String actual = account.toString();
        assertEquals(expected, actual);
    }
}
