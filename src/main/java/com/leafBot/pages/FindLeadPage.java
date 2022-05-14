package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class FindLeadPage extends ProjectSpecificMethods {


	public FindLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}
	
	public FindLeadPage enterFirstName(String findfistname){
		clearAndType(locateElement("xpath","(//input[@name='firstName'])[3]"), findfistname);
		return this;

	}
	
	public FindLeadPage enterLeadId(String findfistname){
		clearAndType(locateElement("name","id"), findfistname);
		return this;

	}
	
	public FindLeadPage clickFindleadsButton(){
		click(locateElement("xpath","//button[text()='Find Leads']"));
		return this;
	}
	
	
	public String getFirstResultingLead(){	
		return 	getElementText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	}
	
	public String getFirstResultingFirstName() throws InterruptedException{	
		Thread.sleep(1000);
		return 	getElementText(locateElement("xpath","//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']"));
	}

	
	public ViewLeadPage clickFirstResultingLead(){
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		return new ViewLeadPage(driver, node);
	}
	
	public FindLeadPage clickPhoneTab(){
		click(locateElement("xpath","//span[text()='Phone']"));
		return this;
	}
	
	public FindLeadPage clickEmailTab(){
		click(locateElement("xpath","//span[text()='Email']"));
		return this;
	}
	
	public FindLeadPage enterPhoneNumberField(String PhoneNumber){
		clearAndType(locateElement("name","phoneNumber"), PhoneNumber);
		return this;
	}
	
	public FindLeadPage enterEmailAddress(String emailAddress){
		clearAndType(locateElement("name","emailAddress"), emailAddress);
		return this;
	}
		
	public FindLeadPage verifyErrorMsg(String eleErrorMsgValue){
		verifyPartialText(locateElement("class","x-paging-info"), eleErrorMsgValue);
		return this;
	}
	
	
	
}