package lessons12to;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(500);
		/* ALTERNATIVE ALGORITM WITHOUT JSEXECUTOR
		List<WebElement> list = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getText().equals("BENGALURU AIRPORT")) {
				for(int j=1; j<i; j++) {
					driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
				}
				driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
			}
		}
		*/
		long start = System.currentTimeMillis();
		while(!readMsgFromTextArea(driver).equals("BENGALURU AIRPORT")) {
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			if(System.currentTimeMillis()-start > 150000) {
				throw new RuntimeException("Error name");
			}
		}
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		
		Thread.sleep(15000);
		driver.quit();
	}
	
	static String readMsgFromTextArea(WebDriver driver) throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		return (String) jsExecutor.executeScript(script);
	}
}
