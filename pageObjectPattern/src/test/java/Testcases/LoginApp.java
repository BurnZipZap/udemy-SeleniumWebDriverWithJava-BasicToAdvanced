package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;
import objectRepository.RediffLoginPagePF;

public class LoginApp {
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Programming\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(1000);
		
		//RediffLoginPage rediffLoginPage = new RediffLoginPage(driver);
		RediffLoginPagePF rediffLoginPage = new RediffLoginPagePF(driver);
		rediffLoginPage.getUsernameField().sendKeys("123");
		rediffLoginPage.getPasswordField().sendKeys("456");
		rediffLoginPage.getSignIn().click();
		rediffLoginPage.getHome().click();
		Thread.sleep(500);
		
		RediffHomePage rediffHomePage = new RediffHomePage(driver);
		rediffHomePage.getSearchField().sendKeys("123");
		rediffHomePage.getSearchButton().click();
		
		
		Thread.sleep(1500);
		driver.quit();
	}
}
