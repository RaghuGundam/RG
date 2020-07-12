import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReusableExcel {
	static FileInputStream fi;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	ReusableExcel(String excelpath, String sheetname) throws IOException{
		try{
	 fi = new FileInputStream(excelpath);
	 wb = new XSSFWorkbook(fi); 

	 sh =wb.getSheet(sheetname);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	
	static String getExcelData(int row, int col){
		String value = null;
		try{
		 value = sh.getRow(row).getCell(col).getStringCellValue();
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
}
