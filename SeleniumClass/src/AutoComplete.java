import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoComplete extends Reusable{

	public static void main(String[] args) throws InterruptedException {

		launchbrowser();
		appurl("https://jqueryui.com/autocomplete/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		sendText(By.id("tags"), "A");
		WebElement autocompl = driver.findElement(By.id("ui-id-1"));
		List<WebElement> ac = autocompl.findElements(By.tagName("li"));
		for(int i =0; i < ac.size();i++){
			String value = ac.get(i).getText();
			if(value.equalsIgnoreCase("BASIC")){
				ac.get(i).click();
			}
		}
	Thread.sleep(3000);	
driver.close();
	}

}
