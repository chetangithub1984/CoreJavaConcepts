package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelFile {

	public static void main(String[] args) {

		// Create a workbook-> .xlxs
		// .xls --> HSSFWorkbook

		XSSFWorkbook workbook = new XSSFWorkbook();

		// create sheet in the workbook created at line no 15
		XSSFSheet sheet1 = workbook.createSheet("First Sheet");

		// Create row(s) in the sheet created at line no 16

		XSSFRow row1 = sheet1.createRow(0);

		// Create 1st column(cell) in row1

		XSSFCell cell1 = row1.createCell(0);
		XSSFCell cell2 = row1.createCell(1);
		XSSFCell cell3 = row1.createCell(2);

		// Insert values in each cell created

		cell1.setCellValue("Name");
		cell2.setCellValue("Email");
		cell3.setCellValue("MobileNumber");

		// Till Now everything that you have done is virtual

		File f = new File("C:\\Users\\Dell\\workspace\\Online_Java_Batch_1\\TestFile.xlsx");
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(f);// Now the file will be created at the location which you have mentioned// at lin no43
			workbook.write(fo);
			fo.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("File created ");

	}

}
