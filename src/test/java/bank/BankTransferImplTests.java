package bank;

    @Test
    void transfer_successfulTransaction() {
        // GIVEN
        int amount = 50;
        // WHEN
        transferImpl.transfer(fromAccount, toAccount, amount);
        // THEN
        assertEquals(50, toAccount.getBalance());
        assertEquals(50, fromAccount.getBalance());
    }
