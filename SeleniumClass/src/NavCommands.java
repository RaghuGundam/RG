import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavCommands {

			public static void main(String[] args) throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
			    WebDriver driver=new ChromeDriver();  
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Launch website  
			    driver.get("http://www.eenadu.net");  
			    driver.manage().window().maximize();
			    driver.findElement(By.linkText("ఆంధ్రప్రదేశ్")).click();
			 
			    driver.findElement(By.linkText("తెలంగాణ")).click();
	
			    driver.findElement(By.linkText("జాతీయ- అంతర్జాతీయ")).click();
			  
			    driver.findElement(By.linkText("క్రైమ్")).click();
			
			    driver.findElement(By.linkText("వసుంధర")).click();
			  
			    driver.navigate().back();
			    
			    System.out.println(driver.getCurrentUrl());
			    driver.navigate().forward();
			
			    System.out.println(driver.getCurrentUrl());
			    driver.navigate().back();
			    
			
			    driver.findElement(By.id("sub")).sendKeys(Keys.F5);
			
			    driver.close();
		}

	}
