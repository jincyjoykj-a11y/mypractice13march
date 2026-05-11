package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import page.QAElements;

public class UIElementValidation extends BaseClass{
	
//Validation All the necessary UI Elements are Present and Clickable (Textbox, Calculate Button, About, Terms and Condition and Privacy Link)

	    @Test
	    public void validateUIElements() {

	    	page = new QAElements(driver);

	        Assert.assertTrue(page.isElementDisplayed(By.id("number")));
	        Assert.assertTrue(page.isElementDisplayed(By.id("getFactorial")));
	        Assert.assertTrue(page.isElementDisplayed(By.linkText("About")));
	        Assert.assertTrue(page.isElementDisplayed(By.linkText("Terms and Conditions")));
	        Assert.assertTrue(page.isElementDisplayed(By.linkText("Privacy")));
	    }
	

}


