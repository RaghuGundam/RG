import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JqueryUI extends Reusable {

	public static void main(String[] args) throws InterruptedException {
	    launchbrowser();
	    appurl("https://jqueryui.com/draggable/");
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	  objname = new Actions(driver);
	  WebElement draggable = driver.findElement(By.id("draggable"));
	 
			  
     objname.dragAndDropBy(draggable, 235, 67).perform();
     Thread.sleep(3000);
     driver.close();
	}

}
