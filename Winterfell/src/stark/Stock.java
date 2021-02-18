package stark;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stock {
	
@Test
public void stocktable() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Kamal\\Tools\\chromedriver.exe");
	WebDriver d  = new ChromeDriver();
	d.get("https://www.wsj.com/market-data/stocks");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	d.switchTo().frame(0);
	d.findElement(By.xpath("//*[@id='cx-scrim-wrapper']/div[1]")).click();
	Thread.sleep(3000);
	d.switchTo().defaultContent(); 
	WebElement table = d.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div[4]/div/div[1]/div[3]/div/div[1]/div/table"));
    List<WebElement> rows = table.findElements(By.tagName("tr"));
    for(int i=0;i<=rows.size();i++)
    {
    List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
    System.out.print(cols);
    }
    
}

}
