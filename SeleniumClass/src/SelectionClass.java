import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectionClass extends Reusable {

	public static void main(String[] args) throws InterruptedException {
	    launchbrowser();
	    appurl("https://jqueryui.com/draggable/");
	    driver.findElement(By.linkText("Selectable")).click();
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	  objname = new Actions(driver);
	  WebElement item1 = driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
	  WebElement item3 = driver.findElement(By.xpath("//*[@id='selectable']/li[3]")); 
	  WebElement item5 = driver.findElement(By.xpath("//*[@id='selectable']/li[5]"));
	  WebElement item7 = driver.findElement(By.xpath("//*[@id='selectable']/li[7]")); 
	 Thread.sleep(3000);
	 objname.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).perform();
	 objname.keyUp(Keys.CONTROL).perform();
      Thread.sleep(3000);
     driver.close();
	}

}