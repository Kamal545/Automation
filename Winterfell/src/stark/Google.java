package stark;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.asserts.SoftAssert;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Kamal\\Tools\\chromedriver.exe");
		WebDriver d  = new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*Thread.sleep(3000); */
        d.findElement(By.xpath("//*[@name='q']")).sendKeys("Kamal");
        Thread.sleep(3000);  
        d.findElement(By.xpath("//input[@class='gNO89b']")).click();
        Thread.sleep(3000);
     
        String S = d.findElement(By.xpath("//div[@id='resultStats']")).getText();
        
        System.out.println(S);
        
        String Results[] = S.split(" ");
                
        /*System.out.println(Results[1]);*/
        
        String D = Results[1];
        
       /* System.out.println(D); */
        
        String f[] = D.split(",");
        String count = "";           
       
        for(int i=0;i<f.length;i++)
        {
        	count = count + f[i];
        	
        }
                
		System.out.println(count);
		
		int x = Integer.parseInt(count);
		
			
			
	}

}
