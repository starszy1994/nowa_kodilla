Feature: Do we get FizzBuzz?

  Scenario Outline: The number is or isn't FizzBuzz
    Given the number is <number>
    When  I ask whether it's FizzBuzz
    Then  I should be told <answer>
    Examples:
      | number | answer     |
      | 1      | "None"     |
      | 11     | "None"     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 45     | "FizzBuzz" |
      | 25     | "Buzz"     |
      | 30     | "FizzBuzz" |
      | -10    | "Buzz"     |
      | -333   | "Fizz"     |