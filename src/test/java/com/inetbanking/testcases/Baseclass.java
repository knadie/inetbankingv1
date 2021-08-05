package com.inetbanking.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

//import com.inetbankint.utilities.ReadConfig;

public class Baseclass {

	// ReadConfig readconfig =new ReadConfig();

	public String Baseurl = ("http://demo.guru99.com/V1/index.php");
	public String username = "mngr344787";
	public String password = "ejUduja";
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String brws) {
		logger = Logger.getLogger("Ebanking");
		PropertyConfigurator.configure("log4j.properties");

		if (brws.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (brws.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public String Randomstring() {
		String randomalph = RandomStringUtils.randomAlphabetic(8);
		return randomalph;
	}
}
