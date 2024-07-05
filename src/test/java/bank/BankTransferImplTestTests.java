package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransferImplTestTests {

    @Test
    void shouldOpenAccount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);

        BankTransferImpl bankTransfer = new BankTransferImpl();
        BankAccount bankAccount1 = bankTransfer.openAccount(100);

        Assertions.assertNotNull(bankAccount1);
        Assertions.assertEquals(bankAccount.getBalance(), bankAccount1.getBalance());
    }

}
