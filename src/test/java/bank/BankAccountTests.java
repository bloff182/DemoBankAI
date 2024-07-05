package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    @Test
    public void givenNewBankAccount_whenGetAmount_thenInitialBalanceZero() {
        BankAccount bankAccount = new BankAccount();
        int amount = bankAccount.getAmount();
        assertEquals(0, amount);
    }

    @Test
    public void givenBankAccountWithBalance100_whenGetAmount_thenReturn100() {
        BankAccount bankAccount = new BankAccount(100);
        int amount = bankAccount.getAmount();
        assertEquals(100, amount);
    }

    @Test
    public void givenBankAccountWithBalance200_whenGetBalance_thenReturn200() {
        BankAccount bankAccount = new BankAccount(200);
        int balance = bankAccount.getBalance();
        assertEquals(200, balance);
    }

    @Test
    public void givenBankAccountWithBalance300_whenSetBalance_thenNewBalanceIsSet() {
        BankAccount bankAccount = new BankAccount(300);
        bankAccount.setBalance(400);
        int balance = bankAccount.getBalance();
        assertEquals(400, balance);
    }

    @Test
    public void givenBankAccountWithBalance500_whenDeposit200_thenNewBalanceIs700() {
        BankAccount bankAccount = new BankAccount(500);
        bankAccount.deposit(200);
        int balance = bankAccount.getBalance();
        assertEquals(700, balance);
    }

    @Test
    public void givenBankAccountWithBalance800_whenWithdraw300_thenNewBalanceIs500() {
        BankAccount bankAccount = new BankAccount(800);
        bankAccount.withdraw(300);
        int balance = bankAccount.getBalance();
        assertEquals(500, balance);
    }

    @Test
    public void givenBankAccountWithBalance1000_whenToString_thenCorrectStringRepresentation() {
        BankAccount bankAccount = new BankAccount(1000);
        String expectedString = "BankAccount [balance=1000]";
        String actualString = bankAccount.toString();
        assertEquals(expectedString, actualString);
    }
}
