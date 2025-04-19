package dsAlgo_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {


	// public static String getCellValue(String SheetName) throws IOException { ->
	// getCellValue("Register") or getCellValue("Login")


	public static String getusernameregister() throws IOException {
		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("Register");// get in to sheet // XSSFSheet sheet =
															// workbook.getSheet(SheetName);
			Row newRow = sheet.getRow(1);// row we want to write
			Cell newCell = newRow.getCell(0);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getusernameregister:" + currentcell);
		}
		return currentcell;
	}

	public static String getpasswordregister() throws IOException {
		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("Register");// get in to sheet
			Row newRow = sheet.getRow(1);// row we want to write
			Cell newCell = newRow.getCell(2);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getpasswordregister" + currentcell);
		}
		return currentcell;
	}

	public static String getconfirmpasswordregister() throws IOException {

		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("Register");// get in to sheet
			Row newRow = sheet.getRow(1);// row we want to write
			Cell newCell = newRow.getCell(2);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getconfirmpasswordregister" + currentcell);
		}
		return currentcell;
	}

	public static String getvalidusername() throws IOException {

		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("Login");// get in to sheet
			Row newRow = sheet.getRow(1);// row we want to write
			Cell newCell = newRow.getCell(0);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getvalidusername" + currentcell);
		}
		return currentcell;
	}

	public static String getvalidpassword() throws IOException {

		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("Login");// get in to sheet
			Row newRow = sheet.getRow(1);// row we want to write
			Cell newCell = newRow.getCell(1);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getvalidpassword" + currentcell);
		}
		return currentcell;
	}

	public static String getinvalidusername() throws IOException {

		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("Login");// get in to sheet
			Row newRow = sheet.getRow(2);// row we want to write
			Cell newCell = newRow.getCell(0);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getinvalidusername" + currentcell);
		}
		return currentcell;
	}

	public static String getinvalidpassword() throws IOException {

		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("Login");// get in to sheet
			Row newRow = sheet.getRow(2);// row we want to write
			Cell newCell = newRow.getCell(1);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getinvalidpassword" + currentcell);
		}
		return currentcell;
	}

	public static String getvalidpythoncode() throws IOException {

		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("pythonCode");// get in to sheet
			Row newRow = sheet.getRow(1);// row we want to write
			Cell newCell = newRow.getCell(0);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getvalidpythoncode" + currentcell);
		}
		return currentcell;
	}

	public static String getinvalidpythoncode() throws IOException {

		String currentcell = null;
		String path = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
		File excelFile = new File(path);// give path of file
		FileInputStream Fis = null;
		Fis = new FileInputStream(excelFile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(Fis)) {
			XSSFSheet sheet = workbook.getSheet("pythonCode");// get in to sheet
			Row newRow = sheet.getRow(2);// row we want to write
			Cell newCell = newRow.getCell(0);// in which we want to write
			currentcell = newCell.getStringCellValue();
			System.out.println("getinvalidpythoncode" + currentcell);
		}
		return currentcell;
	}
}
