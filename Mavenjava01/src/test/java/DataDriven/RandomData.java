package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RandomData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\RandomData.xlsx");
		XSSFWorkbook Workbook= new XSSFWorkbook(); // No need  to add the file here
	    
		XSSFSheet sheet=Workbook.createSheet("Random Data");   //Data is my sheet name-- new sheet name 
	    
		//Random Data
		XSSFRow row= sheet.createRow(3);
		XSSFCell cell=row.createCell(3);

		cell.setCellValue("Welcomde");
		
		Workbook.write(file);
		Workbook.close();
		file.close();
		
		System.out.println("Random Excel file created succesfully" );
		

		}
	}

