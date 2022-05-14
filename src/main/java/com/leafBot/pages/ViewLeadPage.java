package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class ViewLeadPage extends ProjectSpecificMethods  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		
	}
	
	
	public ViewLeadPage verifyFirstName(String fname) {
		verifyPartialText(locateElement("id","viewLead_firstName_sp"), fname);
		return this;
	}
	
	
	public FindLeadPage clickFindLead(){
		click(locateElement("link","Find Leads"));
		return new FindLeadPage(driver, node);
	}
	
	
	public ViewLeadPage verifyCompanyName(String CompanyName) {
		verifyPartialText(locateElement("id","viewLead_companyName_sp"), CompanyName);
		return this;
	}
	
	public EditLeadPage clickEditLeadLink(){
		click(locateElement("link","Edit"));
		return new EditLeadPage(driver, node);
	}
	
	public DuplicateLeadPage clickDuplicateLeadLink(){
		click(locateElement("link","Duplicate Lead"));
		return new DuplicateLeadPage(driver, node);
	}
	
	public MyLeadsPage clickDeleteLeadLink(){
		click(locateElement("link","Delete"));
		return new MyLeadsPage(driver, node);
	}
	
	

	
	
}
