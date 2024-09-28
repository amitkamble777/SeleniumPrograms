package DataDriven;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Dynamicdata1.xlsx");
		XSSFWorkbook Workbook= new XSSFWorkbook(); // No need  to add the file here
	    XSSFSheet sheet=Workbook.createSheet("Dynamic Data");   //Data is my sheet name-- new sheet name 
	    //For dyanamic datawe have to use Scanner claaas
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Value");
		int row=sc.nextInt();
		System.out.println("Enter Cell Value");
		int cell=sc.nextInt();
		for(int r=0; r<=row; r++)  // for Row
		{
	XSSFRow	currentrow=sheet.createRow(r);
			for(int c=0; c<cell; c++) // For Column
			{
				
	XSSFCell cell1= currentrow.createCell(c);
	cell1.setCellValue(sc.next());  // Welcome is the Hardcode value  instead of Welcomde 
	//cell1.setCellValue(sc.next());
	// Whatever the value we provided in runtime that  will be capture by with and that will entered into the newly created cell in Excel file	
		
		Workbook.write(file);
		Workbook.close();
		file.close();
	System.out.println("Excel file  created succesfully" );
		
			}
		}
	}
}
