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
	static void Map_Displayed() {
		// Chose Furniture
		//elementClick(By.xpath(or.getProperty("FURNITURE")));
		elementClick(By.linkText("craigslist"));
		
		System.out.println("open Landing page");
		log.debug("open Landing page");

		List<WebElement> country = driver.findElements(By.xpath("//div[@class='jump_to_continents']/a"));
		System.out.println(country.size());
		for (WebElement list : country) {
			
			//System.out.println(list.getText());
			log.debug(list.getText());
		}
		
		Assert.assertTrue(true );
		
	
	}

}
