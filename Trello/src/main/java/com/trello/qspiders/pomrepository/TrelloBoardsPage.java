package com.trello.qspiders.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardsPage {
WebDriver driver;
public TrelloBoardsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "//p/..//span[text()='Create new board']")
	private WebElement createNewBoard;
	
	@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	private WebElement createBoardTitleTextField;
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createBoardButton;

	@FindBy(xpath = "//button[@aria-label='Open member menu']")
	private WebElement memberMenuOption;
	
	@FindBy(xpath = "//button[.='Log out']")
	private WebElement logoutOption;
	
	public WebElement createNewBoard() {
		return createNewBoard;
	}
	public WebElement createBoardTitleTextField() {
		return createBoardTitleTextField;
	}
	public WebElement createBoardButton() {
		return createBoardButton;
	}
	public WebElement memberMenuOption() {
		return memberMenuOption;
	}
	public WebElement logoutOption() {
		return logoutOption;
	}
}

