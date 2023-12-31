package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	public static String browser = "FireFox";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("FireFox")){
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
//		ChromeDriver driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();

	}

}
