package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BankTransferImplTests {

    @Test
    void shouldOpenAccount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);

        BankTransferImpl bankTransfer = new BankTransferImpl();
        BankAccount bankAccount1 = bankTransfer.openAccount(100);

        Assertions.assertEquals(bankAccount.getBalance(), bankAccount1.getBalance());
    }
}