import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		    //WebDriver driver=new ChromeDriver();  
		    //driver.get("https://www.flipkart.com/");  
		    //driver.manage().window().maximize();
		    //String titlename = driver.getTitle();
		    //System.out.println(titlename);
		    launchbrowser();
		    appurl("https://www.flipkart.com/");
		  
		    Thread.sleep(3000);
		    mouseHover(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		   // Actions objname=new Actions(driver);
		    //WebElement electronics = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		    //objname.moveToElement(electronics).perform();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("Mi")).click();		    

		    Thread.sleep(3000);
		    String text = driver.findElement(By.className("_2yAnYN")).getText();
		    System.out.println(text);
		    if(text.equals("Mi Mobiles")){
		        System.out.println("Text showing correctly");	
		    }
	}

}