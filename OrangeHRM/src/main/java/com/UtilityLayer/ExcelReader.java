package com.UtilityLayer;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private XSSFWorkbook workbook; 
	
	public ExcelReader(String path)
	{
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getTotalRows(int index)
	{
		return workbook.getSheetAt(index).getLastRowNum() + 1;
	}
	
	public int getTotalCells(int index)
	{
		return workbook.getSheetAt(index).getRow(0).getLastCellNum();
	}
	
	public String getCellValue(int index, int row, int col)
	{
		return workbook.getSheetAt(index).getRow(row).getCell(col).getStringCellValue();
	}
}
