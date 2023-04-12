package handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownLoadPopup {
public static void main(String[] args) throws AWTException, Throwable {
	WebDriver driver = new ChromeDriver();
	Robot robot = new Robot();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.linkText("4.6.0")).click();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_J);
	Thread.sleep(1000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_J);
	Set<String> allWIndowsId = driver.getWindowHandles();
	for (String wid : allWIndowsId) {
		String url = driver.switchTo().window(wid).getCurrentUrl();
		if (url.equals("https://www.selenium.dev/downloads/")) {
			
		}else if (url.equals("chrome://downloads/")) {
			driver.navigate().refresh();
			WebElement shadowParent1 = driver.findElement(By.tagName("downloads-manager"));
			SearchContext shadowHost1 = shadowParent1.getShadowRoot();
			//Shadow Root Element
			//Xpath will not identify the shadow root element 
			//shadowHost.findElement(By.xpath("//downloads-toolbar[@id='toolbar']"));
			//Css is the best approach to identify the shadow root element
			//shadowHost.findElement(By.cssSelector("downloads-toolbar[id='toolbar']"));
			WebElement shadowParent2 = shadowHost1.findElement(By.cssSelector("downloads-item[id='frb0']"));
			SearchContext shadowHost2 = shadowParent2.getShadowRoot();
			shadowHost2.findElement(By.cssSelector("cr-button[class='action-button']")).click();
			
		}
	}
	//driver.quit();
}
}
