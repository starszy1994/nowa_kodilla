package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank theBank = new Bank();
    CashMachine machineOne = new CashMachine(5000);
    CashMachine machineTwo = new CashMachine(2000);
    CashMachine machineThree = new CashMachine(3000);

    @Test
    public void shouldHaveZeroLength() {
        theBank.getNumberOfMachines();
        assertEquals(0, theBank.getNumberOfMachines());
    }

    @Test
    public void shouldAddMachine() {
        theBank.addMachine(machineOne);
        theBank.getNumberOfMachines();
        assertEquals(1, theBank.numberOfMachines);
        assertEquals(5000,machineOne.balance);
        theBank.addMachine(machineTwo);
        theBank.getNumberOfMachines();
        assertEquals(2, theBank.numberOfMachines);
        assertEquals(2000,machineTwo.balance);
    }

    @Test
    public void shouldAddTransaction() {
        theBank.addMachine(machineOne);
        machineOne.addTransaction(500);
        assertEquals(500, machineOne.transactions[0]);
        machineOne.addTransaction(-200);
        assertEquals(-200, machineOne.transactions[1]);
    }

    @Test
    public void shouldAddToBalanceFromBank() {
        theBank.addMachine(machineOne);
        machineOne.addTransaction(500);
        assertEquals(5500, machineOne.balance);
        machineOne.addTransaction(-200);
        assertEquals(5300, machineOne.balance);
    }

    @Test
    public void shouldCountTotalBalance() {
        theBank.addMachine(machineOne);
        machineOne.getBalance();
        theBank.addMachine(machineTwo);
        machineTwo.getBalance();
        theBank.addMachine(machineThree);
        machineThree.getBalance();
        assertEquals(10000,theBank.totalBalance());
    }

    @Test
    public void shouldCountTotalDeposit() {
        theBank.addMachine(machineOne);
        machineOne.addTransaction(300);
        machineOne.getDepositSize();
        theBank.addMachine(machineTwo);
        machineTwo.addTransaction(200);
        machineTwo.getDepositSize();
        theBank.addMachine(machineThree);
        machineThree.addTransaction(500);
        machineThree.getDepositSize();
        theBank.totalDeposits();
        assertEquals(3,theBank.totalDeposits());
    }

    @Test
    public void shouldCountTotalWithdrawal() {
        theBank.addMachine(machineOne);
        machineOne.addTransaction(-300);
        machineOne.getWithdrawalSize();
        theBank.addMachine(machineTwo);
        machineTwo.addTransaction(-200);
        machineTwo.getWithdrawalSize();
        theBank.addMachine(machineThree);
        machineThree.addTransaction(-500);
        machineThree.getWithdrawalSize();
        theBank.totalWithdrawals();
        assertEquals(3,theBank.totalWithdrawals());
    }
    @Test
    public void shouldNotCountTotalZeroDeposits() {
        theBank.addMachine(machineOne);
        machineOne.getDepositSize();
        theBank.addMachine(machineTwo);
        machineTwo.getDepositSize();
        assertEquals(0,theBank.totalDeposits());
    }

    @Test
    public void shouldNotCountTotalZeroWithdrawals() {
        theBank.addMachine(machineOne);
        machineOne.getWithdrawalSize();
        theBank.addMachine(machineTwo);
        machineTwo.getWithdrawalSize();
        assertEquals(0,theBank.totalWithdrawals());
    }

    @Test
    public void shouldCountDepositAverage() {
        theBank.addMachine(machineOne);
        theBank.addMachine(machineTwo);
        machineOne.addTransaction(400);
        machineOne.addTransaction(200);
        machineOne.getDepositSize();
        machineOne.getDepositSum();
        machineTwo.addTransaction(100);
        machineTwo.addTransaction(100);
        machineTwo.getDepositSize();
        machineTwo.getDepositSum();
        theBank.totalDeposits();
        theBank.totalDepositAverage();
        assertEquals(200,theBank.totalDepositAverage());

    }

    @Test
    public void shouldNotCountAverageZeroDeposits() {
        theBank.addMachine(machineOne);
        theBank.addMachine(machineTwo);
        machineOne.getDepositSize();
        machineOne.getDepositSum();
        machineTwo.getDepositSize();
        machineTwo.getDepositSum();
        theBank.totalDeposits();
        theBank.totalDepositAverage();
        assertEquals(0,theBank.totalDepositAverage());
    }

    @Test
    public void shouldCountWithdrawalAverage() {
        theBank.addMachine(machineOne);
        theBank.addMachine(machineTwo);
        machineOne.addTransaction(-400);
        machineOne.addTransaction(-200);
        machineOne.getWithdrawalSize();
        machineOne.getWithdrawalSum();
        machineTwo.addTransaction(-100);
        machineTwo.addTransaction(-100);
        machineTwo.getWithdrawalSize();
        machineTwo.getWithdrawalSum();
        theBank.totalWithdrawals();
        theBank.totalWithdrawalAverage();
        assertEquals(-200,theBank.totalWithdrawalAverage());
    }

    @Test
    public void shouldNotCountAverageZeroWithdrawals() {
        theBank.addMachine(machineOne);
        theBank.addMachine(machineTwo);
        machineOne.getWithdrawalSize();
        machineOne.getWithdrawalSum();
        machineTwo.getWithdrawalSize();
        machineTwo.getWithdrawalSum();
        theBank.totalWithdrawals();
        theBank.totalWithdrawalAverage();
        assertEquals(0,theBank.totalWithdrawalAverage());
    }

}