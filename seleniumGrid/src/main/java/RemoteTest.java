import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteTest {

	public static void main(String[] args) throws MalformedURLException {
		
		/*
		 *  SERVER -> java -jar selenium-server-standalone-3.141.59.jar -role hub
		 *  
		 *  TEST MACHINE -> java -Dwebdriver.chrome.driver="C:\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.43.163:4444/grid/register -port 5566
		 */
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName("chrome");
		desiredCapabilities.setPlatform(Platform.WINDOWS);
	
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),desiredCapabilities);
		driver.get("https://www.google.ru/");
	}

}
