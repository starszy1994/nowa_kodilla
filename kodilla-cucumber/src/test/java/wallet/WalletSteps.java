package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    public final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public final PrintStream originalOut = System.out;

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        Given("I have deposited $20 in my wallet", () -> {
            wallet.deposit(20);
            Assert.assertEquals("Incorrect wallet balance", 20, wallet.getBalance());
        });

        Given("I have deposited $30 in my wallet", () -> {
            wallet.deposit(30);
            Assert.assertEquals("Incorrect wallet balance", 30, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0,  wallet.getBalance());
        });

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            System.setOut(new PrintStream(outContent));
        });

        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
        });

        Then("I should see that the balance is ${int}", (Integer int1) -> {
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("I don't have enough money in my wallet", outContent.toString());
        });
    }
}