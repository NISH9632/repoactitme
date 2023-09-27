package com.actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewBtn;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustomerNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescriptionTbx;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyTbx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newProjectOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")	
	private WebElement enterProjectNametbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customerDD;
	
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='FDFC_001']")
	private WebElement enterCustomer;
	
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Add Project Description']")
	private WebElement enterProjectDescriptionTbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn ;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualProject;
	
	
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskOption;
	
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div")
	private WebElement taskSelectCustomerDD;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow 'and text()='FDFC_001']")
	private WebElement taskcustomeroption;
	
	
	@FindBy(xpath="//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div")
	private WebElement taskSelectProjectDD;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='FDFC Bank']")
	private WebElement taskProjectOption;
	
	@FindBy(xpath="((//input[@placeholder='Enter task name'])[1]")
	private WebElement taskName;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTaskBtn;
	
	@FindBy(xpath="//div[@title='qspiders training institute']")
	private WebElement actualTask;
	

	
	
	public WebElement getTaskProjectOption() {
		return taskProjectOption;
	}



	public WebElement getActualTask() {
		return actualTask;
	}



	public WebElement getCustomerDD() {
		return customerDD;
	}



	public WebElement getEnterCustomer() {
		return enterCustomer;
	}



	public WebElement getNewTaskOption() {
		return newTaskOption;
	}



	public WebElement getTaskSelectCustomerDD() {
		return taskSelectCustomerDD;
	}



	public WebElement getTaskcustomeroption() {
		return taskcustomeroption;
	}



	public WebElement getTaskSelectProjectDD() {
		return taskSelectProjectDD;
	}



	public void setTaskName() {
		 taskName.click();
	}
	
	public WebElement getTaskName() {
		return taskName;
	}



	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}



	public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getAddnewBtn() {
		return addnewBtn;
	}

	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getEnterCustomerNameTbx() {
		return enterCustomerNameTbx;
	}

	public WebElement getEnterCustomerDescriptionTbx() {
		return enterCustomerDescriptionTbx;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getNewProjectOption() {
		return newProjectOption;
	}

	public WebElement getEnterProjectNametbx() {
		return enterProjectNametbx;
	}

	public WebElement getEnterProjectDescriptionTbx() {
		return enterProjectDescriptionTbx;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getActualProject() {
		return actualProject;
	}

	public WebElement getBigBangCompanyTbx() {
		return bigBangCompanyTbx;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	
	
		
		
		

}
