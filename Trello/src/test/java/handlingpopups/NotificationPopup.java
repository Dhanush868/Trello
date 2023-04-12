package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPopup {
public static void main(String[] args) {
	//Create the object of ChromeOptions class
	ChromeOptions option = new ChromeOptions();
	//acall the method called addArguments(String...addArguments) - ChromeOPtions
	ChromeOptions notificationpopupSettings = option.addArguments("--disable-notifications");
	//call the constructor ChromeDriver(ChromeOption option) to create the ChromeDriverObject
	WebDriver driver = new ChromeDriver(option);
	//WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.ajio.com/");
}
}
