package week4day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book= new XSSFWorkbook("./testdata/LeadData.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(2);
		String CellValue=cell.getStringCellValue();
		//System.out.println(CellValue);
		int rowCount=sheet.getLastRowNum();
		short colCount=row.getLastCellNum();
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String StringCellValue=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(StringCellValue);
			}
		}
	}

}
