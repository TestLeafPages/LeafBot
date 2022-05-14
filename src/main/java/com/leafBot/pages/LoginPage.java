package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;


public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}
	 
	
	
	@Given("Enter the username as {string}")
	public LoginPage enterUserName(String data) {	
		clearAndType(locateElement("id","username"), data);
		return this;
	}	

	@Given("Enter the Password as {string}")
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement("id","password"), data);
		return this;
	}	
	
	@Given("Click on the Login")
	public HomePage clickLogin() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage(driver, node);		
	}
	
	public LoginPage clickLogInForFailer() {
		click(locateElement("class","decorativeSubmit"));
		return this;		
	}
	
	@Given("Verify the error message (.*)")
	public LoginPage verifyErrorMsg(String data) {
		verifyPartialText(locateElement("id","errordiv"), data);
		return this;
	}
	
	
}
