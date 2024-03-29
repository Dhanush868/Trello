package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("file:///C:/Users/HP/Desktop/DesktopOffice/Sample%20WebPages/popups/alert%20popup.html");
	String alertMessage = driver.switchTo().alert().getText();
	System.out.println(alertMessage);
	driver.switchTo().alert().accept();
}
}
