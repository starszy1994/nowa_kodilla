package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {

    private int number;
    private String answer;

    public FizzBuzzSteps() {
        Given("the number is 1", () -> {
            this.number = 1;
        });

        Given("the number is 11", () -> {
            this.number = 11;
        });

        Given("the number is 3", () -> {
            this.number = 3;
        });

        Given("the number is 5", () -> {
            this.number = 5;
        });

        Given("the number is 45", () -> {
            this.number = 45;
        });

        Given("the number is 25", () -> {
            this.number = 25;
        });

        Given("the number is 30", () -> {
            this.number = 30;
        });

        Given("the number is -10", () -> {
            this.number = -10;
        });

        Given("the number is -333", () -> {
            this.number = -333;
        });

        When("I ask whether it's FizzBuzz", () -> {
            FizzBuzzChecker fizzbuzzchecker = new FizzBuzzChecker();
            this.answer = fizzbuzzchecker.isItFizzBuzz(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}