package mainpac;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void demo1() {
		System.out.println("Hello");
	}

	@Test
	public void demo2() {
		System.out.println("Hello2");
	}

	@Test
	public void demo3() {
		System.out.println("Hello3");
	}

	@BeforeTest
	public void before() {
		System.out.println("run the @BeforeTestDay1");
	}

	@AfterTest
	public void after() {
		System.out.println("run the @@AfterTestDay1");
	}

}
