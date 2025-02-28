package bank;

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
    void testSumPositiveNumbers() {
        // GIVEN two positive integers
        int a = 5;
        int b = 7;
        // WHEN sum method is called with the given integers
        int result = bankTransferImpl.sum(a, b);
        // THEN the result should be the sum of the two integers
        assertEquals(12, result);
    }

    @Test
    void testSumNegativeNumbers() {
        // GIVEN two negative integers
        int a = -5;
        int b = -7;
        // WHEN sum method is called with the given integers
        int result = bankTransferImpl.sum(a, b);
        // THEN the result should be the sum of the two integers
        assertEquals(-12, result);
    }

    @Test
    void testSumPositiveAndNegativeNumbers() {
        // GIVEN a positive integer and a negative integer
        int a = 5;
        int b = -7;
        // WHEN sum method is called with the given integers
        int result = bankTransferImpl.sum(a, b);
        // THEN the result should be the difference between the two integers
        assertEquals(-2, result);
    }
}