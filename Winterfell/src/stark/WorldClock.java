package stark;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorldClock {

	public static void main(String[] args) throws Exception {
		WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement table =d.findElement(By.xpath("//table[@class='zebra fw tb-wc']"));
		List<WebElement> rows =table.findElements(By.tagName("tr"));
		List<WebElement> cols= rows.get(3).findElements(By.tagName("td"));
		
		System.out.println(cols.get(2).getText());
				
	}
}
