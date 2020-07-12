import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	
	
	public static void main(String[] args) throws IOException {
		ReusableExcel re = new ReusableExcel("C:\\Users\\rishitha\\Desktop\\Demo.xlsx","WritingData");
		System.out.println(re.getExcelData(4,2));
		/*FileInputStream fi = new FileInputStream("C:\\Users\\rishitha\\Desktop\\Demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi); 

		XSSFSheet sh =wb.getSheet("Sheet1");*/
		/*XSSFRow row = sh.getRow(2);
		XSSFCell cell = row.getCell(1);
		int value =(int) cell.getNumericCellValue();
		String value = cell.getStringCellValue();
		System.out.println(value);
		download apache poi jars files
		*/
/*		String value2 = sh.getRow(2).getCell(2).getStringCellValue();
		System.out.println(value2);
		int total_rows = sh.getLastRowNum();
		System.out.println(total_rows);
		int total_cols = sh.getRow(2).getLastCellNum();
		for(int i=0; i<=total_rows; i++){
			XSSFRow row = sh.getRow(i);
			for(int j=0; j<total_cols; j++){
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());		
				}
			
		}
		wb.close();
		fi.close();
*/
	}

}
