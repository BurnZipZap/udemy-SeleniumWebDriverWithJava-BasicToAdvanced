


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class FullElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Integer sleepTime = 1500;
		Thread.sleep(sleepTime*3);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(sleepTime);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']"+
				"//a[contains(text(),'Guwahati (GAU)')]")).click();;
		Thread.sleep(sleepTime);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']"+
				"//a[contains(text(),'Jaipur (JAI)')]")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(sleepTime);
		Select adultSelect = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adultSelect.selectByValue("2");
		Thread.sleep(sleepTime);
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
}
