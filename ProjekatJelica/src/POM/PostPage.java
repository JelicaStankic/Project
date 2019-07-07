package POM;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

public class PostPage {
	public static  String pageLink = "https://izlet.000webhostapp.com/izlet/dashboard.php#";
	private static String CreatePostbtn = "newPostBtn";
	private static String txtOpis = "//textarea[@placeholder='Opis']";
	private static String txtNaziv = "//input[@placeholder='Naziv']";
	private static String txtLokacija = "//input[@id='pac-input']";	
	private static String izaberi = "image";	
	private static String btnObjavi = "postSubmit";
	private static String dotsMenu = "fa-ellipsis-v";
	private static String DeleteIcon = "fa-trash-alt";
	private static String EditIcon = "fa-edit";
	private static String fldDescription = "//textarea[@id='description']";
	private static String btnEdit = "//div[@class='popupEdit']//input[@value='Post']";

	public static WebElement getCreatePostbtn(WebDriver driver) {
		WebElement element = driver.findElement(By.id(CreatePostbtn));
		return element;
	}

	public static void clickCreatePostbtn(WebDriver driver) {
		getCreatePostbtn(driver).click();

	}

	public static WebElement getOpistxt(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(txtOpis));
		return element;
	}

	public static void clickOpistxt(WebDriver driver) {
		getOpistxt(driver).click();

	}

	public static void setOpistxt(WebDriver driver, String str) {
		getOpistxt(driver).sendKeys(str);
	}

	public static WebElement getNazivtxt(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(txtNaziv));
		return element;
	}

	public static void clickNazivtxt(WebDriver driver) {
		getNazivtxt(driver).click();
	}

	public static void setNazivtxt(WebDriver driver, String str) {
		getNazivtxt(driver).sendKeys(str);
	}

	/* Post Location Input */
	public static WebElement getLokacijatxt(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(txtLokacija));
		return element;
	}

	public static void clickLokacijatxt(WebDriver driver) {
		getLokacijatxt(driver).click();

	}

	public static void setLokacijatxt(WebDriver driver, String str) {
		getLokacijatxt(driver).sendKeys(str);
	}
	
	
	public static WebElement getIzaberi(WebDriver driver) {
		WebElement element = driver.findElement(By.id(izaberi));
		return element;
	}
	
	
	public static void clickIzaberi(WebDriver driver) {
		getIzaberi(driver).click();

	}

	public static WebElement getObjavibtn(WebDriver driver) {
		WebElement element = driver.findElement(By.name(btnObjavi));
		return element;
	}

	public static void clickObjavibtn(WebDriver driver) {
		getObjavibtn(driver).click();

	}

	public static WebElement getdotsMenu(WebDriver driver) {
		WebElement element = driver.findElement(By.className(dotsMenu));
		return element;
	}

	public static void clickdotsMenu(WebDriver driver) {
		getdotsMenu(driver).click();

	}

	public static WebElement getDeleteIcon(WebDriver driver) {
		List<WebElement> deletePost = driver.findElements(By.className(DeleteIcon));
		return deletePost.get(0);
	}

	public static WebElement getEditIcon(WebDriver driver) throws InterruptedException {
		List<WebElement> editPost = driver.findElements(By.className(EditIcon));
		Thread.sleep(5000);
		return editPost.get(0);

	}

	public static WebElement getDescriptionfld(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(fldDescription));
		return element;

	}

	public static void clickDescriptionfld(WebDriver driver) {
		getDescriptionfld(driver).click();

	}

	public static void setDescriptionfld(WebDriver driver, String str) {
		getDescriptionfld(driver).clear();
		getDescriptionfld(driver).sendKeys(str);
	}

	public static WebElement getEditbtn(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(btnEdit));
		return element;
	}

	public static void clickEditbtn(WebDriver driver) {
		getEditbtn(driver).click();

	}
}
