package stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Operations {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");
	driver.manage().window().maximize();
	
	
	 WebElement src= driver.findElement(By.xpath("html/body/div[1]/header/div/div[3]/div[1]/div[2]/a/span[1]"));
	 	   
	 Actions obj= new Actions(driver);
	 
	 obj.moveToElement(src).perform();

	}

}
