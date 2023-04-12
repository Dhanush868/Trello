package handlingmouseoveractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyDownAction {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	Actions actions =  new Actions(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/signup");
	WebElement monthdropDown = driver.findElement(By.id("month"));
	
Select monthSelect = new Select(monthdropDown);
//monthSelect.selectByVisibleText("Jan");
actions.click(monthdropDown).keyDown(Keys.ARROW_UP).keyDown(Keys.ARROW_UP).keyDown(Keys.ARROW_UP).keyDown(Keys.ARROW_UP).keyDown(Keys.ARROW_UP).keyDown(Keys.ARROW_UP).perform();
}
}
