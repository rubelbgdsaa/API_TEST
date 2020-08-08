package rough;

import java.util.Date;

public class RoughWork {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("<a target=\\\"_blank\\\" href=\\\"c:\\\\java\\\\pic.jpg\\\">Login Screen link</a>" + d);
		String fName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		System.out.println(fName);

	}

}
