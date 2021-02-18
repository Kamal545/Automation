package stark;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(libraries.Listener.class)
public class WebTable {
@Test
	public void table(){
		System.setProperty("webdriver.chrome.driver", "C:\\Kamal\\Tools\\chromedriver.exe");
		WebDriver d = new ChromeDriver(); 
		d.get("https://www.toolsqa.com/automation-practice-table/");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		WebElement table = d.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		//List<WebElement> cols = rows.get(3).findElements(By.tagName("td"));
		
		//System.out.println(cols.get(3).getText());
		
		
		for(int i=0;i<rows.size();i++){
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols.size();j++){
				String country = cols.get(j).getText();
				//System.out.println(country);
				if(country.equalsIgnoreCase("China")){
					
				   System.out.println(cols.get(j).getText()+ " ");	
				   for (int k=j+1;k<cols.size();k++)
				   {
					   System.out.println(cols.get(k).getText()+ " ");
				   }
				}
				
			}
		}
		
	}
	
}
