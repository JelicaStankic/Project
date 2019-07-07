package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	private static String txtUsername = "username";
	private static String txtPassword = "password";
	private static String btnLogin = "login";
	private static String btnLogout = "logoutBtn";

	public static WebElement getUsernametxt(WebDriver driver) {
		WebElement element = driver.findElement(By.name(txtUsername));
		return element;
	}

	public static void clickUsernametxt(WebDriver driver) {
		getUsernametxt(driver).click();

	}

	public static void setUsernametxt(WebDriver driver, String value) {
		getUsernametxt(driver).sendKeys(value);
	}

	public static WebElement getPasswordtxt(WebDriver driver) {
		WebElement element = driver.findElement(By.name(txtPassword));
		return element;
	}

	public static void clickPasswordtxt(WebDriver driver) {
		getPasswordtxt(driver).click();

	}

	public static void setPasswordtxt(WebDriver driver, String value) {
		getPasswordtxt(driver).sendKeys(value);
	}

	public static WebElement getLoginbtn(WebDriver driver) {
		WebElement element = driver.findElement(By.name(btnLogin));
		return element;
	}

	public static void clickLoginbtn(WebDriver driver) {
		getLoginbtn(driver).click();

	}

	public static WebElement getLogoutbtn(WebDriver driver) {
		WebElement element = driver.findElement(By.id(btnLogout));
		return element;
	}

	public static void clickLogoutbtn(WebDriver driver) {
		getLogoutbtn(driver).click();

	}
}
