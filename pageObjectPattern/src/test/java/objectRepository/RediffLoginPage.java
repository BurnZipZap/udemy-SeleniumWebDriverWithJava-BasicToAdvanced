package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signin = By.xpath("//input[@value='Sign in']");
	By home = By.linkText("rediff.com");

	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement getElement(By elementBy) {
		return driver.findElement(elementBy);
	}
	
	public WebElement getUsernameField() {
		return getElement(username);
	}
	
	public WebElement getPasswordField() {
		return getElement(password);
	}
	
	public WebElement getSignIn() {
		return getElement(signin);
	}
	
	public WebElement getHome() {
		return getElement(home);
	}
	
	

}
