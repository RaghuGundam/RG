import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet extends Reusable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver(); 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  //appurl("https://www.spicejet.com/");
		  driver.get("https://www.spicejet.com/");  
		
		    driver.manage().window().maximize();
		    Thread.sleep(6000);
		    String titlename = driver.getTitle();
		    Thread.sleep(6000);
		    System.out.println(titlename);
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Amritsar (ATQ)");
		  driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).clear();
		  driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Bengaluru (BLR)");
		 // Thread.sleep(6000); 
		driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[4]/button")).click();
		//Thread.sleep(6000);
		
		String str1 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
		String str2 = "December";
		while(!str1.equals(str2)){		
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			str1 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();

		}
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(6000);
		  driver.close();
		
	}

}
