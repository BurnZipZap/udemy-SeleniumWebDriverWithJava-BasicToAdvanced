package lessons12to;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercises {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30775/sysw-vs-brhw-43rd-match-womens-big-bash-league-2020");
		WebElement tableElement = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> rList = tableElement.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']"));
		//List<WebElement> rList = tableElement.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		int summ = 0;
		for(int i=1; i<rList.size();i++) {
			summ+= Integer.parseInt(rList.get(i).getText());
		}
		
		WebElement extrasElement = tableElement.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']"));
		summ+= Integer.parseInt(extrasElement.getText());
		System.out.println("Extras2var:"+tableElement.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		
		WebElement resElement = tableElement.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold text-black text-right']"));
		System.out.println("Total2var:"+tableElement.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		System.out.println("total: " + resElement.getText() +" ; algoritmicRes: " + summ);
		System.out.println(Integer.parseInt(resElement.getText()) == summ);
		
		driver.quit();
	}

}
