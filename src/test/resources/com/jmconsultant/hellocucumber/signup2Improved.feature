Feature: Sign up 2

  Scenario Outline: Sign up with address
    Given Jhon wick wants to sign up in order to be able to post his status
    When he enters the "<address-type>" address

    Examples: Addresses
      | address-type |
      | basic        |
      | two-line     |
      | foreign      |