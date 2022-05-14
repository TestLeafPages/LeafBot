package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;


public class HomePage extends ProjectSpecificMethods{

	public HomePage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}

	
	public HomePage verifyLoggedName(String data) {
		verifyPartialText(locateElement("xpath","//h2[text()[contains(.,'Demo')]]"), data);
		return this;
	}

	

	public MyHomePage clickCRMSFA(){
		click(locateElement("link","CRM/SFA"));
		return new MyHomePage(driver, node);
	}

	
	
	public LoginPage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new LoginPage(driver, node);

	}
	
	@Then("Homepage should be displayed")
	public HomePage verifyHomepage() {
		verifyDisplayed(locateElement("link","CRM/SFA"));
		return this;
	}

}










