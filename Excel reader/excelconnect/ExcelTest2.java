package excelconnect;

import java.io.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelTest2 {
	
	private static Workbook wb;
	private static Sheet sh;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Row row;
	private static Cell cell;	

	public static void main(String[] args) throws Exception {
		
		fis = new FileInputStream("./TestPO.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet1");
		
		int noOfRows = sh.getLastRowNum();
				
		System.out.println("Number of rows in this excel file: " + noOfRows + "\n");
		
		System.out.println(String.format("%-15s", sh.getRow(0).getCell(0))  
		+ String.format("%-15s", sh.getRow(0).getCell(1)) 
		+ String.format("%-22s", sh.getRow(0).getCell(2)) 
		+ String.format("%-1s", sh.getRow(0).getCell(3)));
		System.out.println("---------------------------------------------------------------------------");
		
		for(int i = 1; i <= noOfRows; i++) {		
			
			System.out.println(String.format("%-15s", sh.getRow(i).getCell(0))  
			+ String.format("%-15s", sh.getRow(i).getCell(1)) 
			+ String.format("%-22s", sh.getRow(i).getCell(2)) 
			+ String.format("%-1s", sh.getRow(i).getCell(3)));
			

		}		
		System.out.println("\ndone");
	}
}
