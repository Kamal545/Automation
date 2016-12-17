package nextG;
import java.io.FileInputStream;
import java.util.Iterator;
import javax.imageio.stream.FileImageInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.jdt.internal.compiler.ast.WhileStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

public class Excel {
  @Test
  public void a() throws Exception{
	  WebDriver d=new FirefoxDriver();
	  d.get("http://newtours.demoaut.com/");
	  d.manage().window().maximize();
	  Thread.sleep(3000);
	  d.findElement(By.linkText("REGISTER")).click();
	  FileInputStream f=new FileInputStream("C:\\Users\\KAMAL S\\Desktop\\Kamal.xlsx");
	  @SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(f);
	  XSSFSheet ws=wb.getSheet("Sheet1");
	  Iterator<Row> row= ws.iterator();
	 // row.next();
	  while (row.hasNext()) {
		  Row r=row.next();
	 d.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
	 d.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
	 d.findElement(By.name("phone")).sendKeys(r.getCell(2).getStringCellValue());
	 d.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
	 d.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
	 d.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
	 d.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
	 d.findElement(By.name("postalCode")).sendKeys(r.getCell(7).getStringCellValue());
	 d.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
	 d.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
	 d.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
	 d.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
	 d.findElement(By.name("register")).click();
	 d.navigate().back();
	  }
  }
}
