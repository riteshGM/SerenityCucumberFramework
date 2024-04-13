package com.serenity.stepdefinition;

import com.serenity.pages.GoogleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class GoogleLoginSteps {
	
	@Steps
	GoogleSearchPage googleSearchPage;

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		//driver.navigate().to("http://www.google.com");
		googleSearchPage.launchApp();
	}

	@When("user enters search text")
	public void user_enters_search_text() {
		//driver.findElement(By.name("q")).sendKeys("");
		googleSearchPage.enterSearchTxt("Automation Step By Step");
	}

	@When("user hits search button")
	public void user_hits_search_button() {
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		googleSearchPage.clickSearchBtn();
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
		//driver.getPageSource().contains("Online Courses");
		googleSearchPage.checkPageContainsText("Online Courses");
	}

}
