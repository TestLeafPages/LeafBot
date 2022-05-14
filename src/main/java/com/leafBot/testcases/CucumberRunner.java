package com.leafBot.testcases;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/main/java/features", glue="com.leafBot.pages", monochrome=true)
public class CucumberRunner extends ProjectSpecificMethods {

}
