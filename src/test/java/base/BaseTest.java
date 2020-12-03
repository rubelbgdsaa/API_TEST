package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.ExcelReader;
import utilities.ExtentManager;

import io.restassured.RestAssured;
import utilities.ExcelReader;


public class BaseTest {

	public static Properties config = new Properties();
	private FileInputStream fis;
	public static ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");

	@BeforeSuite
	public void setUp() {

		try {
			fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			config.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		RestAssured.baseURI = config.getProperty("baseURI");

	}

	@AfterSuite
	public void tearDown() {

	}

}




/*
 * @DataProvider public Object[][] getData(){ String sheetName =
 * "Test_FilterSearch"; int rows = excel.getRowCount(sheetName); int cols =
 * excel.getColumnCount(sheetName); Object[][] data = new Object[rows-1][cols];
 * for (int rowNum=2; rowNum<= rows-1; rowNum++ ) { for (int colNum=0; colNum<=
 * cols-1; colNum++ ) { data[rowNum-1][colNum] = excel.getCellData(sheetName,
 * colNum, rowNum); }//inner fexce }//outer for return data; }//public
 * Object[][] getData()
 * 
 */

// class
