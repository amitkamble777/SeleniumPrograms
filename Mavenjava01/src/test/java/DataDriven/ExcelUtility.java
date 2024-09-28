package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
     
	public static FileInputStream fi;
	public static FileOutputStream  fo;
	public static  XSSFWorkbook wb;
	public static  XSSFSheet sheet;
	public static  XSSFRow row;
	public static  XSSFCell cell;
	public static  CellStyle cellstyle;
	
	
	/*This is a first  method GetRowCount
	
	How will organize all files and folders in framework-- is known as framework
	utility file, reports, configuration file, test data, screenshot
	We organize all the file in different manner is called as framework 
	 
Parameter  String xfile---it is a filename --Excel  file

String xsheet-- it is s sheet name in that excel file

Static methodwe no need to create any object  to access this method -- 
We can directly access to this method

*/
	public static int getRowCount(String xfile, String xsheet) throws IOException
	{
		fi=new FileInputStream(xfile);
		wb=new XSSFWorkbook(fi);
		sheet= wb.getSheet(xsheet);
		int rowcount=sheet.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount; //return type is integer because rowCount will be a integer
	}
	
	
	/*This is a Second method GetCellCount
	For cellcount we can pass the Three parameter   3rd is the a rownum
	Which row we hve to fine the no of cell thats why we pass the row number in parameter
	
	*/
	public static int getCellCunt(String xfile, String xsheet , int rownum) throws IOException
	{
		fi=new FileInputStream(xfile);
		wb=new XSSFWorkbook(fi);
		sheet= wb.getSheet(xsheet);
		row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	/* For getCellData we hae to pass the 4 paramaeters 
	 file, sheet, rownum, column
	 4 parameter we need to pass then it will Return the data
	 
	if we want to read multiple data -- means  pass this method in looop 
	 
	*/
public static String getCellData(String xfile, String xsheet , int rownum, int column) throws IOException
	{
		fi=new FileInputStream(xfile);
		wb=new XSSFWorkbook(fi);
		sheet= wb.getSheet(xsheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(column);  // from this cell we need to reed the particular date
//		wb.close();
//		fi.close();
	//return column;
    String data;  // This command is use to read the data from Excel sheet
try
{
	
//Both are  reading the data in same format data=Cell.toString and DaaFormatter Method
//data= cell.toString()   // this is optional
DataFormatter format= new DataFormatter();   // this method is provided by appache POI
data=format.formatCellValue(cell); //Returns the formatted value of a cell as a string regardless of the cell type
	
	/*Formatter method will returns the value in string fomat -- ultimately character, numeric all data return in the string format
	Loopingstatement wwill not execute empty 
	
	It will read the data from the empty Cell also
	
	Data not available in cell then  it will through ans ome exception --
	
	for this error we have to take a String variable 
	*/
	}
catch(Exception e)
{
	data= " ";  // dont have valuesin particular cell then it will be null
}
	wb.close();
	fi.close();
	return data;
}

/*We have to pass the 5 parameter 
 file , sheet, row, column , data
 
 setCellData-- here writing the data into the cell
 
 Both we are doing parallel reading and writting for that reason we used this method 
 Here we are not creating any new row, here it will taking the existing row
Reading the data from the same row and update the result in the cell
*/

public void setCellData(String xfile, String xsheet, int rownum, int column, String data) throws IOException
{
	fi=new FileInputStream(xfile); // Along with file workbook will be created
	wb=new XSSFWorkbook(fi);   // extract the file
	sheet= wb.getSheet(xsheet); //Extract the Sheet 
	row=sheet.getRow(rownum);   // Extract the Rownum
	
	cell=row.createCell(column);  //Extract the column
	cell.setCellValue(data);
	fo= new FileOutputStream(xfile);
	wb.write(fo);
	wb.close();
	fi.close();
	fo.close();
}








}