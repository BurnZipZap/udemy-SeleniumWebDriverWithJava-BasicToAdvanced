package mavenTestFunctionality;

import org.testng.annotations.Test;

public class RestApiTest {

	@Test
	public void postJira() {
		String string = "";
		for(int i=0; i<50000; i++) {
			string+=i;
		}
		System.out.println("RestApiTest.postJira()");
	}
	
	@Test
	public void deleteTwitter() {
		String string = "";
		for(int i=0; i<50000; i++) {
			string+=i;
		}
		System.out.println("RestApiTest.deleteTwitter()");
	}
}
