package com.learn.Frmawork.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxml4j.opc.Package;

public class Excelldataprovider
{
	XSSFWorkbook wb;
	public Excelldataprovider() 
	{
		File src= new File("./Test_Data/Test_Data.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			
			wb= new XSSFWorkbook();
		} catch (Exception e) {
			System.out.println("Unable to read excell file" + e.getMessage());
		}
		
	}
	public String getStringdata(int Sheetindex,int row,int coloum) {
		return wb.getSheetAt(Sheetindex).getRow(0).getCell(0).getStringCellValue();
	}
	public String getStringdata(String Sheetname,int row,int coloum) {
		return wb.getSheet("").getRow(0).getCell(0).getStringCellValue();
	}
public double getnumdata(String Sheetname,int row,int coloum)
{
	return wb.getSheet("").getRow(0).getCell(0).getNumericCellValue();
}

}
