package handlingmouseoveractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_03 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	Actions actions = new Actions(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	WebElement popupCloseButton = driver.findElement(By.xpath("//button[text()='✕']"));
	popupCloseButton.click();
	WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
	actions.moveToElement(loginButton).perform();
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Rewards']")));
	WebElement rewardsOption = driver.findElement(By.xpath("//div[text()='Rewards']"));
	actions.moveToElement(rewardsOption).pause(Duration.ofMillis(500)).click(rewardsOption).perform();
	//actions.moveToElement(loginButton).pause(Duration.ofSeconds(2)).moveToElement(rewardsOption).pause(Duration.ofSeconds(1)).click(rewardsOption).perform();
}
}
