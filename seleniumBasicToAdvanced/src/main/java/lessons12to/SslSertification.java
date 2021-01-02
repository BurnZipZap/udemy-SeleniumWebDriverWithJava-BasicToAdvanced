package lessons12to;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslSertification {

	public static void main(String[] args) {
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
		//desiredCapabilities.acceptInsecureCerts();
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(desiredCapabilities);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
	}

}
