package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] theMachines;
    public int numberOfMachines;

    public int totalDeposits;
    public int totalWithdrawals;
    public int totalBalance;
    public double depositAverage;
    public double withdrawalAverage;

    public Bank() {
        this.theMachines = new CashMachine[0];
        this.numberOfMachines = 0;

    }

    public void addMachine(CashMachine balance) {
        this.numberOfMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfMachines];
        System.arraycopy(theMachines, 0, newTab, 0, theMachines.length);
        newTab[this.numberOfMachines - 1] = balance;
        this.theMachines = newTab;
    }

    public int getNumberOfMachines() {
        return numberOfMachines;
    }

    public int totalBalance() {
        totalBalance = 0;
        for (int i = 0; i < theMachines.length; i++) {
            totalBalance += theMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int totalDeposits() {
        totalDeposits = 0;
        for (int i = 0; i < theMachines.length; i++) {
            if (theMachines[i].depositSize == 0) {
                return 0;
            } else {
                totalDeposits += theMachines[i].getDepositSize();
            }
        }
        return totalDeposits;
    }

    public int totalWithdrawals() {
        totalWithdrawals = 0;
        for (int i = 0; i < theMachines.length; i++) {
            if (theMachines[i].withdrawalSize == 0) {
                return 0;
            } else {
                totalWithdrawals += theMachines[i].getWithdrawalSize();
            }
        }
        return totalWithdrawals;
    }

    public double totalDepositAverage() {
        if (totalDeposits == 0) {
            return 0;
        } else {
            depositAverage = 0;
            int sum = 0;
            for (int i = 0; i < theMachines.length; i++) {
                sum += theMachines[i].depositSum;
            }
            depositAverage = sum / totalDeposits;
            return depositAverage;
        }
    }

    public double totalWithdrawalAverage() {
        if (totalWithdrawals == 0) {
            return 0;
        } else {
            withdrawalAverage = 0;
            int sum = 0;
            for (int i = 0; i < theMachines.length; i++) {
                sum += theMachines[i].withdrawalSum;
            }
            withdrawalAverage = sum / totalWithdrawals;
            return withdrawalAverage;
        }
    }

}