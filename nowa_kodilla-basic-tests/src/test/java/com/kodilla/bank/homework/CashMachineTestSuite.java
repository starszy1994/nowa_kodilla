package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine(10000);


    @Test
    public void shouldHaveZeroLength() {
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTransaction() {
        cashMachine.addTransaction(500);
        assertEquals(1, cashMachine.getSize());
        cashMachine.addTransaction(-200);
        assertEquals(2, cashMachine.getSize());
    }

    @Test
    public void shouldNotAddTransactionZeroValue() {
        cashMachine.addTransaction(0);
        assertEquals(0,cashMachine.getSize());
        assertEquals(0,cashMachine.getDepositSize());
        assertEquals(0,cashMachine.getWithdrawalSize());
    }
    @Test
    public void shouldAddToDepositsPositiveValue() {
        cashMachine.addTransaction(500);
        assertEquals(1, cashMachine.getDepositSize());
    }

    @Test
    public void shouldAddToWithdrawalsNegativeValue() {
        cashMachine.addTransaction(-600);
        assertEquals(1, cashMachine.getWithdrawalSize());
    }

    @Test
    public void shouldAddToBalancePositiveValue() {
        cashMachine.addTransaction(400);
        assertEquals(10400, cashMachine.getBalance());
    }

    @Test
    public void shouldSubstractFromBalanceNegativeValue() {
        cashMachine.addTransaction(-400);
        assertEquals(9600, cashMachine.getBalance());
    }

    @Test
    public void shouldDoNothingZeroValue() {
        cashMachine.addTransaction(0);
        assertEquals(10000, cashMachine.getBalance());
    }

    @Test
    public void shouldNotWithdrawifBalanceNegative() {
        cashMachine.addTransaction(-10200);
        assertEquals(10000, cashMachine.getBalance());
        assertEquals(0,cashMachine.withdrawalSize);
    }

    @Test
    public void shouldSumDepositValues() {
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(400);
        cashMachine.getDepositSum();
        assertEquals(1100, cashMachine.getDepositSum());
    }

    @Test
    public void shouldNotAddWithdrawalToDeposits() {
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(400);
        cashMachine.getDepositSum();
        assertEquals(900, cashMachine.getDepositSum());
    }

    @Test
    public void shouldSumWithdrawalValues() {
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-400);
        cashMachine.getWithdrawalSum();
        assertEquals(-1100, cashMachine.getWithdrawalSum());
    }

    @Test
    public void shouldNotAddDepositToWithdrawals() {
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(400);
        cashMachine.getDepositSum();
        assertEquals(-700, cashMachine.getWithdrawalSum());
    }

}