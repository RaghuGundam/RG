import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollBar extends Reusable {

	public static void main(String[] args) throws InterruptedException, AWTException {
		launchbrowser();
		appurl("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(6000);
	  WebElement nc = driver.findElement(By.linkText("Nikon Camera"));
	   /* Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_F);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_F);
	    r.keyPress(KeyEvent.VK_N);
	    r.keyRelease(KeyEvent.VK_N);*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1800)");
		//js.executeScript("arguments[0].scrollIntoView(true)", nc);
		//js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.linkText("Contact Us")));
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Nikon Camera")).click();
		
		js.executeScript("arguments[0].click();", nc);
		
		Thread.sleep(4000);
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		driver.close();
	}

}
