package com.trello.qspiders.createanddeleteboard;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.trello.qspiders.genericutility.BaseClass;
import com.trello.qspiders.pomrepository.TrelloBoardsPage;
import com.trello.qspiders.pomrepository.TrelloCreatedBoardPage;

public class EndToEndScenario extends BaseClass {
	@Test
	public void createAndDeleteKranthi_01() throws Throwable {
		TrelloBoardsPage boardsPage = new TrelloBoardsPage(driver);
		boardsPage.createNewBoard().click();
		boardsPage.createBoardTitleTextField().sendKeys(fileUtils.readDataFromPropertyFile("./src/test/resources/trello.properties", "boardname"));
		boardsPage.createBoardButton().click();
		TrelloCreatedBoardPage createdBoardsPage = new TrelloCreatedBoardPage(driver);
		int i=0;
		for(i=0;i<6;i++) {
		createdBoardsPage.newListTitleTextField().sendKeys(excelUtils.readStringDataFromExcel("./src/test/resources/dbossnewmovie.xlsx", "kranthistarcrew", 0, i));
		System.out.println(excelUtils.readStringDataFromExcel("./src/test/resources/dbossnewmovie.xlsx", "kranthistarcrew", 0, i));
		createdBoardsPage.newListTitleTextField().sendKeys(Keys.ENTER);
		}
		createdBoardsPage.showMenuOptions().click();
		createdBoardsPage.moreOptions().click();
		createdBoardsPage.closeBoardOption().click();
		createdBoardsPage.closeBoardButton().click();
		createdBoardsPage.permanentlyDeleteBoardOption().click();
		createdBoardsPage.deleteBoardButton().click();	
	}
		
}
