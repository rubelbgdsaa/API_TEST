package testCases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.SkipException;

import utilities.TestUtil;

import base.BaseClass;

public class Test_FilterSearch extends BaseClass {
	
	String totalCount;
	boolean carFlag=true;
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void test_FilterSearch(Hashtable<String,String> data )  throws InterruptedException {

   		//Click on Car+Trucks
		if (carFlag==true) {
			elementClick(By.xpath("//span[contains(text(),'cars+trucks')]"));
			carFlag=false;
		}
		
		//Click on  search titles only
		if ( data.get("searchTitlesOnly").contains("1.0") ) elementClick(By.xpath("//input[@name='srchType']"));
		Thread.sleep(4000);
		System.out.println("title");
		
		//Click on  Has Image
		if (data.get("hasImage").contains("1.0")) elementClick(By.xpath("//input[@name='hasPic']"));
		Thread.sleep(4000);
		System.out.println("img");
		//Enter Miles of MilesFromZip
		
		elementSendKeys(By.xpath("//input[@name='search_distance']"),   data.get("mfzMiles")  ); 
		Thread.sleep(4000);
		System.out.println("dis");
		//Enter Zipcode of MilesFromZip
		elementSendKeys(By.xpath("//input[@name='postal']"), data.get("mfzZip")  );
		Thread.sleep(4000);
		System.out.println("zip");
		
		/*elementClick(By.xpath("//button[@class='searchlink linklike changed_input clickme']"));
		System.out.println("update");
		
		if ( driver.findElement(By.xpath("//span[@class='totalcount']"))!= null ) {
			totalCount =  getText(By.xpath("//span[@class='totalcount']"));
			Assert.assertTrue( Integer.parseInt(totalCount)<500);
		} else
			Assert.assertTrue(true);
		
		elementClick(By.xpath("//div[@class='searchgroup resetsearch']/a[@href='/search/cta']"));
		System.out.println("reset");
		//span[@class='totalcount']
		
		/*
		//Click Update Search Button
		elementClick(By.xpath("//div[@class='searchgroup resetsearch']/button[@type='submit'][@class='searchlink linklike']"));

		//Find Total Searched Items
		String totalItems= getText(By.xpath("//span[@class='totalcount']")); 
		System.out.println("Total Items for 75062 zip with 1 mile sorrounding is " + totalItems );
		*/
	}
	
	
}//class
