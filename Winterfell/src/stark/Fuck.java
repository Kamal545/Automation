package stark;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Fuck {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("http://www.timeanddate.com/worldclock/");
		
		WebElement table= d.findElement(By.xpath("//table[@class='zebra fw tb-wc']"));
		 List<WebElement> rows= table.findElements(By.tagName("tr"));
		 
		 
		 for (int i = 0; i < rows.size(); i++) 
		 {
			 List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			
			 
			for(int j=0;j<cols.size();j++)
			{
				 System.out.print(cols.get(j).getText()+"     ");
			}
			 
			System.out.println();
			 
		}
		 
		 
		 
	}

	}


