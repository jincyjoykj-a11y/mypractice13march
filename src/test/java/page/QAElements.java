package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAElements {
	  WebDriver driver;
	  WebDriverWait wait;
	 
	  public QAElements(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10)); // ✅ FIX
	    }
	By txtbox = By.id("number");
    By calculatebtn = By.id("getFactorial");
    By text = By.id("resultDiv");
    By about = By.linkText("About");
    By terms = By.linkText("Terms and Conditions");
    By policy = By.linkText("Privacy");
    
    public boolean isElementDisplayed(By locator) {
      
		return driver.findElement(locator).isDisplayed();
    }

    public void enterNumber(String num) {
        driver.findElement(txtbox).clear();
        driver.findElement(txtbox).sendKeys(num);
    }

    public void clickCalculate() {
        driver.findElement(calculatebtn).click();
    }

    public String getResult() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(text)).getText();
    }

    public String getPlaceholder() {
        return driver.findElement(txtbox).getAttribute("placeholder");
    }

    public void clickAbout() {
        driver.findElement(about).click();
    }

    public List<WebElement> getAllLinks() {
        return driver.findElements(By.tagName("a"));
    }
}