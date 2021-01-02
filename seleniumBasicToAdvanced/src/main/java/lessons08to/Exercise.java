package lessons08to;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//ul[@class='Bgzgmd']/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Set<String> windowSet = driver.getWindowHandles();
		Iterator<String> iterator = windowSet.iterator();
		String parentId = iterator.next();
		String childId = iterator.next();
		System.out.println(driver.getTitle());
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}

}
