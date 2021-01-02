package mavenTestFunctionality;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void browserAutomatisation() {
		String string = "";
		for(int i=0; i<50000; i++) {
			string+=i;
		}
		System.out.println("SeleniumTest.browserAutomatisation()");
	}
	
	@Test
	public void elementsUI() {
		String string = "";
		for(int i=0; i<50000; i++) {
			string+=i;
		}
		System.out.println("SeleniumTest.elementsUI()");
	}
}
