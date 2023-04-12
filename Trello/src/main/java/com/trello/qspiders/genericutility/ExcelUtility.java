package com.trello.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is responsible for reading the test case specific data from excel sheet
 * @author QCSE6
 *
 */
public class ExcelUtility {
/**
 * this method is responsible to read the String Data from the excel sheet.
 * DataDrivenTesting reusable method 
 * @author QCSE6
 * @param filepath
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @return StringCellValue
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String readStringDataFromExcel(String filepath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(filepath);
		Workbook workBook = WorkbookFactory.create(fis);
		String cellValue = workBook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		workBook.close();
		return cellValue;
	}
/**
 * This is the reusable method to read the numeric cell data in double form.
 * @author QCSE6
 * @param filePath
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @return numericCellData 
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public double readNumericFromExcel(String filePath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workBook = WorkbookFactory.create(fis);
		double numericCellValue = workBook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		workBook.close();
		return numericCellValue;
	}
}
