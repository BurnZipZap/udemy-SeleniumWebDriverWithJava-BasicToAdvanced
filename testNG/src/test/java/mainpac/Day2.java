package mainpac;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {

	@Parameters({ "URL" })
	@Test(groups = { "Smoke" })
	public void ploan(String url) {
		System.out.println("Good");
		System.out.println("Good" + url);
	}

	@BeforeTest
	public void before() {
		System.out.println("run the @BeforeTestDay2");
	}

}
