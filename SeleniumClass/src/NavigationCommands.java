import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		    driver.get("http://www.eenadu.net");  
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("ఆంధ్రప్రదేశ్")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("తెలంగాణ")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("జాతీయ- అంతర్జాతీయ")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("క్రైమ్")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("వసుంధర")).click();
		    Thread.sleep(3000);
		    driver.navigate().back();
		    Thread.sleep(3000);	 
		    System.out.println(driver.getCurrentUrl());
		    driver.navigate().forward();
		    Thread.sleep(3000);	 
		    System.out.println(driver.getCurrentUrl());
		    driver.navigate().refresh();
		    Thread.sleep(3000);
		    String url=driver.getCurrentUrl();
		    driver.get(url);
		    Thread.sleep(3000);
		    driver.navigate().to(url);
		    Thread.sleep(3000);
		    driver.findElement(By.id("search")).sendKeys(Keys.F5);
		    Thread.sleep(5000);
		    driver.close();
	}

}
