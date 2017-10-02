package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
static WebDriver driver;
public static By theDressShop = By.className("airy-video-container-in");

public static void main(String [] args){
	System.setProperty("webdriver.chrome.driver", "C://Shyam/Automation/ANT/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(theDressShop).click();
	
}
	
	
}
