package libraries;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
	public WebDriver d;
	
	@BeforeMethod	
   public void openApp() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Kamal\\Tools\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeApp(){
		d.quit();
	}

}
