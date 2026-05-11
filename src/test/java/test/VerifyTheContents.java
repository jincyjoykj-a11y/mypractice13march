package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import page.QAElements;

@Test
public class VerifyTheContents extends BaseClass{
	
//Verify the Placeholder in Textbox is = 'Enter an integer'
//Verify the Title of the page contains = 'Factorial' 
//Verify the URL contains = 'https'
    @Test
    public void validatePageDetails() {

    	page = new QAElements(driver);
        Assert.assertEquals(page.getPlaceholder(), "Enter an integer");
        Assert.assertTrue(driver.getTitle().contains("Factorial"));
        Assert.assertTrue(driver.getCurrentUrl().contains("https"));
    }
}