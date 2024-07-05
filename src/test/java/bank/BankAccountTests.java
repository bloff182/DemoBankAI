package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    public void givenNewAccount_whenGetAmount_thenInitialBalanceZero() {
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
    public void givenAccountWithBalance200_whenSetBalance_thenBalanceUpdated() {
        BankAccount account = new BankAccount();
        account.setBalance(200);
        int balance = account.getBalance();
        assertEquals(200, balance);
    }

    @Test
    public void givenAccountWithBalance300_whenDeposit100_thenBalanceIncreased() {
        BankAccount account = new BankAccount(300);
        account.deposit(100);
        int balance = account.getBalance();
        assertEquals(400, balance);
    }

    @Test
    public void givenAccountWithBalance400_whenWithdraw200_thenBalanceDecreased() {
        BankAccount account = new BankAccount(400);
        account.withdraw(200);
        int balance = account.getBalance();
        assertEquals(200, balance);
    }

    @Test
    public void givenAccountWithBalance500_whenWithdrawNegativeAmount_thenThrowException() {
        BankAccount account = new BankAccount(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
    }

    @Test
    public void givenAccountWithBalance600_whenToString_thenReturnCorrectString() {
        BankAccount account = new BankAccount(600);
        String accountString = account.toString();
        assertEquals("BankAccount [balance=600]", accountString);
    }
}
