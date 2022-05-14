package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class FindLeadPopPage extends ProjectSpecificMethods {


	public FindLeadPopPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}
	
		public FindLeadPopPage enterFirstName(String findfistname){
		clearAndType(locateElement("name","firstName"), findfistname);
		return this;

	}
	
	public FindLeadPopPage clickFindleadsButton(){
		click(locateElement("xpath","//button[text()='Find Leads']"));
		return this;
	}
	
	public String getFirstResultingLead(){	
		switchToWindow(1);

		return getElementText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	}

	
	public MergeLeadPage clickResultingLeads(){
		clickWithNoSnap(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		switchToWindow(0);
		return new MergeLeadPage(driver, node);
	}
}