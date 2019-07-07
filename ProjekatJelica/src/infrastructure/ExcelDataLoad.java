package infrastructure;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataLoad {

	/* References on private fields that are used for storing objects from Excel */
	private static HSSFSheet ExcelWSheet;
	private static HSSFWorkbook ExcelWBook;
	private static HSSFCell Cell;
	private static HSSFRow Row;

	/* Parsing any data format into string */
	private static DataFormatter formatter;

	/* Method is setting Excel file and worksheet name */
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		try {
			/* Input of file that is set as Path */
			FileInputStream ExcelFile = new FileInputStream(Path);

			/* File is opening as Excel file */
			ExcelWBook = new HSSFWorkbook(ExcelFile);

			/* Getting worksheet from Excel file */
			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			/* Initialization of dataformatter object */
			formatter = new DataFormatter();
		} catch (Exception ex) {
			throw (ex);
		}

	}

	/* Getting data from Excel table for desired row and column */
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {

			/* Getting the cell - first getting desired row and then desired column */
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			/* Cell info is parsing into string */
			String CellData = formatter.formatCellValue(Cell);
			/* String CellData = Cell.getStringCellValue(); */
			return CellData;
		} catch (Exception ex) {
			return "";
		}

	}

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		try {

			/* Getting the row where data has to be written */
			Row = ExcelWSheet.getRow(RowNum);

			/* Getting the cell where data has to be written */
			Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);

			/* If cell doesn`t exist or is empty */
			if (Cell == null) {
				/* Its created on desired place */
				Cell = Row.createCell(ColNum);

				/* Setting the value into the cell */
				Cell.setCellValue(Result);
			} else {

				/* In case that data exists, value is anyway set over the old one (overwrite) */
				Cell.setCellValue(Result);
			}
			/* Writing changes into Excel file */
			FileOutputStream fileOut = new FileOutputStream(Configuration.fileLocation + Configuration.fileName);
			ExcelWBook.write(fileOut);

			/* Emptying data inside file */
			fileOut.flush();

			/* Closing exit stream to the file */
			fileOut.close();
		} catch (Exception ex) {
			throw (ex);

		}

	}

	/* Returning reference to the worksheet */
	public static HSSFSheet getWorkSheet() {
		return ExcelWSheet;
	}

}
