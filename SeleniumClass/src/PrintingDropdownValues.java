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

public class PrintingDropdownValues extends Reusable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Users\\rishitha\\Desktop\\Demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("WritingData");
		FileInputStream fid = new FileInputStream(System.getProperty("user.dir")+"\\configuration.properties");
		//System.out.println(fi.toString());
		Properties prop = new Properties();
		prop.load(fid);
		launchbrowser();
	    appurl(prop.getProperty("appurl"));
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement sp = driver.findElement(By.id("c0"));
	    List<WebElement> dropdownvalues = sp.findElements(By.tagName("option"));
	    System.out.println(dropdownvalues.size());
	    for(int i=0;i<dropdownvalues.size();i++){
	    	String text =dropdownvalues.get(i).getText();
	    	sh.createRow(i).createCell(6).setCellValue(text);

			
	    }
    	FileOutputStream fo = new FileOutputStream("C:\\Users\\rishitha\\Desktop\\Demo.xlsx");
		wb.write(fo);
	    wb.close();
	    driver.close();
	    
	    fo.close();
	    fid.close();
		fi.close();
	}

}
