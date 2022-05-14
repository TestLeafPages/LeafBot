package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class EditLeadPage extends ProjectSpecificMethods {


	public EditLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}

	
	public EditLeadPage updateCompanyName(String updcomnyName){
		clearAndType(locateElement("id","updateLeadForm_companyName"), updcomnyName);
		return this;

	}
	
	public ViewLeadPage clickUpdateSubmit(){
		click(locateElement("class","smallSubmit"));
		return new ViewLeadPage(driver, node);
	}

}

