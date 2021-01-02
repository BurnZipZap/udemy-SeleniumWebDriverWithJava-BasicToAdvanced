package mavenTestFunctionality;

import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void nativeAppAndroid() {
		String string = "";
		for(int i=0; i<50000; i++) {
			string+=i;
		}
		System.out.println("AppiumTest.nativeAppAndroid()");
	}
	
	@Test
	public void iosApp() {
		String string = "";
		for(int i=0; i<50000; i++) {
			string+=i;
		}
		System.out.println("AppiumTest.iosApp()");
	}
	
}
