package lessons08to;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		WebElement signinElement = driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(signinElement).build().perform();
		
		Thread.sleep(2000);
		WebElement textAreaElement = driver.findElement(By.id("twotabsearchtextbox"));
		actions.moveToElement(textAreaElement).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello")
			.doubleClick().build().perform();
		actions.moveToElement(signinElement).contextClick().build().perform();
		

		
		
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	
}
