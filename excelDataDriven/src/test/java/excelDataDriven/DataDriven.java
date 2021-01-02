package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	static String path = "../excelDataDriven/src/test/resources/test.xlsx";

	public static List<String> getData(String sheetName, String nameColumnWithNameTestcases, 
			String testcasesName) throws IOException {
		
		List<String> list = new ArrayList<>();
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				XSSFSheet xssfSheet = workbook.getSheetAt(i);
				int position = findThePositionTestCasesWithName(xssfSheet, nameColumnWithNameTestcases);
				list = findTheAllCellByRowWithName(xssfSheet, testcasesName, position);
			}
		}
		return list;

	}

	public static int findThePositionTestCasesWithName(XSSFSheet xssfSheet, String name) {
		int k = 0;
		for (Row rows : xssfSheet) {
			for (Cell cell : rows) {
				if (cell.getStringCellValue().equalsIgnoreCase(name)) {
					return k;
				}
				k++;
			}
		}
		throw new RuntimeException();
	}

	public static List<String> findTheAllCellByRowWithName(XSSFSheet xssfSheet, String name, int position) {
		List<String> cellList = new ArrayList<>();
		for (Row row : xssfSheet) {
			if (row.getCell(position).getStringCellValue().equalsIgnoreCase(name)) {
				for (Cell cell : row) {
					if(cell.getCellTypeEnum()==CellType.STRING) {
						cellList.add(cell.getStringCellValue());
					}else {
						cellList.add(""+cell.getNumericCellValue());
					}
				}
			}
		}
		return cellList;
	}
}
