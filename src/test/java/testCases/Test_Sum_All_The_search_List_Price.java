package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Sum_All_The_search_List_Price extends BaseClass {


	@Test
	static void Sum_all_the_list_prices() {

		// Select Jewelry
		elementClick(By.xpath(or.getProperty("JEWELRY")));
		// System.out.println("Select Jewelry ");
		log.debug("Select  Jewelry ");
		// Retrive All the list Jewelry Item
		List<WebElement> Jewelrys = driver.findElements(By.xpath(or.getProperty("ALL_THE_LIST_JEWELRY_ITEM")));

		// Sum all the list prices
		String price;
		double sum = 0;
		for (WebElement Jewelry : Jewelrys) {
			price = Jewelry.findElement(By.xpath(or.getProperty("SUM_ALL_LIST_PRICE"))).getText();
			// System.out.println(price); //$23.45
			price = price.replace('$', '0');
			sum = sum + Double.parseDouble(price); // Type Casting - Integer.parseInt(price);
		}
		//System.out.println("Total price $" + sum);
		log.debug("Total price $" + sum);
		/*
		 * int a=5; double b = 3.2*a; //implicit Casting - 16.0
		 * 
		 * double c=2.5; int d = 3*(int)c; //explicit Casting -
		 * 
		 */
		boolean PRICE_RESULT_isDisplayed = driver.findElement(By.xpath(or.getProperty("PRICE_RESULT"))).isDisplayed();
		Assert.assertEquals(PRICE_RESULT_isDisplayed, true);

		// logout();
	}

}
