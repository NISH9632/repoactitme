package com.actitime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.Generic.FileLib;
import com.actitime.Pom.EnterTimeTrackPage;
import com.actitime.Pom.TaskListPage;
@Listeners(com.actitime.Generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{
	
	@Test
	public void createProject() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLib f=new FileLib();
		String projectName=f.getExcelData("CreateProject", 1, 2);
		String projectDesc=f.getExcelData("CreateProject", 1, 3);
		
	EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
	e.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddnewBtn().click();
	t.getNewProjectOption().click();
	t.getEnterProjectNametbx().sendKeys(projectName);
	t.getCustomerDD().click();
	t.getEnterCustomer().click();
	t.getEnterProjectDescriptionTbx().sendKeys(projectDesc);
	t.getCreateProjectBtn().click();
	Thread.sleep(4000);
	String actualProject = t.getActualProject().getText();
	Assert.assertEquals(actualProject, projectName);

	}
}
