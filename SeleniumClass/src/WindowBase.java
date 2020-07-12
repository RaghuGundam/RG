import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;

public class WindowBase extends Reusable {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		launchbrowser();
	    appurl("https://www.naukri.com/");
	    Thread.sleep(3000);
	    click(By.id("wdgt-file-upload"));
	    Thread.sleep(3000);
	    Runtime.getRuntime().exec("C:\\Users\\rishitha\\Desktop\\nr.exe");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);

	}

}
