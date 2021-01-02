package lessons01to;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLocatorTest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.name("pw")).sendKeys("123");
		//Thread.sleep(1000);
		//driver.findElement(By.className("button r4 wide primary")).click(); ERROR
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}
	
}
