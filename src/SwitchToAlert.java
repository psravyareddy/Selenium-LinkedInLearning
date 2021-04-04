import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium-Course\\\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://formy-project.herokuapp.com/switch-window");
//	        WebElement newTabButton = driver.findElement(By.id("alert-button"));
	        WebElement alertButton = driver.findElement(By.id("alert-button"));
	        alertButton.click();
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        driver.quit();
	}

}
