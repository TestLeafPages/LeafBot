package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class CreateLeadPage extends ProjectSpecificMethods {


	public CreateLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}

	
	public CreateLeadPage enterCompanyName(String comnyName){
		clearAndType(locateElement("id","createLeadForm_companyName"), comnyName);
		return this;

	}

	

	public CreateLeadPage enterFirstName(String firstName){
		clearAndType(locateElement("id","createLeadForm_firstName"), firstName);
		return this;
	}


	public CreateLeadPage enterLastName(String lastName){
		clearAndType(locateElement("id","createLeadForm_lastName"), lastName);
		return this;

	}

	
	public ViewLeadPage clickCreateLeadSubmit(){
		click(locateElement("class","smallSubmit"));
		return new ViewLeadPage(driver, node);
	}
	
	
	public CreateLeadPage enterEmail(String eMail){
		clearAndType(locateElement("id","createLeadForm_primaryEmail"), eMail);
		return this;
	}
}
