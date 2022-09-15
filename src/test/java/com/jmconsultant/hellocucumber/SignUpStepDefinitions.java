package com.jmconsultant.hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpStepDefinitions {

    WebDriver driver;

    @Before
    public void setup() {
        driver = WebDriverManager.chromedriver().create();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Given("Jhon Wick is an user that enjoys to travel")
    public void jhon_wick_is_an_user_that_enjoys_to_travel() {
        driver.navigate().to("https://blazedemo.com/register");
    }

    @Given("he wants to sign up in order to purchase flights in sales")
    public void he_wants_to_sign_up_in_order_to_purchase_flights_in_sales() {

    }

    @When("he sends a confirmation password that doesn't match with his password")
    public void he_sends_a_confirmation_password_that_doesn_t_match_with_his_password() {
        driver.findElement(By.id("name")).sendKeys("nombre");
        driver.findElement(By.id("company")).sendKeys("google");
        driver.findElement(By.id("email")).sendKeys("google@gmail.com");
        driver.findElement(By.id("password")).sendKeys("miPassword");
        driver.findElement(By.id("password-confirm")).sendKeys("miconfirmacion");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
    }

    @Then("he should be informed that the passwords don't match")
    public void he_should_be_informed_that_the_passwords_don_t_match() {

    }

}
