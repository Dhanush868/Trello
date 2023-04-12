package com.trello.qspiders.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.trello.qspiders.pomrepository.TrelloBoardsPage;
import com.trello.qspiders.pomrepository.TrelloHomePage;
import com.trello.qspiders.pomrepository.TrelloLoginPage;
import com.trello.qspiders.pomrepository.TrelloLoginToContinue;
import com.trello.qspiders.pomrepository.TrelloLogoutPage;

public class BaseClass {
public WebDriver driver;
 public FileUtility fileUtils = new FileUtility();
  public ExcelUtility excelUtils = new ExcelUtility();
 public WebDriverUtility webdriverUtils = new WebDriverUtility();
 @BeforeClass
 public void configBeforeClass() throws Throwable {
	 String browserName=fileUtils.readDataFromPropertyFile("./src/test/resources/kranthicommondata.properties", "browser");
	 if (browserName.equals("firfox")) {
		 driver=new ChromeDriver();
	}else if(browserName.equals("chrome")) {
		driver= new FirefoxDriver();
	}
	 driver.manage().window().maximize();
	 webdriverUtils.implicitWait(driver);
	 driver.get(fileUtils.readDataFromPropertyFile("./src/test/resources/kranthicommondata.properties", "url"));
 }
 @BeforeMethod
 public void cofigBeforeMethod() throws Throwable {
	 TrelloHomePage homePage = new TrelloHomePage(driver);
	 homePage.loginOption().click();
	 TrelloLoginPage loginPage = new TrelloLoginPage(driver);
	 loginPage.emailTextField().sendKeys(fileUtils.readDataFromPropertyFile("./src/test/resources/kranthicommondata.properties", "username"));
	 loginPage.continueLoginButton().click();
	 TrelloLoginToContinue loginToConti = new TrelloLoginToContinue(driver);
	 webdriverUtils.explicitWaitForPasswordTextField(driver);
	 loginToConti.passwordTextField().sendKeys(fileUtils.readDataFromPropertyFile("./src/test/resources/kranthicommondata.properties", "password"));
	 loginToConti.finalLoginButton().submit();
 }
 @AfterMethod
 public void configAfterMethod() {
	 TrelloBoardsPage boardsPage = new TrelloBoardsPage(driver);
	 boardsPage.memberMenuOption().click();
	 boardsPage.logoutOption().click();
	 TrelloLogoutPage logoutPage = new TrelloLogoutPage(driver);
	 logoutPage.logoutButton().submit();
	 if (webdriverUtils.explicitWaitForUrl(driver)) {
		System.out.println("Pass: The Logout is sucessfull upon the verification of Url of the Home Page.");
	}else {
		System.out.println("Fail: The Logout is unsucessfull upon the verification of the URL of the home page.");
	}
 }
 @AfterClass
 public void cofigAfterClass() {
	 driver.manage().window().minimize();
	 driver.quit();
 }
}
