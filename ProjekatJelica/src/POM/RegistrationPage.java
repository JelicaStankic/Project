package POM;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	public static  String pageLink = "https://izlet.000webhostapp.com/izlet/index.php";
	private static String FirstNametxt = "firstname";
	private static String LastNametxt = "lastname";
	private static String Usernametxt = "//form[@action='processregister.php']//input[@name='username']";
	private static String Emailtxt = "email";
	private static String Passwordtxt = "//form[@action='processregister.php']//input[@name='password']";
	private static String Regsterbtn = "register";

	public static void openSite(WebDriver driver) {
		driver.get(pageLink);
	}

	/* First name input */
	public static WebElement getFirstNametxt(WebDriver driver) {
		WebElement element = driver.findElement(By.name(FirstNametxt));
		return element;
	}

	public static void clickFirstNametxt(WebDriver driver) {
		getFirstNametxt(driver).click();

	}

	public static void setFirstNametxt(WebDriver driver, String str) {
		getFirstNametxt(driver).sendKeys(str);
	}

	/* Last name input */
	public static WebElement getLastNametxt(WebDriver driver) {
		WebElement element = driver.findElement(By.name(LastNametxt));
		return element;
	}

	public static void clickLastNametxt(WebDriver driver) {
		getLastNametxt(driver).click();

	}

	public static void setLastNametxt(WebDriver driver, String str) {
		getLastNametxt(driver).sendKeys(str);
	}

	/* Email input */
	public static WebElement getEmailtxt(WebDriver driver) {
		WebElement element = driver.findElement(By.name(Emailtxt));
		return element;
	}

	public static void clickEmailtxt(WebDriver driver) {
		getEmailtxt(driver).click();

	}

	public static void setEmailtxt(WebDriver driver, String str) {
		getEmailtxt(driver).sendKeys(str);
	}

	/* Registering of desired username for user registration */
	public static WebElement getUsernametxt(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(Usernametxt));
		return element;
	}

	public static void clickUsernametxt(WebDriver driver) {
		getUsernametxt(driver).click();

	}

	public static void setUsernametxt(WebDriver driver, String str) {
		getUsernametxt(driver).sendKeys(str);
	}

	/* Registering of user password */
	public static WebElement getPasswordtxt(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(Passwordtxt));
		return element;
	}

	public static void clickPasswordtxt(WebDriver driver) {
		getPasswordtxt(driver).click();

	}

	public static void setPasswordtxt(WebDriver driver, String str) {
		getPasswordtxt(driver).sendKeys(str);
	}

	public static WebElement getRegisterbtn(WebDriver driver) {
		WebElement element = driver.findElement(By.name(Regsterbtn));
		return element;
	}

	public static void clickRegisterbtn(WebDriver driver) {
		getRegisterbtn(driver).click();

	}

}
