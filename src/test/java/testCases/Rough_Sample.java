package testCases;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Hashtable;
import org.testng.annotations.Test;
import utilities.TestUtil;
import base.BaseTest;
import io.restassured.response.Response;

public class Rough_Sample extends BaseTest {

	@Test
	public void CHECK_FW() throws InterruptedException {

		Response response = given().auth().basic(config.getProperty("validSecretKey"), "")
				.formParam("email", "fsfdsadfa@gmail.com")
				.formParam("name", "fsdadsfasdfdsdf adfasdfasds")
				.post(config.getProperty("baseURI") + config.getProperty("basePath")
						+ config.getProperty("customerAPIEndPoint"));
				
		
		
		response.prettyPrint();

	}
}