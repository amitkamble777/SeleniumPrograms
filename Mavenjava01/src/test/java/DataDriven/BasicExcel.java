package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BasicExcel {

	static String excelreportpath = "E:\\Slenium 2024-03\\Mavenjava01\\TestData\\Exceldata.xlsx";
	
	public static void main(String[] args) throws IOException {
		//public void excelpass(int row,String Expected,String actual) throws IOException {
		File f = new File(excelreportpath);
		FileInputStream fis =  new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		FileOutputStream fos= new FileOutputStream(f);
		Date Expected = null;
		wb.getSheetAt(0).getRow(2).getCell(6).setCellValue(Expected);
		Date actual = null;
		wb.getSheetAt(0).getRow(2).getCell(7).setCellValue(actual);
		wb.getSheetAt(0).getRow(2).getCell(8).setCellValue("Pass");
		wb.getSheetAt(0).getRow(2).createCell(9);
		fis.close();
		wb.write(fos);
		fos.close();
		wb.close();
		System.out.println("Passed");
	}
	public void excelfail(int row,String Expected,String actual,Exception e) throws IOException {	
	File f = new File(excelreportpath);
	FileInputStream fis =  new FileInputStream(f);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	FileOutputStream fos= new FileOutputStream(f);
	wb.getSheetAt(0).getRow(row).getCell(6).setCellValue(Expected);
	wb.getSheetAt(0).getRow(row).getCell(7).setCellValue(actual);
	wb.getSheetAt(0).getRow(row).getCell(8).setCellValue("Fail");
	String message = e.getMessage();
	wb.getSheetAt(0).getRow(row).getCell(9).setCellValue(message);
	wb.write(fos);
	wb.close();
	}

	}


