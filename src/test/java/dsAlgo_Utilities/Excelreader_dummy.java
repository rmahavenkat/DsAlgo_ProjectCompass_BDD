package dsAlgo_Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader_dummy {

	public Object[][] getData(String filePath, String sheetName) throws IOException{
    	String excelfilepath = System.getProperty("user.dir") + "/src/test/resources/Exceldata.xlsx";
    	    	FileInputStream fis = new FileInputStream(excelfilepath);
        		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new RuntimeException("Sheet " + sheetName + " not found");
            }
            Row headerRow = sheet.getRow(0);
            int rowcount=sheet.getLastRowNum();
            int colcount = headerRow.getLastCellNum();
        Object[][] data=new Object[rowcount][rowcount];
        for (int r = 1; r < rowcount; r++) {
                XSSFRow row = sheet.getRow(r);
                
                for (int c = 0; c < colcount; c++) {
                    XSSFCell cell = row.getCell(c);
                    CellType celltype=cell.getCellType();
                    switch (celltype) {
            		case STRING:
            			data[r][c] = cell.getStringCellValue();
            			break;
            		case NUMERIC:
            			data[r][c] =Integer.toString((int) cell.getNumericCellValue());
            			break;
            		case BOOLEAN:
            			data[r][c] =String.valueOf(cell.getBooleanCellValue());
            			break;
            		
                }

	}
}
        return data;	
}
}
