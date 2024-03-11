package Utilities;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelUtils {
	public static String[] readExcelData(String sheetName,int row) throws IOException
	{ 
        String Path = "C:\\Users\\2303924\\eclipse-workspace\\Hackathon\\Excel\\Book2.xlsx";
        FileInputStream file = new FileInputStream(Path);
		@SuppressWarnings("resource")
		XSSFWorkbook workBook = new XSSFWorkbook(file);
        XSSFSheet workSheet = workBook.getSheet(sheetName); 
        int cellNo = workSheet.getRow(0).getLastCellNum();
        String cellValue[] = new String[cellNo];
        XSSFRow cRow = workSheet.getRow(row);
	        for(int c=0; c<cellNo; c++)
	        {
	        	//DataFormatter format=new DataFormatter();
	        	//cellValue[c] = String.valueOf(cRow.getCell(c));
	        	//cellValue[c] = format.formatCellValue(cRow.getCell(c));
	        	DataFormatter format=new DataFormatter();
				XSSFCell cell=cRow.getCell(c);
				cellValue[c]=format.formatCellValue(cell);
	        }
		return cellValue;
	}
	
public static void writeExcelData(String sheetName, int rownum, int colnum, String data) throws IOException {
		
		//Opening the excel file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Excel\\Book2.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file); 
		
		//Creating the sheet
		if(book.getSheetIndex(sheetName)==-1) {
		book.createSheet(sheetName);              
		}
		
		XSSFSheet sheet=book.getSheet(sheetName);
		if(sheet.getRow(rownum)==null)
		sheet.createRow(rownum);
		XSSFRow row =sheet.getRow(rownum);   
		
		// Creating cell
		XSSFCell cell=row.createCell(colnum); 
		
		//Setting the data in the column
		cell.setCellValue(data); 
		
		// Writing the data by fileOutput
		FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"\\Excel\\Book2.xlsx");
		book.write(fo);
		book.close();
		file.close();
		fo.close();
}
 
}