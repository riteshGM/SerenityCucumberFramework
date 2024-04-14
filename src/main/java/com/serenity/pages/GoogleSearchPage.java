package com.serenity.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;

public class GoogleSearchPage extends PageObject{
	private static final Logger log = LoggerFactory.getLogger(GoogleSearchPage.class);
	
	@FindBy(name = "q")
	WebElementFacade searchTB;
	
	@FindBy(name ="q")
	WebElementFacade enterSearch;
	
	@Step
	public void launchApp() {
		log.info("Launching the application.");
		open();
		getDriver().manage().window().maximize();
	}
	
	@Step
	public void enterSearchTxt(String searchKey) {
		log.info("Entering Search Key "+searchKey);
		searchTB.sendKeys(searchKey);
	}
	
	@Step("Click Search Button")
	public void clickSearchBtn() {
		enterSearch.sendKeys(Keys.ENTER);
	}

	@Step
	public void checkPageContainsText(String pageText) {
		Assert.assertTrue("Page Do not Contain Given Message",getDriver().getPageSource().contains(pageText));
	}
		
}
