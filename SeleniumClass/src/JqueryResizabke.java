import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JqueryResizabke extends Reusable {

	public static void main(String[] args) throws InterruptedException {
	    launchbrowser();
	    appurl("https://jqueryui.com/draggable/");
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Resizable")).click();
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	  Thread.sleep(3000);
	  objname = new Actions(driver);
	  WebElement src = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

		objname.dragAndDropBy(src,230, 20).perform();
	
		
    
     Thread.sleep(3000);
     driver.close();
	}
}
