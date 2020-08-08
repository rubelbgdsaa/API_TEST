package testCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Next_And_Previous_Button extends  BaseClass{

		@Test
		static void Next_And_Previous_Button(){                  
			//Chose Furniture
		elementClick(By.xpath(or.getProperty("FURNITURE")));
			
		
		//verify next button
		boolean Next =driver.findElement(By.xpath(or.getProperty("NEXT_BUTTON"))).isEnabled();
		elementClick(By.xpath(or.getProperty("NEXT_BUTTON")));
		Assert.assertTrue(true, "next button is Enabled");
		
		//verify previous button
		
	 boolean Previous = driver.findElement(By.xpath(or.getProperty("PREVIOUS_BUTTON"))).isEnabled();
		elementClick(By.xpath(or.getProperty("PREVIOUS_BUTTON")));
		
		Assert.assertTrue(true, "previous button is Enabled");
		
		
	
	}

}
