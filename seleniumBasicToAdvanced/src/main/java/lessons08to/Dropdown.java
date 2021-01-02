package lessons08to;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Integer sleepTime = 1500;
		Thread.sleep(sleepTime*5);
		/*
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(sleepTime);
		Select adultSelect = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adultSelect.selectByValue("2");
		Thread.sleep(sleepTime);
		*/
		
		/*
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(sleepTime);
		//driver.findElement(By.xpath("//a[contains(text(),'Guwahati (GAU)')]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']"+
				"//a[contains(text(),'Guwahati (GAU)')]")).click();;
		Thread.sleep(sleepTime);
		//driver.findElement(By.xpath("(//a[contains(text(),'Jaipur (JAI)')])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']"+
				"//a[contains(text(),'Jaipur (JAI)')]")).click();
		*/
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		
	}
}
