package stark;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import libraries.BaseClass;

public class Practice extends BaseClass{
	@Test
	public void links(){
	
		d.get("http://webdatacommons.org/webtables/");
		WebElement table=d.findElement(By.cssSelector("#toccontent>table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		List<WebElement> cols1=rows.get(1).findElements(By.tagName("td"));
		
		List<WebElement> cols2=rows.get(2).findElements(By.tagName("td"));
		
	    String i= cols1.get(1).getText();
	    
	    String j= cols2.get(1).getText();
	    
	  float a=Float.parseFloat(i);
	  float b=Float.parseFloat(j);
	System.out.println(a+b);
		
	
	
	}
	
	
	}   
	  
		
	
