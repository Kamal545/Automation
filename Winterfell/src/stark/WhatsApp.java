package stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsApp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Kamal\\Tools\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://web.whatsapp.com");
		Thread.sleep(3000);
		d.manage().window().maximize();
		
		Thread.sleep(4000);
		
		
	}
}
