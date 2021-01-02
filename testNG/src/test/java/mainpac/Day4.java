package mainpac;

import org.testng.annotations.Test;

public class Day4 extends Day3 {

	@Test
	public void webLoginCar() {
		login();
		System.out.println("webLoginCar");
	}

	@Test(groups = { "Smoke" })
	public void mobileLoginCar() {
		System.out.println("mobileLoginCar");
	}

	@Test
	public void loginAPICar() {
		System.out.println("loginAPICar");
	}
}
