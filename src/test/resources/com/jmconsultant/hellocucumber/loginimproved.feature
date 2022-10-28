Feature: Login Improved

  Scenario: Login with valid credentials
    Given Jhon Wick is an user that enjoys to travel
    And he wants to log in in order to purchase flights in sales
    When he tries to login with a "valid user"
    Then he should navigate to the url "dahsboard"

  Scenario: Login with no valid credentials
    Given Jhon Wick is an user that enjoys to travel
    And he wants to log in  in order to purchase flights in sales
    When he tries to login with a "no valid user"
    And the button to login again should be displayed
    Then he should see the message "no valid user"

  Scenario: Login with blocked
    Given Jhon Wick is an user that enjoys to travel
    And he wants to log in  in order to purchase flights in sales
    When he tries to login with a "blocked"
    And the button to login again should be displayed
    Then he should see the message "no valid user"