package libraries;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utilities {
	
		public static void captureScreenshot(WebDriver d,String screenshotname) throws IOException{
		 TakesScreenshot src=(TakesScreenshot)d;
		 File pic = src.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(pic, new File("./Screenshots/"+screenshotname+".png"));
		System.out.println("Screenshot Captured");
	}
}
