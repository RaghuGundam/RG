import org.openqa.selenium.By;

public class Alert extends Reusable{
	public static void main(String[] args) throws InterruptedException{
	    launchbrowser();
	    appurl("http://only-testing-blog.blogspot.com/");
	    driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/button[1]")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/button[2]")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().sendKeys("Raghu");
	    Thread.sleep(3000);
	    String textstr = driver.switchTo().alert().getText();
	    System.out.println(textstr);
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    driver.close();
}
}

