package stark;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) throws Exception {
		WebDriver d=new FirefoxDriver();
		d.get("http://redbus.in");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		d.findElement(By.id("onward_cal")).click();
		List<WebElement> data=d.findElements(By.xpath("//div[@class='rb-calendar']//td"));
		
		for(int i=0;i<data.size();i++){
			
			if(data.get(i).getText().equals("28")){
			data.get(i).click();
		}
		}

	}

}
