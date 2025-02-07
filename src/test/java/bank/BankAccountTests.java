package bank;

@Test
    void testWithdraw_ExceedsBalance() {
        // GIVEN - An account with a balance of 50
        bankAccount.setBalance(50);
        // WHEN - We attempt to withdraw 100
        // THEN - An IllegalArgumentException should be thrown
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(100));
    }

    @Test
    void testDeposit_ZeroAmount() {
        // GIVEN - An account with a balance of 50
        bankAccount.setBalance(50);
        // WHEN - We deposit 0
        bankAccount.deposit(0);
        // THEN - The balance should remain 50
        assertEquals(50, bankAccount.getBalance(), "Depositing 0 should not change the balance");
    }

    @Test
    void testWithdraw_ZeroAmount() {
        // GIVEN - An account with a balance of 50
        bankAccount.setBalance(50);
        // WHEN - We withdraw 0
        bankAccount.withdraw(0);
        // THEN - The balance should remain 50
        assertEquals(50, bankAccount.getBalance(), "Withdrawing 0 should not change the balance");
    }
