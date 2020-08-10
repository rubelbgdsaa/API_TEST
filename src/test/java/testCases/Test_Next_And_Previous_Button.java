package testCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Next_And_Previous_Button extends  BaseClass{



	@Test
	static void Next_And_Previous_Button() {
		// Chose Furniture
		elementClick(By.xpath(or.getProperty("FARM_GARDEN_XPATH")));
		//System.out.println("FARM_GARDEN");
		log.debug("FARM_GARDEN");
		
		// verify next button
		boolean Next = driver.findElement(By.xpath(or.getProperty("NEXT_BUTTON"))).isEnabled();
		elementClick(By.xpath(or.getProperty("NEXT_BUTTON")));
		//System.out.println("next button is Enabled");
		log.debug("next button is Enabled");
		
		Assert.assertEquals( Next ,true);

		// verify previous button

		boolean Previous = driver.findElement(By.xpath(or.getProperty("PREVIOUS_BUTTON"))).isEnabled();
		elementClick(By.xpath(or.getProperty("PREVIOUS_BUTTON")));
		//System.out.println("previous button is Enabled");
		log.debug("previous button is Enabled");
		
		Assert.assertEquals( Previous,true);

	}

}
