package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_CL_Worlwide_Is_Displayed extends BaseClass {

//		webDriverInstantiation();
	// login();
	@Test
	static void verify_CL_Worlwide_Is_Displayed() throws InterruptedException {
		elementClick(By.xpath(or.getProperty("NEARBY_CL")));

		boolean CL_CITY = driver.findElement(By.xpath(or.getProperty("ALL_CL_CITY"))).isEnabled();
		Assert.assertEquals(CL_CITY, true);

		Thread.sleep(2000);

	}

	// Verify cl worldwide is clickable
	// driver.findElement(By.xpath(or.getProperty("CL_WORLDWIDE")));
	// System.out.println("cl worldwide is clickable");
	@Test
	static void center() {
		List<WebElement> CN = driver.findElements(By.xpath("//div[@id='center']/div/div"));
		System.out.println(CN.size());

		for (WebElement webElement : CN) {

			System.out.println(webElement.getText());

		}
	}
}
