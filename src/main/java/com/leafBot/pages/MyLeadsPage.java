package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class MyLeadsPage extends ProjectSpecificMethods {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		
	}
	
	
	// Click Create Leads 
	public CreateLeadPage clickCreateLead(){
		click(locateElement("link","Create Lead"));
		return new CreateLeadPage(driver, node);
	}

	
	
	public FindLeadPage clickFindLead(){
		click(locateElement("link","Find Leads"));	
		return new FindLeadPage(driver, node);
	}
	
	
	
	public MergeLeadPage clickMergeLead(){
		click(locateElement("link","Merge Leads"));	
		return new MergeLeadPage(driver, node);
	}
	
	

}
