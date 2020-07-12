import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Reusable{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		   // WebDriver driver=new ChromeDriver(); 
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\configuration.properties");
		//System.out.println(fi.toString());
		Properties prop = new Properties();
		prop.load(fi);
		    launchbrowser();
		    appurl(prop.getProperty("appurl"));
		    //driver.get("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");  
		    //driver.manage().window().maximize();
		    //String titlename = driver.getTitle();
		    //System.out.println(titlename);
		    Thread.sleep(3000);
		    dropDown(By.id("c0"), "ATI TEAS");
		    //Select select = new Select(driver.findElement(By.id("c0")));
		    //select.selectByIndex(4);
		    //Thread.sleep(3000);
		    //select.selectByValue("739^-99");
		    //Thread.sleep(3000);
		    //select.selectByVisibleText("ATI TEAS");
		    Thread.sleep(3000);
		    driver.close();
		    //only-testing-blog.blogspot.com
	}

}
