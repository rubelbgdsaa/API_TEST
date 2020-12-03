package utilities;
public class TestConfig{


	//JAVA MAIL DETAILS
	public static String server="smtp.gmail.com";
	public static String from = "test.craigslist.proj@gmail.com";
	public static String password = "Java@75038";
	public static String[] to ={"seleniumcoaching@gmail.com","trainer@way2automation.com"};
	public static String subject = "Extent Project Report";
	
	public static String messageBody ="TestMessage";
	public static String attachmentPath="C:\\git\\test-output\\Mon_Aug_03_21_26_23_CDT_2020.jpg";
	public static String attachmentName="error.jpg";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "selenium";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/acs";
	
	
	
	
	
	
	
	
	
}
