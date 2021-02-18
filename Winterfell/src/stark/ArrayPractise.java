package stark;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import libraries.BaseClass;

@Listeners(libraries.Listener.class)
public class ArrayPractise extends BaseClass {

	@Test
	public void arraysort(){
		d.get("http://facebook.com");
		/*	
		List<WebElement> list= d.findElements(By.xpath("//input[@type='radio']//option"));
		
		//System.out.println(list.get(1).getAttribute("text"));
		for(int i=0;i<list.size();i++){
		//list.get(i).click();
		
		System.out.println(list.get(i).isSelected());
		System.out.println(list.get(i).getText());
		}
		*/
		/* Dropdown using Select
		WebElement day = d.findElement(By.id("year"));
		
		Select s = new Select(day);
		
		List<WebElement> days = s.getOptions();
		
		System.out.println(days.size());
		
		for(int i =1; i<days.size();i++){
		
		System.out.println("The year to select is "+days.get(i).getText());
		}
		*/
		
		List<WebElement> months = d.findElements(By.xpath("//select[@id='month']//option"));
		for(int i=1;i<months.size();i++){
		System.out.println(months.get(i).getText());
	}
	}
}
