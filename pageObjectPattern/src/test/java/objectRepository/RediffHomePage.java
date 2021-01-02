package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;
	By shoppingSearch = By.xpath("//input[@id='srchword']");
	By searchGo = By.xpath("//form[@name='srchform']/input[@type='submit']");
	
	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement getElement(By elementBy) {
		return driver.findElement(elementBy);
	}
	
	public WebElement getSearchField() {
		return getElement(shoppingSearch);
	}
	
	public WebElement getSearchButton() {
		return getElement(searchGo);
	}
	
	

}
