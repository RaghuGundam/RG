package com.flipkart.businessscripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.ReusableTestNG;

public class Electronics extends ReusableTestNG{
	
	//@BeforeClass(groups={"sanity","regression","smoke"})
	@BeforeMethod(groups={"sanity","regression","smoke"})
	public void movetoelectronics() throws InterruptedException{
		Thread.sleep(3000);
		mouseHover(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
	}

// @Test(priority =1,groups={"sanity"})
 @Test(priority =1,groups={"regression"})
	public void samsung() throws InterruptedException, IOException{
		//mouseHover(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		click(By.linkText("Samsung"));
		Thread.sleep(9000);
	List<WebElement> no_of_elements = driver.findElements(By.xpath("//*[@id='container']/div/div[3]/div[3]/div"));
		////*[@id="container"]/div/div[3]/div[3]/div[1]/div/div[1]/div[1]/h2
	    System.out.println(no_of_elements.size());
	    //for(int i =0 ; i< no_of_elements.size(); i++)
	    for(int i =0 ; i< 5; i++){
	    	String value = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[3]/div["+(i+1)+"]/div/div[1]/div[1]/h2")).getText();
	    System.out.println(value);
	    if(value.equalsIgnoreCase("Samsung Mobile under ₹15K")){
	    	click(By.xpath("//*[@id='container']/div/div[3]/div[3]/div["+(i+1)+"]/div/div[1]/div[2]/a/span"));
	    	Thread.sleep(9000);
	    	break;
	    	
	    }

	    }
	  click(By.xpath("//div[contains(text(),'Samsung Galaxy M11 (Black, 32 GB)')]"));
	  //driver.switchTo().window("CDwindow-08276563FF614E9063803973066B5F9E");
	  String main_window = driver.getWindowHandle();
	  Set<String> number_of_windows = driver.getWindowHandles();
	  System.out.println(number_of_windows.size());
	  Iterator<String> itr = number_of_windows.iterator();
	  while(itr.hasNext()){
		  String windownames = itr.next();
		  if(!windownames.equals(main_window)){
			  driver.switchTo().window(windownames);
		  }
		  
	  }
	//String actualvalue = readtext(By.xpath("//div[@class='_13J5uS']"));
	//Assert.assertEquals("Currently out of stock in this area.",actualvalue);
	  click(By.xpath("//button[text()='ADD TO CART']"));
	  takescreenshotofpage("C:\\Users\\rishitha\\Desktop\\ss.png");
	    Thread.sleep(6000);
	    driver.close();
	    driver.switchTo().window(main_window);
	}


@Test(priority=2,groups={"regression"})
public void addMIMobiles() throws InterruptedException, IOException{
/*	Thread.sleep(3000);
	mouseHover(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));*/

	click(By.linkText("Realme"));
	Thread.sleep(9000);
	click(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]"));
	Thread.sleep(3000);
	click(By.xpath("//div[text()='Realme X2 Pro (Lunar White, 256 GB)']"));
	Thread.sleep(3000);
	  String main_window = driver.getWindowHandle();
	  Set<String> number_of_windows = driver.getWindowHandles();
	  System.out.println(number_of_windows.size());
	  Iterator<String> itr = number_of_windows.iterator();
	  while(itr.hasNext()){
		  String windownames = itr.next();
		  if(!windownames.equals(main_window)){
			  driver.switchTo().window(windownames);
		  }
		  
	  }
	  Thread.sleep(5000);
	  click(By.xpath("//button[text()='ADD TO CART']"));
	  takescreenshotofpage("C:\\Users\\rishitha\\Desktop\\mi.png");
	  driver.close();
	    driver.switchTo().window(main_window);
	    //driver.navigate().refresh();
	
}

}
