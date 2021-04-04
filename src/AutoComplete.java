import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Course\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1555 Park Blvd, Palto Alto, CA");
		Thread.sleep(1000);
		WebElement autoCompleteResult = driver.findElement(By.className("pac-name"));
		
		autoCompleteResult.click();
		driver.quit();
	}

}
