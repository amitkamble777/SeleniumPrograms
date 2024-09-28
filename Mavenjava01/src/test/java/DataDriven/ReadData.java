package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
public static void main(String[] args) throws IOException {

//csv file is not Supported in data driven testing	
	
FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Exceldata.xlsx");
XSSFWorkbook workbook= new XSSFWorkbook(file); 
XSSFSheet Sheet=workbook.getSheet("Sheet1");
    
    int totalRow=Sheet.getLastRowNum();
   int totalcell=Sheet.getRow(1).getLastCellNum();
   
   
   System.out.println("Total Number Of Row:" +totalRow);
   System.out.println("Total Number Of Cell:" +totalcell);
   
   
for(int r=0; r<=totalRow; r++)
   {
XSSFRow CurrentRow=Sheet.getRow(r);	   
	   
	   for(int c=0; c<totalcell; c++)
	   {
	XSSFCell cell=CurrentRow.getCell(c);  
 System.out.println(cell.toString()+ "\t"); // Print the data in one line 
	
 
// toString --> this is a common method which wil; read all the  data in string format 
 //Excel also having datypes
	//System.out.print(cell.toString());
	   }
	  System.out.println();
   }
   workbook.close();
   file.close();
   }
	
}

