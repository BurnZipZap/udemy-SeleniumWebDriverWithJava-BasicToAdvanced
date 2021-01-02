package lessons08to;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		WebElement littleBox = driver.findElement(By.id("draggable"));
		littleBox.click();
		Actions actions = new Actions(driver);
		WebElement bigBox = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(littleBox, bigBox).build().perform();
		driver.switchTo().defaultContent(); //Переход на дефолтное окно, а не на фрейм
		
	}

}
