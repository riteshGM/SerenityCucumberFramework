package com.serenity.utilities;

import io.cucumber.java.After;
import net.serenitybdd.core.pages.PageObject;

public class Hooks extends PageObject {
	
	@After
	public void tearDown() {
		getDriver().close();
	}

}
