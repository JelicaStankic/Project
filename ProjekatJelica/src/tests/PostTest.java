package tests;

import java.util.Scanner;

import org.openqa.selenium.*;

import POM.PostPage;
import infrastructure.*;

public class PostTest {
	
	//Method for inserting data from file into the post form
	public static void insertDataFromFile(WebDriver driver) throws Exception {
		String red;
		ExcelDataLoad.setExcelFile(Configuration.fileLocation + Configuration.fileName, Configuration.sheetName2);

		PostPage.clickCreatePostbtn(driver);

		for (int i = 1; i < ExcelDataLoad.getWorkSheet().getLastRowNum(); i++) {

			PostPage.clickNazivtxt(driver);
			red = ExcelDataLoad.getCellData(i, 1);
			PostPage.setNazivtxt(driver, red);

			PostPage.clickLokacijatxt(driver);
			red = ExcelDataLoad.getCellData(i, 2);
			PostPage.setLokacijatxt(driver, red);

			PostPage.clickOpistxt(driver);
			red = ExcelDataLoad.getCellData(i, 0);
			PostPage.setOpistxt(driver, red);
			
			//clear the values so that values from next row can be inserted
			PostPage.getNazivtxt(driver).clear();;
			PostPage.getLokacijatxt(driver).clear();;
			PostPage.getOpistxt(driver).clear();;
			
			PostPage.clickObjavibtn(driver);

		}
	}
	//Method for inserting data manually into the post form
	public static void keyboardInsert(WebDriver driver) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PostPage.clickCreatePostbtn(driver);

		PostPage.clickNazivtxt(driver);
		System.out.println("insert the post name");
		String name = scanner.nextLine();
		PostPage.setNazivtxt(driver, name);

		PostPage.clickLokacijatxt(driver);
		System.out.println("Insert the location");
		String location = scanner.nextLine();
		PostPage.setLokacijatxt(driver, location);

		PostPage.clickOpistxt(driver);
		System.out.println("Insert the description");
		String description = scanner.nextLine();
		PostPage.setOpistxt(driver, description);

		PostPage.clickObjavibtn(driver);
		scanner.close();
	}

}
