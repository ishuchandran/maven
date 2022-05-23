package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {

	private static void read_All_Data() throws Throwable {

		System.out.println("******All DAta********");

		File f = new File("C:\\Users\\User\\Desktop\\Maven\\Document1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet SheetAt = w.getSheetAt(0);

		int numberOfRows = SheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {
			Row row = SheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType celltype = cell.getCellType();
				if (celltype.equals(celltype.STRING)) {

					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (celltype.equals(celltype.NUMERIC)) {

					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);
				}
			}
		}
	}

	public static void read_Particular_Data() throws Throwable {
		File f = new File("C:\\Users\\User\\Desktop\\Maven\\Document1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet SheetAt = w.getSheetAt(0);
		
		Row row = SheetAt.getRow(3);
		
		Cell cell = row.getCell(5);

		CellType celltype = cell.getCellType();
		if (celltype.equals(celltype.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		} else if (celltype.equals(celltype.NUMERIC)) {

			double value = cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);
		}

	}

	public static void main(String[] args) throws Throwable {

		read_All_Data();
		read_Particular_Data();

	}
}
