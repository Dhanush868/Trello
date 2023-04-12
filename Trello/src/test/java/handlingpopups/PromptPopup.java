package handlingpopups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class PromptPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("file:///C:/Users/HP/Desktop/DesktopOffice/Sample%20WebPages/popups/prompt.html");
	driver.switchTo().alert().sendKeys("21");
	driver.switchTo().alert().accept();
}
}
