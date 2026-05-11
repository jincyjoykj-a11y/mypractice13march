package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import page.QAElements;

public class BugDetection extends BaseClass {

//Add one scenario to automate one of the detected bug
	@Test
    public void verifyNegativeInputBug() {

		page = new QAElements(driver);

        page.enterNumber("-5");
        page.clickCalculate();

        String result = page.getResult();

        Assert.assertTrue(result.contains("error") || result.contains("invalid"),
                "Negative numbers factorials are not handled ");
    }


}

