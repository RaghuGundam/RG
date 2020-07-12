

import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;






public class SilkuiScript extends Reusable{

	public static void main(String[] args) throws InterruptedException, FindFailed{
		// TODO Auto-generated method stub
		


				// TODO Auto-generated method stub
				
				launchbrowser();
				
			    appurl("https://www.naukri.com/");
			    Thread.sleep(3000);
			     click(By.id("wdgt-file-upload"));
			    Thread.sleep(3000);
			Screen s = new Screen();
			Pattern filePath = new Pattern("C:\\Users\\rishitha\\Desktop\\filePath.PNG");
			Pattern openBtn = new Pattern("C:\\Users\\rishitha\\Desktop\\openBtn.PNG"); 
			s.wait(filePath, 20);
			s.type(filePath, "C:\\Users\\rishitha\\Desktop\\QA Senior_JD.pdf");
			s.click(openBtn);
			

			}



}
