package tests;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import POM.LoginPage;
import infrastructure.*;

public class LoginPageTest {

	//Method for inserting data manually into the login form
	public static void keyboardInsert(WebDriver driver) throws Exception {
		Scanner scanner = new Scanner(System.in);

		LoginPage.clickUsernametxt(driver);
		System.out.println("Insert the Username:");
		String Username = scanner.nextLine();
		LoginPage.setUsernametxt(driver, Username);

		LoginPage.clickPasswordtxt(driver);
		System.out.println("Insert the Password:");
		String Password = scanner.nextLine();
		LoginPage.setPasswordtxt(driver, Password);

		LoginPage.clickLoginbtn(driver);
		LoginPage.clickLogoutbtn(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		scanner.close();
	}
	//Method for inserting data from file into the login form
	public static void insertDataFromFile(WebDriver driver) throws Exception {
		String red;
		ExcelDataLoad.setExcelFile(Configuration.fileLocation + Configuration.fileName, Configuration.sheetName1);

		for (int i = 1; i < ExcelDataLoad.getWorkSheet().getLastRowNum(); i++) {
			LoginPage.clickUsernametxt(driver);
			red = ExcelDataLoad.getCellData(i, 2);
			LoginPage.setUsernametxt(driver, red);

			LoginPage.clickPasswordtxt(driver);
			red = ExcelDataLoad.getCellData(i, 4);
			LoginPage.setPasswordtxt(driver, red);

			LoginPage.clickLoginbtn(driver);

			LoginPage.clickLogoutbtn(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}

}
