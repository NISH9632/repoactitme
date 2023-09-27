package com.actitime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.Generic.FileLib;
import com.actitime.Pom.EnterTimeTrackPage;
import com.actitime.Pom.TaskListPage;
@Listeners(com.actitime.Generic.ListenerImplementation.class)
public class TaskModule extends BaseClass{
	
	@Test
	public void createTask() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLib f=new FileLib();
		String taskName = f.getExcelData("CreateTask", 1, 2);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	    TaskListPage t=new TaskListPage(driver);
	    e.setTaskTab();
	
		   	t.getAddnewBtn().click();
			t.getNewTaskOption().click();
			t.getTaskSelectCustomerDD().click();
			t.getTaskcustomeroption().click();
			t.getTaskSelectProjectDD().click();
			t.getTaskProjectOption().click();
			t.setTaskName();
			t.getTaskName().sendKeys(taskName);
			t.getCreateTaskBtn().click();
			
			Thread.sleep(4000);
			String actualTask = t.getActualTask().getText();
			Assert.assertEquals(actualTask, taskName);
	
	}

}
