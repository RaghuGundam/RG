import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableDemo extends Reusable {

	public static void main(String[] args) throws IOException, InterruptedException {
		//FileOutputStream fo;
		XSSFSheet sh;
		FileInputStream fid = new FileInputStream(System.getProperty("user.dir")+"\\configuration.properties");
		//System.out.println(fi.toString());
		Properties prop = new Properties();
		prop.load(fid);
		launchbrowser();
	    appurl(prop.getProperty("appurl1"));
	    fid.close();
		
		FileInputStream fi = new FileInputStream("C:\\Users\\rishitha\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
	    sh = wb.getSheet("Sheet1");

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//launchbrowser();
		//appurl("https://money.rediff.com/gainers/bsc/dailygroupa?");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement header = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead"));
		List<WebElement> head = header.findElements(By.tagName("tr"));
		List<WebElement> no_heads = head.get(0).findElements(By.tagName("th"));
		for(int cols =0; cols < no_heads.size(); cols++){
		   String headcol1 = no_heads.get(cols).getText();
		 //  System.out.println(headcol1);
		}
		
		WebElement sharetable = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		List<WebElement> no_of_rows = sharetable.findElements(By.tagName("tr"));
		
		//for(int row = 0; row < no_of_rows.size(); row++){
		
		for(int row = 0; row < 3; row++){
			List<WebElement> no_of_cols = no_of_rows.get(row).findElements(By.tagName("td"));
			for(int col =0; col<no_of_cols.size();col++){
				
				String txt = no_of_cols.get(col).getText();
				System.out.println(txt);
				sh.createRow(row).createCell(col).setCellValue(txt);
				
			
			} 
			
		}
		FileOutputStream fo = new FileOutputStream("C:\\Users\\rishitha\\Desktop\\Book1.xlsx");
		wb.write(fo);
		wb.close();
		fo.close();
	    //fid.close();
	    fi.close();
	    driver.close();
	}

}
