package testCases;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.util.Hashtable;
import org.testng.annotations.Test;
import utilities.TestUtil;
import base.BaseTest;
import io.restassured.response.Response;

public class GET_REQUEST extends BaseTest {


	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void CREAT_CUST(Hashtable<String, String> data) throws InterruptedException {

		Response response = given().auth().basic(config.getProperty("validSecretKey"), "")
				.formParam("email", data.get("email"))
				.formParam("name", data.get("name"))
				.post(config.getProperty("baseURI") + config.getProperty("basePath")
						+ config.getProperty("customerAPIEndPoint"));
		
		assertEquals(response.statusCode(), 200);
	}

}// class
