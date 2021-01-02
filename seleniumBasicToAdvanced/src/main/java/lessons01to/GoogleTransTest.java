package lessons01to;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTransTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://translate.yandex.ru/");
		
		driver.findElement(By.id("fakeArea")).sendKeys("What do you do");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("translation")).getText());
		
		
	}

}
