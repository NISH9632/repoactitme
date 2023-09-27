package com.actitime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.Generic.FileLib;
import com.actitime.Pom.EnterTimeTrackPage;
import com.actitime.Pom.TaskListPage;
@Listeners(com.actitime.Generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	
	@Test
	public void CreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException{
		Reporter.log("CreateCustomer",true);
		FileLib f=new FileLib();
		String customerName = f.getExcelData("CreateCustomer", 1, 2);
		String customerDesc=f.getExcelData("CreateCustomer", 1, 3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getNewCustomerOption().click();
		t.getEnterCustomerNameTbx().sendKeys(customerName);
		t.getEnterCustomerDescriptionTbx().sendKeys(customerDesc);
		t.getSelectCustomerDD().click();
		t.getBigBangCompanyTbx().click();
		t.getCreateCustomerBtn().click();
		Thread.sleep(4000);
		String actualCustomer = t.getActualCustomer().getText();
		Assert.assertEquals(actualCustomer, customerName);
		
		
		
		
		
		
		
		}
		
		
		
		
	}


