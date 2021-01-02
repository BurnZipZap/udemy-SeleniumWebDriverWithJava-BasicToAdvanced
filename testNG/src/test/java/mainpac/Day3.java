package mainpac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	public WebDriver driver = null;

	@BeforeSuite
	public void login() {
		Properties properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("../testNG/src/test/java/mainpac/datadriven.properties");
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("I am the First");
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("url"));

		System.setProperty("webdriver.chrome.driver", "C:\\Programming\\chromedriver.exe");

		if (properties.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			throw new RuntimeException();
		}

		driver.get(properties.getProperty("url"));
		driver.quit();

	}

	@BeforeClass
	public void bc() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void ac() {
		System.out.println("@AfterClass");
	}

	@Test
	public void webLogin() {
		System.out.println("");
		System.out.println("webLogin");
		System.out.println("");
		Assert.assertTrue(false);
	}

	@Test(dataProvider = "getData")
	public void datapr(String user, String pass) {
		System.out.println("data ------------> " + user + " " + pass);
	}

	@Test(dataProvider = "getData")
	public void datapr2(Object user, Object pass) {
		System.out.println("data ------------> " + user + " " + pass);
	}

	@Test(dependsOnMethods = { "webLogin" })
	public void mobileLogin() {
		System.out.println("");
		System.out.println("mobileLogin");
		System.out.println("");
	}

	@Test(enabled = false)
	public void mobile1() {
		System.out.println("mobile1");
	}

	@Parameters({ "URL", "APIKEY" })
	@Test(groups = { "Smoke" })
	public void mobile2(String url, String api) {
		System.out.println("mobile2" + url + " " + api);
	}

	@Test(enabled = false)
	public void loginAPI2() {
		System.out.println("loginAPI2");
	}

	@BeforeSuite
	public void bs() {
		System.out.println("@beforeSuite");
	}

	@AfterSuite
	public void as() {
		System.out.println("@afterSuite");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("@beforeMethod");
	}

	@AfterMethod
	public void am() {
		System.out.println("@afterMethod");
	}

	@Test(timeOut = 400)
	public void noginAPI() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("loginAPI");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		// user1
		data[0][0] = "zerou";
		data[0][1] = "zerop";

		// user2
		data[1][0] = "oneu";
		data[1][1] = "onep";

		// user3
		data[2][0] = "twou";
		data[2][1] = "twop";

		return data;
	}
}
