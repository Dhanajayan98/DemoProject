package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
	public static void main(String[] args) throws Throwable{
		FileInputStream fis=new FileInputStream("./Data/IPL-2023-Schedule-Excel.xlsx");	
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL 2023 Full Schedule");
	
		Row row=sheet.getRow(1);
		
		Cell cell = row.getCell(6);
		
		System.out.println(cell.getStringCellValue());
	}
}
