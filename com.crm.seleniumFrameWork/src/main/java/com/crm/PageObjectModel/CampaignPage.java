package com.crm.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	
	// Initialization 
			public  CampaignPage(WebDriver driver) 
			{
				PageFactory.initElements(driver, this);
			}
			
	//Declaration
			
			@FindBy(xpath="//img[@title='Create Campaign...']")
			private WebElement createCampaign;
			
			@FindBy(name="campaignname")
			private WebElement campaignName;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement saveButton;
			
			@FindBy(className="dvHeaderText")
			private WebElement headText;
			
			@FindBy(xpath="//img[@title='Select']")
			private WebElement selectProduct;
			
			@FindBy(id="search_txt")
			private WebElement searchText;
			
			@FindBy(name="search")
			private WebElement searchButton;
			
			
			
			//getters method

			public WebElement getCreateCampaign() {
				return createCampaign;
			}

			public WebElement getCampaignName() {
				return campaignName;
			}

			public WebElement getSaveButton() {
				return saveButton;
			}

			public WebElement getHeadText() {
				return headText;
			}
			
			public WebElement getSelectProduct() {
               return selectProduct;
			}
			
			public WebElement getSearchText() {
				return searchText;
			}
			
			public WebElement getSearchButton() {
				return searchButton;
			}
				
			//Business Logic
			
			/**
			 * This method is used to click on create campaign
			 * @author Hemanth
			 */
			public void clickOnCreateCampaign() {
				createCampaign.click();
			}
			
			/**
			 * This method is used to create campaign name and save
			 * @param name
			 * @author Hemanth
			 */
			public void clickOnCampaignName(String name) {
				campaignName.sendKeys(name);
				
				
			}
			
			/**
			 * this method is used to get text of header
			 * @return
			 * @author Hemanth
			 */
			public String headText() {
				String text = headText.getText();
				return text;
			}
			
			/**
			 * this method is used to click on select product on create campaign page
			 * @author Hemanth
			 */
			public void clickOnSelectProduct() {
				selectProduct.click();
			}
			
			/**
			 * this method is used to click on save button
			 * @author Hemanth
			 */
			public void clickOnSaveButton() {
				saveButton.click();
			}
			
			/**
			 * 	this method is used to click on search text
			 * @author Hemanth
			 */
			public void clickOnSearchText(String name) {
				searchText.sendKeys(name);
				
			}

			/**
			 * this method is used to clck on search button
			 * @author Hemanth
			 */
			public void clickOnSearchButton() {
				searchButton.click();
			}
			
}
