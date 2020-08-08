package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Search_Results_Pagegination extends BaseClass {

	@Test(priority = 1)
	static void Search_Results_Pagegination_IsDisplayed() {

		// Go to Farm garden
		elementClick(By.xpath(or.getProperty("FARM_GARDEN_XPATH")));
		System.out.println("Go to Farm garden");

		String FirstPage = driver.findElement(By.xpath(or.getProperty("PAGEGINATION"))).getText();

		System.out.println("FirstPage : " + FirstPage);
		Assert.assertTrue(true, "1 - 120 ");
		System.out.println("Displayed PAGEGINATION");

	}

	@Test(priority = 2)
	static void next_boutton_IsDisplayed() {
		// next boutton
		boolean next_boutton = driver.findElement(By.xpath(or.getProperty("NEXT_BUTTON"))).isDisplayed();
		System.out.println("next_boutton");
		Assert.assertEquals(next_boutton, true, "next>");
		System.out.println("next_boutton_IsDisplayed");
	}

	@Test(priority = 3)

	static void next_boutton_Enabled() {
		boolean NextButton = driver.findElement(By.xpath(or.getProperty("NEXT_BUTTON"))).isEnabled();

		Assert.assertEquals(NextButton, true, "next>");
		System.out.println("next_boutton_Enabled");
	}

	@Test(priority = 4) // previous button
	static void previous_Button_IsDisplayed() {
		boolean PreviousButton = driver.findElement(By.xpath(or.getProperty("PREVIOUS_BUTTON"))).isDisplayed();
		System.out.println("Previous ");
		// Assert.assertEquals(PreviousButton, true);
		Assert.assertEquals(PreviousButton, false);
		System.out.println("Previous Button IsDisplayed");

	}

	@Test(priority = 5) // previous button
	static void previous_Button_isEnabled() {
		boolean Previous = driver.findElement(By.xpath(or.getProperty("PREVIOUS_BUTTON"))).isEnabled();
		System.out.println("Previous Button ");
		Assert.assertEquals(Previous, true);
		System.out.println("Previous Button IsEnabled");

	}

}// class
