Feature: Cash Withdrawal

  Scenario Outline: Successful or unsuccessful withdrawal from a wallet in credit
    Given I have deposited <amount> in my wallet
    When I request <withdrawal>
    Then <withdrawal> should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | amount | withdrawal |balance|
      | $200   | $30        |$170   |
      | $30    | $30        |$0     |