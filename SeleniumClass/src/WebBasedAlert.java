import org.openqa.selenium.By;

public class WebBasedAlert extends Reusable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    launchbrowser();
	    appurl("https://candidate.psiexams.com/account/create_account.jsp");
	    sendText(By.name("emailid"),"rgundam8@gmail.com");
	    sendText(By.name("firstname"),"rgundam");
	    sendText(By.name("lastname"),"james");
	    click(By.name("Submit"));
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	}

}
