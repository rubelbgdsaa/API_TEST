package testCases;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Map_Displayed extends BaseClass {

	@Test
	static void Map_Displayed () {
		// Chose Furniture
	elementClick(By.xpath(or.getProperty("FURNITURE")));
		System.out.println("open Landing page");
	
		// select item
		elementClick(By.xpath(or.getProperty("ITEM_SELECT_FOR_MAP")));
				
   // Verify Map is Displayed
     // boolean Map = driver.findElement(By.xpath(or.getProperty("MAP"))).isDisplayed();
		try {
		elementClick(By.xpath(or.getProperty("MAP")));
		
		System.out.println("Map is displayed");
		 Assert.assertTrue(true);
		}
		catch (NoSuchElementException map) {
			Assert.assertTrue(false, map.getMessage());
		}
	
		
	}

}
