package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*Here justwe create a  excel file
  
 
 */
public class WriteData {
public static void main(String[] args) throws IOException {
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\secodfile.xlsx");
	XSSFWorkbook Workbook= new XSSFWorkbook(); // No need  to add the file here
    
	XSSFSheet sheet=Workbook.createSheet("FirstFile");   //Data is my sheet name-- new sheet name 
    
	  XSSFRow row1=sheet.createRow(0);
	
	  //This is for First Row
		row1.createCell(0).setCellValue("Amit");
		row1.createCell(1).setCellValue(12345);
		row1.createCell(2).setCellValue("Agile");
		
		//This is for 2nd row
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(1234);
		row2.createCell(2).setCellValue("Wipro");
		
		Workbook.write(file);
		Workbook.close();
		file.close();
		
		System.out.println("Excel file  created succesfully" );
		
		}
}



