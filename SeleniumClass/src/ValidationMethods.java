import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		    //WebDriver driver=new ChromeDriver(); 
		  ChromeDriver driver=new ChromeDriver();  
		    driver.get("https://www.bing.com");  
		    driver.manage().window().maximize();
		    String titlename = driver.getTitle();
		    System.out.println(titlename);
		    Thread.sleep(3000);
            Boolean logo  = driver.findElement(By.id("b_logo")).isDisplayed();
            if(logo == true){
            System.out.println("Logo present");                   
            }else {
            	System.out.println("Logo not present");	
            }
            Boolean enb  = driver.findElement(By.id("sb_form_q")).isEnabled();
            if(enb == true){
            	driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");              
            }else {
            	System.out.println(" not enabled");	            	
	}
            
            Thread.sleep(3000);
            driver.findElement(By.id("id_sc")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='hbsettings']/div")).click(); 
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='hbsettree']/a[4]/div/div[2]")).click();  
            Thread.sleep(3000);
            Boolean selc = driver.findElement(By.id("enAS")).isSelected();
            Thread.sleep(3000);
            System.out.println(selc); 
            Thread.sleep(3000);
            driver.findElement(By.id("enAS")).click();            
          
	}            

}
