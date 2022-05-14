package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class MergeLeadPage extends ProjectSpecificMethods {


	public MergeLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}
	
	public FindLeadPopPage clickFromLeadLookup(){
		clickWithNoSnap(locateElement("xpath","(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		return new FindLeadPopPage(driver, node);		
	}

	
	public FindLeadPopPage clickToLeadLookup(){
		clickWithNoSnap(locateElement("xpath","(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		return new FindLeadPopPage(driver, node);		
	}

	
	public ViewLeadPage clickMergeButton(){
		clickWithNoSnap(locateElement("link","Merge"));
		acceptAlert();
		return new ViewLeadPage(driver, node);
	}
}