package handlingmouseoveractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	Actions actions = new Actions(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	WebElement menSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	actions.moveToElement(menSection).pause(Duration.ofSeconds(2)).moveToElement(menSection, 76, 0).pause(Duration.ofSeconds(2)).moveToElement(menSection, 153, 0).pause(Duration.ofSeconds(2)).moveToElement(menSection, 253, 0).pause(Duration.ofSeconds(2)).moveToElement(menSection, 365, 0).pause(Duration.ofSeconds(2)).moveToElement(menSection, 454, 0).build().perform();
}
}
