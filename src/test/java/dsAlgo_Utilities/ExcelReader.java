package dsAlgo_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static final String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";

	public static String getCellValue(String sheetName, int rowNum, int colNum) throws IOException {
		try (FileInputStream fis = new FileInputStream(new File(path)); 
				XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

			XSSFSheet sheet = workbook.getSheet(sheetName);
			if (sheet == null) {
				throw new IllegalArgumentException("Sheet " + sheetName + " not found.");
			}
			Row row = sheet.getRow(rowNum);
			if (row == null) {
				throw new IllegalArgumentException("Row " + rowNum + " not found in sheet " + sheetName);
			}
			Cell cell = row.getCell(colNum);
			if (cell == null) {
				throw new IllegalArgumentException("Cell at column " + colNum + " not found in row " + rowNum);
			}
			return cell.toString(); // Handles different types (String, Numeric, Boolean)
		}
	}

	public static String getusernameregister() throws IOException {
		return getCellValue("Register", 1, 0);
	}

	public static String getpasswordregister() throws IOException {
		return getCellValue("Register", 1, 1);
	}

	public static String getconfirmpasswordregister() throws IOException {
		return getCellValue("Register", 1, 2);
	}

	public static String getvalidusername() throws IOException {
		return getCellValue("Login", 1, 0);
	}

	public static String getvalidpassword() throws IOException {
		return getCellValue("Login", 1, 1);
	}

	public static String getinvalidusername() throws IOException {
		return getCellValue("Login", 2, 0);
	}

	public static String getinvalidpassword() throws IOException {
		return getCellValue("Login", 2, 1);
	}

	public static String getvalidpythoncode() throws IOException {
		return getCellValue("pythonCode", 1, 0);
	}

	public static String getinvalidpythoncode() throws IOException {
		return getCellValue("pythonCode", 2, 0);
	}
}
