package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescTbx;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Our company']")
	private WebElement ourCompanyOption;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustCreated;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}

	public WebElement getEnterCustDescTbx() {
		return enterCustDescTbx;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getOurCompanyOption() {
		return ourCompanyOption;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustCreated() {
		return actualCustCreated;
	}

	
	
	
}
