package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestUtilClass {
	
	public static Object[][] getTestData ( ) throws IOException {
		
				File file =  new File("C:\\Users\\farha\\Downloads\\dataProvider.xlsx");
				FileInputStream inputStream = new FileInputStream(file);
				XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
				XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();	
			}	
		}
		return data;

	}

}
