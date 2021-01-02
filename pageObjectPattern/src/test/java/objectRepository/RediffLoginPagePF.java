package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class RediffLoginPagePF {

	WebDriver driver;
	/*
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signin = By.xpath("//input[@value='Sign in']");
	By home = By.linkText("rediff.com");
	*/
	
	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Sign in']")
	WebElement signin;
	
	@FindBy(linkText = "rediff.com")
	WebElement home;
	
	public RediffLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	private WebElement getElement(By elementBy) {
		return driver.findElement(elementBy);
	}
	*/
	
	public WebElement getUsernameField() {
		return username;
	}
	
	public WebElement getPasswordField() {
		return password;
	}
	
	public WebElement getSignIn() {
		return signin;
	}
	
	public WebElement getHome() {
		return home;
	}
	
	

}
