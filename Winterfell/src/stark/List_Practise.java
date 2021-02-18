package stark;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class List_Practise {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Kamal\\Tools\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		//d.manage().window().maximize();
		d.get("http://naukri.com");
		//d.manage().window().maximize();
		String parent=d.getWindowHandle();
		
		Thread.sleep(3000);
		TakesScreenshot img=(TakesScreenshot)d;
		File ss=img.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(ss, new File("./Screenshots/Naukri.png"));;
		
		Set<String> windows =d.getWindowHandles();
		System.out.println(windows.size());
		for(String child:windows){
			if(!parent.equalsIgnoreCase(child)){
				d.switchTo().window(child);
			if(d.getTitle().equals("Amazon")){
				d.switchTo().window(child);
				System.out.println("The page title is "+d.getTitle()+ " so I'm fucking closing it");
				d.close();
				break;
			}
			}
		}
		
		
	}

}
