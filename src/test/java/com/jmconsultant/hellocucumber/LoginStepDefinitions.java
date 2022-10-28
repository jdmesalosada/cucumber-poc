package com.jmconsultant.hellocucumber;

import com.jmconsultant.hellocucumber.model.User;
import com.jmconsultant.hellocucumber.util.UserCreator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("he wants to log in in order to purchase flights in sales")
    public void he_wants_to_log_in_in_order_to_purchase_flights_in_sales() {

    }

    @When("he tries to login with a {string}")
    public void he_tries_to_login_with_a(String type) {
        User user = UserCreator.getUserByType(type);
        System.out.println(user.toString());

    }

    @Then("he should navigate to the url {string}")
    public void he_should_navigate_to_the_url(String string) {

    }

}
