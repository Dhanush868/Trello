package com.trello.qspiders.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trello.qspiders.pomrepository.TrelloLoginToContinue;
/**
 * For to supply the waiting time for all the script.
 * @author QCSE6
 *
 */
public class WebDriverUtility {

	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void explicitWaitForPasswordTextField(WebDriver driver ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		TrelloLoginToContinue logintoContinue=new TrelloLoginToContinue(driver);
		wait.until(ExpectedConditions.visibilityOf(logintoContinue.passwordTextField()));
	}
	public boolean explicitWaitForUrl(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean result = wait.until(ExpectedConditions.urlContains("home"));
		return result;
	}
}
