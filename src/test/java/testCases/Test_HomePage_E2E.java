package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_HomePage_E2E extends BaseClass {
	@Test
	static void home_page_Status() throws InterruptedException {

		driver.get("https://accounts.craigslist.org/login/home");
		// Verify HomePage
		boolean isDisplayed = driver
				.findElement(
						By.xpath("//th[@aria-label='status: No sort applied, activate to apply an ascending sort']"))
				.isDisplayed();
		Assert.assertTrue(elementDisplayed(By.xpath(or.getProperty("STATUS_BUTTON"))) == true);
		System.out.println("Status button  is Displayed");

		// verify status button is clickable

		// elementClick(By.xpath("//table/thead/tr/th[1]"));
		elementClick(By.xpath("//th[@role='columnheader']/div"));
		System.out.println("Status button is clickable");
		Assert.assertTrue(true);
		Thread.sleep(3000);
	}//

	// p[@class='postinglist_title']
}// class
