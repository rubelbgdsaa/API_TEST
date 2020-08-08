package testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Verify_All_Links extends BaseClass{

	@Test
	void verify_all__links_of_the_page() throws MalformedURLException, IOException {
		String url;
		HttpURLConnection huc;
		int respCode;
		//driver.get("file:///C:/Java/form.html");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// Obtain Iterator to traverse through the List.
		for (WebElement link : links) {
			// Step 3: Identifying and Validating URL
			// In this part, we will check if URL belongs to Third party domain or whether
			// URL is empty/null.

			// Get href of anchor tag and store it in url variable.

			url = link.getAttribute("href");
			// Check if URL is null or Empty and skip the remaining steps if the condition
			// is satisfied.

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			// Check whether URL belongs to a main domain or third party. Skip the remaining
			// steps if it belongs to third party domain.

			// if(!url.startsWith(homePage)){
			// System.out.println("URL belongs to another domain, skipping it.");
			// continue;
			// }
			// Step 4: Send http request
			// HttpURLConnection class has methods to send HTTP request and capture HTTP
			// response code. So, output of openConnection() method (URLConnection) is type
			// casted to HttpURLConnection.

			huc = (HttpURLConnection) (new URL(url).openConnection());
			// We can set Request type as "HEAD" instead of "GET". So that only headers are
			// returned and not document body.

			huc.setRequestMethod("HEAD");
			// On invoking connect() method, actual connection to url is established and the
			// request is sent.

			huc.connect();
			// Step 5: Validating Links
			// Using getResponseCode() method we can get response code for the request

			respCode = huc.getResponseCode();
			// Based on response code we will try to check link status.

			if (respCode >= 400) {
				System.out.println(url + " is a broken link");
			} else {
				System.out.println(url + " is a valid link");
			}
		} // forloop
	}
}
