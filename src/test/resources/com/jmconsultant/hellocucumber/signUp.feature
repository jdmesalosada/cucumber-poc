Feature: Sign up

  Scenario: Try to sign up with passwords that don't match
    Given Jhon Wick is an user that enjoys to travel
    And he wants to sign up in order to purchase flights in sales
    When he sends a confirmation password that doesn't match with his password
    Then he should be informed that the passwords don't match

