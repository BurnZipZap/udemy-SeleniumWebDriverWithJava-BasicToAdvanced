import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AndroidDriver<AndroidElement> capabilities() {
		
		/*
		 * In cmd 
		 * ->  cd C:\Users\Burn\AppData\Local\Android\Sdk\emulator
		 * ->  emulator -avd Demo
		 * 
		 * ---------------------------------
		 * C:\Users\Burn\AppData\Local\Android\Sdk\tools\bin\ uiautomatorviewer.bat
		 * With help in this programm you can check info by android element analog appium server fitches
		 * 
		 */
		
		File file = new File("C:\\Projects\\SeleniumWithAppium\\src\\main\\resources\\ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = null;
		try {
			 driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
		
		
	}
}
