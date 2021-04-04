import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium-Course\\\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        
        String originalHandle = driver.getWindowHandle();
        for(String handle1: driver.getWindowHandles())
        {
        	driver.switchTo().window(handle1);
        }
        
        
        driver.switchTo().window(originalHandle);
        newTabButton.click();
//        String originalHandle = driver.getWindowHandle();
        driver.quit();
	}
}
