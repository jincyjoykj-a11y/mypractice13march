package test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import page.QAElements;

public class NoOfLinksinAbout extends BaseClass{

//Click on the About link and verify the total number of link is Greater than 5 and print the link name

	@Test
    public void verifyLinksInAboutPage() {

		page = new QAElements(driver);

        page.clickAbout();

        List<WebElement> links = page.getAllLinks();

        Assert.assertTrue(links.size() > 5);

        for (WebElement link : links) {
            System.out.println(link.getText());
        }
    

}
}
