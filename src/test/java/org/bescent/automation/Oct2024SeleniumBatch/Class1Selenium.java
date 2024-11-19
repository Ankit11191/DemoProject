package org.bescent.automation.Oct2024SeleniumBatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class1Selenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		Workbook wb = new XSSFWorkbook(new FileInputStream("./test1.xlsx"));
		Sheet sheet = wb.getSheet("mySampleSheet");

		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell next = cellIterator.next();

				if (next.getCellType() == CellType.STRING) {
					System.out.println(next.getStringCellValue());
				} else if (next.getCellType() == CellType.NUMERIC) {
					System.out.println(next.getNumericCellValue());
				} else if (next.getCellType() == CellType.BOOLEAN) {
					System.out.println(next.getBooleanCellValue());
				} else if(next.getCellType() == CellType.FORMULA){
					System.out.println(next.getCellFormula());
				}

			}
		}
		wb.close();
	}
}
