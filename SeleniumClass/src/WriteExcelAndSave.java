import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelAndSave {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Users\\rishitha\\Desktop\\Demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("WritingData");
		sh.createRow(6).createCell(3).setCellValue("Raghu Ramireddy Gundam");
		/*XSSFRow row = sh.createRow(4);
		XSSFCell cell = row.createCell(2);
		cell.setCellValue("Welcome to human world");*/
		FileOutputStream fo = new FileOutputStream("C:\\Users\\rishitha\\Desktop\\Demo.xlsx");
		wb.write(fo);
		wb.close();
		fi.close();

	}

}
