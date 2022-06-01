package wallet;

    public class Cashier {
        private CashSlot cashSlot;

        public Cashier(CashSlot cashSlot) {
            this.cashSlot = cashSlot;
        }

        public void withdraw(Wallet wallet, int amount) {
            if (amount > wallet.getBalance()) {
                System.out.print("I don't have enough money in my wallet");
            } else
                wallet.debit(amount);
            cashSlot.dispense(amount);
        }
    }