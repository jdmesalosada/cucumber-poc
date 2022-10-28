Feature: Sign up 2

  Scenario Outline: Sign up with address
    Given Jhon wick wants to sign up in order to be able to post his status
    When he sets the street address to "<street>"
    And he sets the second address line to "<second>"
    And he sets the city to "<city>"
    And he sets the state to "<state>"
    And he sets the zipcode to "<zipcode>"
    And he sets the country to "<country>"
    And he clicks the save button

    Examples: Addresses
      | street | second | city | state | zipcode | country |