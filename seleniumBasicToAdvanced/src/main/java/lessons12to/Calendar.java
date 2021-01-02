package lessons12to;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000);
		driver.findElement(By.id("travel_date")).click();
		Thread.sleep(1000);
		
		//Click to 23 July 2021
		String yearAndMountsAreaXpath = "//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']";
		while(!driver.findElement(By.xpath(yearAndMountsAreaXpath)).getText().equals("July 2021")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> dates = driver.findElements(By.className("day"));
		for (WebElement date : dates) {
			if(date.getText().equals("23")){
				date.click();
				break;
			}
		}
	}
	
}
