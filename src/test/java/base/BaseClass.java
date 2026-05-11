package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.QAElements;

public class BaseClass {
	
	     protected WebDriver driver;
	     protected QAElements page;


	    @BeforeMethod
	   	    	public void setup() {
	    	    WebDriverManager.chromedriver().setup();
	    	    driver = new ChromeDriver();
	    	
	        driver.get("https://qainterview.pythonanywhere.com/");
	        
	        
	    }

	    @AfterMethod
	    public void closeApp() {
	        driver.quit();

	}

}
