package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTask {
	public static void main(String[] args) throws Throwable{
		FileInputStream fis=new FileInputStream("./Data/ExcelData.xlsx");	
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row=sheet.getRow(1);
		
		Cell cell = row.getCell(1);
		
		System.out.println(cell.getNumericCellValue());
	}
}
