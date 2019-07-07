package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import POM.RegistrationPage;
import infrastructure.*;

public class RegistrationTest {

	//Method for inserting data manually into the registration form
	public static void keyboardInsert(WebDriver driver) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		// Inserting the first name 
		RegistrationPage.clickFirstNametxt(driver);
		System.out.println("Insert the First Name value:");
		String FirstName = scanner.nextLine();
		RegistrationPage.setFirstNametxt(driver, FirstName);
		// Inserting the last name
		RegistrationPage.clickLastNametxt(driver);
		System.out.println("Insert the Last Name value:");
		String LastName = scanner.nextLine();
		RegistrationPage.setLastNametxt(driver, LastName);
		// Inserting the username 
		RegistrationPage.clickUsernametxt(driver);
		System.out.println("Insert the Username value:");
		String Username = scanner.nextLine();
		RegistrationPage.setUsernametxt(driver, Username);
		// Inserting the email
		RegistrationPage.clickEmailtxt(driver);
		System.out.println("insert the Email value:");
		String Email = scanner.nextLine();
		RegistrationPage.setEmailtxt(driver, Email);
		// Inserting the password
		RegistrationPage.clickPasswordtxt(driver);
		System.out.println("Insert the Password value:");
		String Password = scanner.nextLine();
		RegistrationPage.setPasswordtxt(driver, Password);
		// Clicking the confirm button
		RegistrationPage.clickRegisterbtn(driver);
		scanner.close();
	}

	//Method for inserting data from file into the registration form
	public static void insertDataFromFile(WebDriver driver) throws Exception {
		String red;
		ExcelDataLoad.setExcelFile(Configuration.fileLocation + Configuration.fileName, Configuration.sheetName1);
		for (int i = 1; i < ExcelDataLoad.getWorkSheet().getLastRowNum(); i++) {
			//Locate the first name element
			RegistrationPage.clickFirstNametxt(driver);
			//Read and insert the value into the located element
			red = ExcelDataLoad.getCellData(i, 0);
			RegistrationPage.setFirstNametxt(driver, red);
			//Locate the last name element
			RegistrationPage.clickLastNametxt(driver);
			//Read and insert the value into the located element
			red = ExcelDataLoad.getCellData(i, 1);
			RegistrationPage.setLastNametxt(driver, red);
			//Locate the username element
			RegistrationPage.clickUsernametxt(driver);
			//Read and insert the value into the located element
			red = ExcelDataLoad.getCellData(i, 2);
			RegistrationPage.setUsernametxt(driver, red);
			//Locate the email element
			RegistrationPage.clickEmailtxt(driver);
			//Read and insert the value into the located element
			red = ExcelDataLoad.getCellData(i, 3);
			RegistrationPage.setEmailtxt(driver, red);
			//Locate the password element
			RegistrationPage.clickPasswordtxt(driver);
			//Read and insert the value into the located element
			red = ExcelDataLoad.getCellData(i, 4);
			RegistrationPage.setPasswordtxt(driver, red);
			//Locate the button element and click it
			RegistrationPage.clickRegisterbtn(driver);
		}
	}
}
