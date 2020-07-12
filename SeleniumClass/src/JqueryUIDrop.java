import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JqueryUIDrop extends Reusable {

	public static void main(String[] args) throws InterruptedException {
	    launchbrowser();
	    appurl("https://jqueryui.com/draggable/");
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Droppable")).click();
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	  objname = new Actions(driver);
	  WebElement src = driver.findElement(By.id("draggable"));
	  WebElement dest = driver.findElement(By.id("droppable"));
	 objname.dragAndDrop(src, dest).perform();
			  
     //objname.dragAndDropBy(draggable, 235, 67).perform();
     Thread.sleep(3000);
     driver.close();
	}

}