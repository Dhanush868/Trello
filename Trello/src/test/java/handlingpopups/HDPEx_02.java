package handlingpopups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HDPEx_02 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=05cc435d91ce80bed759da082b60f77a4356f2f00eae71d2a8c80ede2676553b");
	WebElement popupCloseButton = driver.findElement(By.xpath("//div[contains(@class,'modal-header text')]/button[@type='button']"));
	wait.until(ExpectedConditions.elementToBeClickable(popupCloseButton));
	//popupCloseButton.click();
	new Actions(driver).moveToElement(popupCloseButton).click(popupCloseButton).perform();
}
}
