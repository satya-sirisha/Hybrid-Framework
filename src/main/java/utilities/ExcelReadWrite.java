package utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantvalues.ConstantClassValues;


public class ExcelReadWrite {
	
	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFRow rowNumber;
	static XSSFCell cellObject;
	
	public static void excelPath(String pathName) throws IOException{
		File f = new File(pathName);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}
	
	public static String readValues_Excel(String sheetName, int row, int col){
		ws = wb.getSheet(sheetName);
		cellObject = ws.getRow(row).getCell(col);

		if (cellObject.getCellType() == cellObject.CELL_TYPE_NUMERIC) {
			String intValues = NumberToTextConverter.toText(cellObject.getNumericCellValue());
			return intValues;
		} else {
			String cellValue = cellObject.getStringCellValue();
			return cellValue;
		}
	}

	public static void writeValues_Excel(String sheetName, int row, int col, String testData) throws Exception{
		ws = wb.getSheet(sheetName);
		cellObject = ws.getRow(row).getCell(col);
		cellObject.setCellValue(testData);
		FileOutputStream fos = new FileOutputStream(new File(ConstantClassValues.excelPath));
		wb.write(fos);
		wb.close();
		wb = new XSSFWorkbook(new FileInputStream(ConstantClassValues.excelPath));
	}

}
