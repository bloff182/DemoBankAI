package bank;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransferImplTests {

    private BankTransferImpl bankTransferImpl;
    private BankAccount account1;
    private BankAccount account2;

    @BeforeEach
    void setUp() {
        bankTransferImpl = new BankTransferImpl();
        account1 = bankTransferImpl.openAccount(5000);
        account2 = bankTransferImpl.openAccount(1000);
    }

    @Test
    void testTransfer_SuccessfulTransfer() {
        // GIVEN
        int amount = 1000;
        // WHEN
        bankTransferImpl.transfer(account1, account2, amount);
        // THEN
        assertEquals(4000, account1.getBalance());
        assertEquals(2000, account2.getBalance());
    }

    @Test
    void testTransfer_InsufficientFunds() {
        // GIVEN
        int amount = 6000;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> bankTransferImpl.transfer(account1, account2, amount));
        // THEN
        assertEquals(5000, account1.getBalance());
        assertEquals(1000, account2.getBalance());
    }

}