package com.ams.qa.usermanagement.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ams.qa.base.TestBase;
import com.ams.qa.usermangement.pages.AssignRoles;
import com.ams.qa.usermangement.pages.LoginPage;
import com.ams.qa.usermangement.pages.UserMangementManageRoles;

public class AssignRolesTest extends TestBase {

	
	public static LoginPage lp;
	public static  UserMangementManageRoles UMR;
	public static AssignRoles AR;
	@BeforeClass
	
	public  void setup() throws Exception
	{
		
		driver=Initialization();
	      lp=new LoginPage();
	      UMR=new UserMangementManageRoles(driver); 
	      AR=new AssignRoles(driver);
	}
	
	@Test(groups="Regression")
	public  void getUserRegisteration() throws Exception
	{  
		
		PropertyConfigurator.configure("log4j.properties");
		 lp.costcenter();
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	   UMR.getToggleLinkbutton();
	   
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"getUserRegisteration"})
	public void getUserMnagement() throws InterruptedException
	{
	
		UMR.getUserMnagement();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getUserMnagement"})
	public void getAssignRoles() throws InterruptedException
	{
	
		AR.getAssignRoles();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAssignRoles"})
	public void getEmployeeID() throws InterruptedException
	{
	
		AR.getEmployeeID();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getEmployeeID"})
	public void getCheckbox() throws InterruptedException
	{
	
		AR.getCheckbox();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getCheckbox"})
	public void getAdd() throws InterruptedException
	{
	
		AR.getAdd();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAdd"})
	public void getEdit() throws InterruptedException
	{
	
		AR.getEdit();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getEdit"})
	public void getUpdate() throws InterruptedException
	{
	
		AR.getUpdate();
     } 
	
	@AfterClass()
	
	
	public void Teardown() 
	{
	driver.quit();
	}
}
