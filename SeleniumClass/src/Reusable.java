import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Reusable {
	static WebDriver driver;
	static Actions objname;
	 //static WebDriver driver=new ChromeDriver(); 
	static void launchbrowser(){
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	   driver=new ChromeDriver(); 
	}
	static void appurl(String URL){
		    driver.get(URL);  
		    driver.manage().window().maximize();
		    String titlename = driver.getTitle();
		    System.out.println(titlename);
	}
	
	static void sendText(By locatorname, String text) throws InterruptedException{
		driver.findElement(locatorname).clear();
		Thread.sleep(3000);
		 driver.findElement(locatorname).sendKeys(text);		
	}
	static void click(By locatorname){
		
		 driver.findElement(locatorname).click();		
	}
	static void mouseHover(By locatorname){
		 //Actions objname=new Actions(driver);
		objname=new Actions(driver);
	    //WebElement electronics = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
	    objname.moveToElement(driver.findElement(locatorname)).perform();
	 //  objname.contextClick();
	   // objname.doubleClick(target).perform()
	    //objname.clickAndHold(driver.findElement(locatorname)).moveByOffset(25,54).release(driver.findElement(locatorname));
	}
	
	static void dropDown(By locatorname,String text){
		 Select sel = new Select(driver.findElement(locatorname));
		 sel.selectByVisibleText(text);
	}


}


