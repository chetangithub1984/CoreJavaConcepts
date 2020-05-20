package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelFile {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		File f = new File("C:\\Users\\Dell\\workspace\\Online_Java_Batch_1\\TestFile.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fi);

		Sheet sheet = workbook.getSheet("First Sheet");

		for (int k = 0; k < sheet.getLastRowNum() + 1; k++) {

			Row row = sheet.getRow(k);
			for (int i = 0; i < row.getLastCellNum(); i++)// i=0
			{

				Cell cell = row.getCell(i);

				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.println("---Blank Cell---");
					break;

				}

			}
		}

		// workbook.getSheetAt(0)

	}

}
