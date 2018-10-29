package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData
{
	public static String getData(String filepath,String sheetname,int rn,int cn)
	{
		
		try 
		{
			File file=new File(filepath);
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row r = sh.getRow(rn);
			Cell c = r.getCell(cn);
			String data = c.getStringCellValue();
			return data;
		} 
		catch (Exception e) 
		{
			return "";
			
		}
	}
	public static int getRowCount(String filepath,String sheetname)
	{
		
		try 
		{
			File file=new File(filepath);
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			int rc = sh.getLastRowNum();
			return rc;
		} 
		catch (Exception e) 
		{
			return -1;
			
		}
	}
	public static int getCellCount(String filepath,String sheetname,int rn)
	{
		
		try 
		{
			File file=new File(filepath);
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row r = sh.getRow(rn);
			int cc = r.getLastCellNum();
			return cc;
		} 
		catch (Exception e) 
		{
			return 1;
			
		}
	}
}
