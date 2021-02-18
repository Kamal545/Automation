package stark;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(libraries.Listener.class)
public class Creative {
	
	@Test
	public static void main() throws Exception{
	WebDriver d;
	System.setProperty("webdriver.gecko.driver", "C:\\Kamal\\Tools\\geckodriver.exe");
	d=new FirefoxDriver();
	
		d.get("http://facebook.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement months=d.findElement(By.id("month"));
		Select m=new Select(months);
		List<WebElement> mon=m.getOptions();
		
		FileInputStream file=new FileInputStream("C:\\Users\\KAMAL S\\Desktop\\Kamal.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(file);
	   	XSSFSheet ws=wb.getSheetAt(1); 
	    for (int i = 0; i <mon.size(); i++) {
          String exp=ws.getRow(i).getCell(0).getStringCellValue();
          String act=mon.get(i).getText();
          System.out.println(exp +"    "+act);
          if(exp.equals(act))
          {
        	  ws.getRow(i).createCell(1).setCellValue("Pass");
          }
          else{
        	  ws.getRow(i).createCell(1).setCellValue("Fail");
          }
          FileOutputStream fout=new FileOutputStream("C:\\Users\\KAMAL S\\Desktop\\Kamal.xlsx");
          wb.write(fout);
    	}
	     
		wb.close();
		d.quit();
	    }
}
	
	

