package com.trello.qspiders.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginToContinue {
WebDriver driver;
public TrelloLoginToContinue(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(id = "password")
	private WebElement passwordTextField;
	
	@FindBy (id = "login-submit")
	private WebElement finalLoginButton;
	
	public WebElement passwordTextField() {
		return passwordTextField;
	}
	
	public WebElement finalLoginButton() {
		return finalLoginButton;
	}
}
