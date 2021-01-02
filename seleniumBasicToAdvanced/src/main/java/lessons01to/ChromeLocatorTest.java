package lessons01to;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLocatorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("123");
		//driver.findElement(By.cssSelector("#email")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123");
		//driver.findElement(By.name("pass")).sendKeys("345");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("345");
		driver.findElement(By.linkText("Забыли пароль?")).click();
	}

}
