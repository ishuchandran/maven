package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	
	private static void write_Sheet() throws Throwable {
		
		File f = new File("C:\\Users\\User\\Desktop\\Maven\\Document1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet createsheet = w.createSheet("Details");
		
		Row createrow = createsheet.createRow(0);
		
		Cell cell = createrow.createCell(0);
		
		cell.setCellValue("username");
		
		w.getSheet("Details").getRow(0).createCell(1).setCellValue("Password");
		
		w.getSheet("Details").createRow(1).createCell(0).setCellValue("ishu");
		
		w.getSheet("Details").getRow(1).createCell(1).setCellValue("123");
		
		w.getSheet("Details").createRow(2).createCell(0).setCellValue("sheela");
		
		w.getSheet("Details").getRow(2).createCell(1).setCellValue("456");
		
		w.getSheet("Details").createRow(3).createCell(0).setCellValue("chitra");
		
		w.getSheet("Details").getRow(3).createCell(1).setCellValue("789");
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
	}
	public static void main(String[] args) throws Throwable {
		
	
		write_Sheet();
				
	}	

	}
	

