
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReadDropdwonData extends Reusable{

	public static void main(String[] args) {
      launchbrowser();
      appurl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      WebElement sponsername = driver.findElement(By.id("c0"));
      List<WebElement> nm = sponsername.findElements(By.tagName("option"));
      System.out.println(nm.size());
      for(int i =0; i<nm.size();i++){
    	  String value= nm.get(i).getText();
    	  System.out.println(value);
      }
      driver.close();
      

	}

}
