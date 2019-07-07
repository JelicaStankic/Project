package run;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import POM.LoginPage;
import POM.PostPage;
import POM.RegistrationPage;
import tests.LoginPageTest;
import tests.PostTest;
import tests.RegistrationTest;

public class Runner {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome driver instantiated");
		driver.manage().window().maximize();
		//Selection from console
		System.out.println("Please select the test");
		System.out.println("1 - Run Registration Test");
		System.out.println("2 - Run Registartion Test With File Data");
		System.out.println("3 - Run Login Test");
		System.out.println("4 - Run Login Test With File Data");
		System.out.println("5 - Run Post Creating Test");
		System.out.println("6 - Run Post Creating Test From File");
		System.out.println("7 - Run Delete Post");
		System.out.println("8 - Edit Post");
		Scanner scanner = new Scanner(System.in);
		/* Catching the run choice */
		int izbor = scanner.nextInt();
		boolean okidac = false;
		while (!okidac) {
			switch (izbor) {
			case 1:		
				//Zadatak 1.1
				//Opening the site home page
				RegistrationPage.openSite(driver);
				//Executing the test by entering the required values manually
				RegistrationTest.keyboardInsert(driver);
				okidac = true;
				break;
			case 2:
				//Zadatak 1.2
				RegistrationPage.openSite(driver);
				RegistrationTest.insertDataFromFile(driver);
				okidac = true;
				break;
			case 3:
				//Zadatak 2.1
				RegistrationPage.openSite(driver);
				LoginPageTest.keyboardInsert(driver);
				okidac = true;
				break;
			case 4:
				//Zadatak 2.2 
				RegistrationPage.openSite(driver);
				LoginPageTest.insertDataFromFile(driver); 
				okidac = true;
				break;
			case 5:
				//Zadatak 3.1
				RegistrationPage.openSite(driver);
				LoginPage.setUsernametxt(driver, "123");
				LoginPage.setPasswordtxt(driver, "123");
				LoginPage.getLoginbtn(driver).click();
				PostTest.keyboardInsert(driver);
				okidac = true;
				break;
			case 6:
				//Zadatak 3.2
				RegistrationPage.openSite(driver);
				LoginPage.setUsernametxt(driver, "123");
				LoginPage.setPasswordtxt(driver, "123");
				LoginPage.getLoginbtn(driver).click();
				PostTest.insertDataFromFile(driver);
				okidac = true;
				break;
			case 7:
			    // Zadatak 4.1
				//Please create one post manually in order to run the automated deletion
				RegistrationPage.openSite(driver);
				LoginPage.setUsernametxt(driver, "123");
				LoginPage.setPasswordtxt(driver, "123");
				LoginPage.getLoginbtn(driver).click();
				PostPage.clickdotsMenu(driver);
				PostPage.getDeleteIcon(driver).click();
				//confirming the pop-up dialog
				driver.switchTo().alert().accept();
				okidac = true;
				break;
			case 8:
				// Zadatak 4.2
				//Please create one post manually in order to run the automated deletion
				RegistrationPage.openSite(driver);
				LoginPage.setUsernametxt(driver, "123");
				LoginPage.setPasswordtxt(driver, "123");
				LoginPage.getLoginbtn(driver).click();
				PostPage.clickdotsMenu(driver);
				PostPage.getEditIcon(driver).click();
				// wait for form elements to load
				Thread.sleep(3000);
				PostPage.getDescriptionfld(driver).click();
				PostPage.getDescriptionfld(driver).clear();
				PostPage.getDescriptionfld(driver).sendKeys("update");
				PostPage.getObjavibtn(driver).click();	 		
				okidac = true;
				break;

			default:
				break;

			}
			scanner.close();

			driver.close();

}}}
