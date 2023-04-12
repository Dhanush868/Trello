package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploafPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.foundit.in/seeker/registration");
	driver.switchTo().frame("wiz-iframe-intent");
	WebElement hdppopup = driver.findElement(By.xpath("//div[@id='pop_rea']/div[@class='btn close-button']"));
	wait.until(ExpectedConditions.elementToBeClickable(hdppopup));
	new Actions(driver).moveToElement(hdppopup).click(hdppopup).perform();
	driver.switchTo().defaultContent();
	WebElement fileUploadButton = driver.findElement(By.id("file-upload"));
//	new Actions(driver).moveToElement(fileUploadButton).pause(Duration.ofSeconds(1)).click(fileUploadButton).pause(Duration.ofSeconds(1)).click().perform();
//	new Actions(driver).doubleClick(fileUploadButton).perform();
	fileUploadButton.sendKeys("C:\\Users\\HP\\Desktop\\acticommondata1.txt");


}
}
