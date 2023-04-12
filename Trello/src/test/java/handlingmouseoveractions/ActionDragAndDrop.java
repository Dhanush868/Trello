package handlingmouseoveractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragAndDrop {
public static void main(String[] args) {
	WebDriver  driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://trello.com/");
	WebElement loginOption = driver.findElement(By.xpath("//a[text()='Log in' and contains(@class,'Buttonsstyles__Button')]"));
	loginOption.click();
	driver.switchTo().activeElement().sendKeys("peoplefortiptur@gmail.com");
	WebElement continueLoginButton = driver.findElement(By.id("login"));
	continueLoginButton.submit();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	driver.switchTo().activeElement().sendKeys("9886947924");
	WebElement finalLoginButton = driver.findElement(By.id("login-submit"));
	finalLoginButton.submit();
	WebElement dragandDropBoard = driver.findElement(By.xpath("//a[contains(.,'DragAndDrop')]"));
	dragandDropBoard.click();
	WebElement frameworkCard = driver.findElement(By.xpath("//a[contains(.,'FrameWork')]"));
	WebElement conatinertoDrop = driver.findElement(By.xpath("//textarea[text()='Completed']/../../div[contains(@class,'list-cards')]"));
	new Actions(driver).clickAndHold(frameworkCard).pause(Duration.ofSeconds(2)).dragAndDrop(frameworkCard, conatinertoDrop).pause(Duration.ofSeconds(2)).release(conatinertoDrop).build().perform();
}
}
