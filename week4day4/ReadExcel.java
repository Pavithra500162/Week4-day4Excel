package week4day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public String[][] ReadData(String filename) throws IOException {
		XSSFWorkbook book= new XSSFWorkbook("./testdata/"+filename+".xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		int rowCount=sheet.getLastRowNum();
		int colCount=row.getLastCellNum();
		String[][] data=new String [rowCount][colCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String StringCellValue=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=StringCellValue;
			}
		}
		book.close();
		return data;

	}
}
