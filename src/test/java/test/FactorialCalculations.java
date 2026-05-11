package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import page.QAElements;

@Test
public class FactorialCalculations extends BaseClass {
	
//Data Driven testing (4 to 10) find out the factorial and verify the result
	
	@DataProvider(name = "testData")
    public Object[][] getData() {
        return new Object[][] {
                {"4", "24"},
                {"5", "120"},
                {"6", "720"},
                {"7", "5040"}
        };
    }

    public void verifyFactorial(String input, String expected) {

    	page = new QAElements(driver);

        page.enterNumber(input);
        page.clickCalculate();

        Assert.assertTrue(page.getResult().contains(expected));
    }
}
	


