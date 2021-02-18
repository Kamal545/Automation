package stark;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import libraries.BaseClass;

@Listeners(libraries.Listener.class)
public class Webtable_Checkbox extends BaseClass {
	@Test
	public void click() throws Exception
	{
		d.get("https://www.gyrocode.com/articles/jquery-datatables-checkboxes/");
		WebElement table=d.findElement(By.xpath("//table[@id='example']"));
		List<WebElement> rows=table.findElements(By.xpath("//table[@id='example']//tr"));
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j <cols.size(); j++) {
				
				//System.out.println(cols.get(j).getText()+"     ");
				
				if(cols.get(j).getText().equals("London"))
				{
					System.out.println(cols.get(j-2).getText());
					cols.get(j-3).click();
					
				}
			}
				
			}
			
		}
		
	}

