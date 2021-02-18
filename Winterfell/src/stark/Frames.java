package stark;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import libraries.BaseClass;

public class Frames extends BaseClass{
	@Test
	public void paytmLogin(){
		d.get("https://www.guru99.com/live-selenium-project.html");
		//d.findElement(By.xpath("//div[@class='_3ac-']")).click();
		List<WebElement> frames=d.findElements(By.tagName("iframe"));
		
		for (int i = 0; i < frames.size(); i++) {
			d.switchTo().frame(i);
			System.out.println(d.getPageSource());
			
		}
		
		
	}

}
