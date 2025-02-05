package bank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferImplTests {

    private BankTransferImpl bankTransferImpl;

    @BeforeEach
    void setUp() {
        bankTransferImpl = new BankTransferImpl();
    }

    @Test
    void sum_TwoPositiveNumbers() {
        // GIVEN two positive numbers
        int a = 5;
        int b = 7;
        // WHEN sum method is called
        int result = bankTransferImpl.sum(a, b);
        // THEN the sum is correct
        assertEquals(12, result);
    }

    @Test
    void sum_OneNegativeNumber() {
        // GIVEN one negative number and one positive number
        int a = -3;
        int b = 8;
        // WHEN sum method is called
        int result = bankTransferImpl.sum(a, b);
        // THEN the sum is correct
        assertEquals(5, result);
    }

    @Test
    void sum_Zero() {
        // GIVEN zero and a positive number
        int a = 0;
        int b = 10;
        // WHEN sum method is called
        int result = bankTransferImpl.sum(a, b);
        // THEN the sum is correct
        assertEquals(10, result);
    }

}