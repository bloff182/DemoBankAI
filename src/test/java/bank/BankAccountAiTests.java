package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountAiTests {
    @Test
    void test(){
        BankAccountAi bankAccountAi = new BankAccountAi();
        int sum = bankAccountAi.sum(2, 5);
        assertEquals(7, sum);
    }

}