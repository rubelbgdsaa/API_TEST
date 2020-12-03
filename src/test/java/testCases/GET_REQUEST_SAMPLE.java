package testCases;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Hashtable;
import org.testng.annotations.Test;
import utilities.TestUtil;
import base.BaseTest;
import io.restassured.response.Response;

public class GET_REQUEST_SAMPLE extends BaseTest {

	@Test
	public void CHECK_FW() throws InterruptedException {

		Response response = given().auth().basic(config.getProperty("validSecretKey"), "")
				.formParam("email", "fsfdsafdfa@gmail.com")
				.formParam("name", "fsdadsfasdfdsdf adfasdfasds")
				.post(config.getProperty("baseURI") + config.getProperty("basePath")
						+ config.getProperty("customerAPIEndPoint"));
				Thread.sleep(2000);
		response.prettyPrint();
				
		
		
		response.prettyPrint();

	}
}