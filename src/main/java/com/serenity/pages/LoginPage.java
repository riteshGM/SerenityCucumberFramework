package com.serenity.pages;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
	
	@FindBy(id = "user-name")
	WebElementFacade nameTB;
	@FindBy(id = "password")
	WebElementFacade passwordTB;
	@FindBy(id = "login-button")
	WebElementFacade loginBtn;
	@FindBy(id = "react-burger-menu-btn")
	WebElementFacade menuOPtionsBtn;
	@FindBy(id = "logout_sidebar_link")
	WebElementFacade logoutLink;
	@FindBy(id = "shopping_cart_container")
	WebElementFacade cartContainer;
	
		
	public void launchApp() {
		log.info("Launching the application.");
		openUrl("https://www.saucedemo.com/");
		getDriver().manage().window().maximize();
	}
	
	public void checkTitle(String expectedTitle) {
		Assert.assertTrue("Title Did not Match", expectedTitle.equals(getTitle()));
	}

	public void enterCredentials(String username, String password) {
		nameTB.sendKeys(username);
		passwordTB.sendKeys(password);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}

	public void clickLogout() {
		menuOPtionsBtn.click();
		logoutLink.click();		
	}
	public void verifyHomePageDisplayed() {
		Assert.assertTrue("Cart Container is not Displayed", cartContainer.isDisplayed());
	}
}