import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Users\\rishitha\\Desktop\\Demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		int sheetCount = wb.getNumberOfSheets();
		boolean value = false;
		for(int i =0; i < sheetCount; i++){
			//System.out.println(wb.getSheetName(i));
			if(wb.getSheetName(i).equalsIgnoreCase("WritingData")){
				value = true;
				break;
			}
				
		}

		
		if(value){
			wb.getSheet("WritingData");
		}else{
			
			wb.createSheet("WritingData");	
		}
		FileOutputStream fo = new FileOutputStream("C:\\Users\\rishitha\\Desktop\\Demo.xlsx");
		wb.write(fo);
		wb.close();
		fi.close();

	}

}
