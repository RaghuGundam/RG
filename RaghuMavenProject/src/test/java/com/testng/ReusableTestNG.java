package com.testng;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ReusableTestNG {
	public static WebDriver driver;
	public static String browsername = "chrome";
	public static Actions objname;
	 //static WebDriver driver=new ChromeDriver(); 
	//@Parameters({"browsername","appurl"})
	@BeforeTest(groups={"regression","smoke","sanity"})
	//@BeforeSuite(groups={"regression","smoke","sanity"})
	public static void launchbrowser() throws InterruptedException{
		if(browsername.equalsIgnoreCase("chrome")){
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	   driver=new ChromeDriver(); 
		}else if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\rishitha\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");  
			   driver=new FirefoxDriver(); 
		}
	   driver.get("https://www.flipkart.com/"); 
	   Thread.sleep(3000);
	   click(By.xpath("/html/body/div[2]/div/div/button"));
	 // driver.get("https://www.flipkart.com/samsung-galaxy-m11-black-64-gb/p/itm2b3e5356a5b97?pid=MOBFRZZH4HHGU6YT&lid=LSTMOBFRZZH4HHGU6YTXZHBJZ&marketplace=FLIPKART&srno=b_1_2&otracker=CLP_filters&fm=neo%2Fmerchandising&iid=a45bbbc9-f280-4002-ab65-edff0df5e70b.MOBFRZZH4HHGU6YT.SEARCH&ppt=sp&ppn=sp&ssid=02e3vv292o0000001593917390318");
	  // Thread.sleep(4000);
	 //  String windowname = driver.getWindowHandle();
	   //System.out.println(windowname);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    String titlename = driver.getTitle();
	    System.out.println(titlename);
	    
	}
	/*static void appurl(String URL){
		    driver.get(URL);  
		    driver.manage().window().maximize();
		    String titlename = driver.getTitle();
		    System.out.println(titlename);
	}*/
	
	@AfterSuite(groups={"regression","smoke","sanity"})
	//@AfterTest(groups={"regression","smoke","sanity"})
	public void teardown(){
		driver.quit();
	}
	public static void sendText(By locatorname, String text) throws InterruptedException{
		driver.findElement(locatorname).clear();
		Thread.sleep(3000);
		 driver.findElement(locatorname).sendKeys(text);		
	}
	public static void click(By locatorname){
		
		 driver.findElement(locatorname).click();		
	}
	public static void mouseHover(By locatorname){
		 //Actions objname=new Actions(driver);
		objname=new Actions(driver);
	    //WebElement electronics = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
	    objname.moveToElement(driver.findElement(locatorname)).perform();
	 //  objname.contextClick();
	   // objname.doubleClick(target).perform()
	    //objname.clickAndHold(driver.findElement(locatorname)).moveByOffset(25,54).release(driver.findElement(locatorname));
	}
	
	public static void dropDown(By locatorname,String text){
		 Select sel = new Select(driver.findElement(locatorname));
		 sel.selectByVisibleText(text);
	}

  public static String readtext(By locatorname){
	  String value = driver.findElement(locatorname).getText();
	  return value;
	  
  }
  public static void takescreenshotofpage(String path) throws IOException{
	  TakesScreenshot tc = (TakesScreenshot)driver;
	  File fi = tc.getScreenshotAs(OutputType.FILE);
	 // FileUtils.copyFile(fi, new File(path));
  }
}
//saucelabs
//

