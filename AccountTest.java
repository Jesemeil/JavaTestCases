package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void canDepositIntoAccountTest() {
        Account estherAccount = new Account(1234);
        int currentBalance = estherAccount.getBalance();
        assertEquals(0, currentBalance);

        estherAccount.deposit(5000);

        currentBalance = estherAccount.getBalance();
        assertEquals(5000, currentBalance);

    }

    @Test
    public void canDepositTwiceTest() {
        Account estherAccount = new Account(1234);
        estherAccount.deposit(8000);
        int currentBalance = estherAccount.getBalance();
        assertEquals(8000, currentBalance);

        estherAccount.deposit(2000);
        currentBalance = estherAccount.getBalance();
        assertEquals(10000, currentBalance);
    }


    @Test
    public void cannotDepositNegativeAmountTest() {
        Account estherAccount = new Account(1234);
        estherAccount.deposit(1000);
        int currentBalance = estherAccount.getBalance();
        assertEquals(1000, currentBalance);

        estherAccount.deposit(-4000);
        currentBalance = estherAccount.getBalance();
        assertEquals(1000, currentBalance);
    }

    @Test
    public void canWithdrawAmountTest() {
        Account estherAccount = new Account(1234);
        estherAccount.deposit(5000);
        int currentBalance = estherAccount.getBalance();
        assertEquals(5000, currentBalance);

        estherAccount.withdraw(3000);
        currentBalance = estherAccount.getBalance();
        assertEquals(2000, currentBalance);

    }

    @Test
    public void getPinTest() {
        Account estherAccount = new Account(1234);
        int pin = estherAccount.getPin();
        assertEquals(1234, estherAccount.getPin());

    }

    @Test
    public void checkBalanceWithWrongPinTest() {
        Account estherAccount = new Account(1234);
        estherAccount.deposit(1000);
        assertEquals(1000, estherAccount.getBalance());
        estherAccount.checkBalanceWithPin(2341);
        assertEquals(1000, estherAccount.getBalance());

    }
    @Test
    public void depositWithWrongPinTest () {
        Account estherAccount = new Account(1234);
        estherAccount.depositWithPin(5000, 2345);
        assertEquals(0, estherAccount.getBalance());

    }
    @Test
    public void withdrawWithWrongPinTest () {
        Account estherAccount = new Account(1234);
        estherAccount.deposit(6000);
        assertEquals(6000, estherAccount.getBalance());
        estherAccount.withdrawWithPin(2000, 1134);
        assertEquals(6000, estherAccount.getBalance());
    }





}




