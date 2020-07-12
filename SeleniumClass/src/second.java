
//https://www.mortgagecalculator.org/

	import org.openqa.selenium.By;  
	import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;  
	  
	public class second {  
	  
	    public static void main(String[] args) throws InterruptedException {  
	        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.get("https://www.mortgagecalculator.org/");  
	    driver.manage().window().maximize();  
	    Thread.sleep(4000);
	    Select dropdown = new Select(driver.findElement(By.name("param[start_month]")));  
	    dropdown.selectByVisibleText("Nov");
	    
	    Thread.sleep(4000);
	    Select dropdown1 = new Select(driver.findElement(By.name("param[milserve]")));
	    dropdown1.selectByVisibleText("USDA");
	    Thread.sleep(4000);
	    
	   // driver.findElement(By.xpath("/html/body/section/div/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[2]/span/label[2]/input")).click();
	    driver.findElement(By.xpath("//form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[2]/span/label[2]/input")).click();
	    }
	    
	    
}
