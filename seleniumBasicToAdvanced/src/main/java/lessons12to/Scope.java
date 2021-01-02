package lessons12to;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//count all links
		System.out.println(driver.findElements(By.tagName("a")).size());

		
		//count footer links
		System.out.println(driver.findElement(By.xpath("//div[@id='gf-BIG']"))
				.findElements(By.tagName("a")).size());
		
		//count footer 1 columns links
		System.out.println(driver.findElement(By.xpath("//div[@id='gf-BIG']"))
				.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"))
				.findElements(By.tagName("a")).size());
		
		//open links on the column
		List<WebElement> linksElements = driver.findElement(By.xpath("//div[@id='gf-BIG']"))
		.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"))
		.findElements(By.tagName("a"));
		
		for (WebElement webElement : linksElements) {
			webElement.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
		Thread.sleep(3000);
		Set<String> windowSet = driver.getWindowHandles();
		Iterator<String> iterator = windowSet.iterator();
		while(iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			System.out.println(driver.getTitle());
		}
	}
}
