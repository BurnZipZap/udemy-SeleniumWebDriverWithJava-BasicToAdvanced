package lessons01to;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("al_burn@inbox.ru");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Gror1234142");
		//System.out.println(driver.findElement(By.id("u_0_b")).getText());
		//driver.findElement(By.id("u_0_b")).click();
		//System.out.println(driver.findElement(By.xpath("//button[@id='u_0_b']")).getText());
		//driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("al_burn@inbox.ru");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Gror1234142");
		driver.findElement(By.cssSelector("button[id='u_0_b']")).click();
		
		
	}
	
}
