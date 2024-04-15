package com.serenity.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import com.serenity.pages.LoginPage;

public class LoginDemoSteps {


	@Steps
	LoginPage loginPageObj;
	@Given("browser is open")
	public void browser_is_open() {
		loginPageObj.launchApp();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		loginPageObj.checkTitle("Swag Labs");
	}
	/**
	 * Scenario Outline Step Example How we use the parameters in our Selenium Code
	 * @param username
	 * @param password
	 * @throws InterruptedException
	 */
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		loginPageObj.enterCredentials(username,password);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		loginPageObj.clickLogin();
		loginPageObj.verifyHomePageDisplayed();
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		loginPageObj.clickLogout();
	}
}
