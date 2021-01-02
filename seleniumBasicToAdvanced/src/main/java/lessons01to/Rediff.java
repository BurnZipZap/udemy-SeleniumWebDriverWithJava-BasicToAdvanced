package lessons01to;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("123");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
	}
	
	//div[@class='SDkEP']/div[2]/input

}
