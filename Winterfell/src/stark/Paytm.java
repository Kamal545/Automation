package stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import libraries.Utilities;

public class Paytm {

	public static void main(String[] args) throws Exception {
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com");
		Thread.sleep(3000);
		d.manage().window().maximize();	
		 Utilities.captureScreenshot(d, "Browser Started");
		 d.findElement(By.linkText("Gmail")).click();
		 Utilities.captureScreenshot(d, "GMail");
		 
		
	}
}

