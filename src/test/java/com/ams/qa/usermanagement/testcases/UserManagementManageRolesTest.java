package com.ams.qa.usermanagement.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ams.qa.base.TestBase;
import com.ams.qa.usermangement.pages.LoginPage;
import com.ams.qa.usermangement.pages.UserMangementManageRoles;

public class UserManagementManageRolesTest extends TestBase{
	
	
		
		public static LoginPage lp;
		public static  UserMangementManageRoles UMR;
		
		@BeforeClass
		
		public  void setup() throws Exception
		{
			
			driver=Initialization();
		      lp=new LoginPage();
		      UMR=new UserMangementManageRoles(driver); 
			
			}
		
		@Test(groups="Regression")
		public  void getToggleLinkbutton() throws Exception
		{  
			
			PropertyConfigurator.configure("log4j.properties");
			 lp.costcenter();
			lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		   UMR.getToggleLinkbutton();
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"getToggleLinkbutton"})
		public void getUserMnagement() throws InterruptedException
		{
		
			UMR.getUserMnagement();
	     } 
		
		@Test(groups= {"Regression"},dependsOnMethods= {"getUserMnagement"})
		public void getManagerRoles() throws InterruptedException
		{
		
			UMR.getManagerRoles();
	     } 
		
		@Test(groups= {"Regression"},dependsOnMethods= {"getManagerRoles"})
		public void getRoles() throws InterruptedException
		{
		
			UMR.getRoles();
	     } 
		
		@Test(groups= {"Regression"},dependsOnMethods= {"getRoles"})
		public void getModules() throws InterruptedException
		{
		
			UMR.getModules();
	     } 
		
		@Test(groups= {"Regression"},dependsOnMethods= {"getModules"})
		public void getAdd() throws InterruptedException
		{
		
			UMR.getAdd();
	     } 
		
		@Test(groups= {"Regression"},dependsOnMethods= {"getAdd"})
		public void getEdit() throws InterruptedException
		{
		
			UMR.getEdit();
	     } 
		
		@Test(groups= {"Regression"},dependsOnMethods= {"getEdit"})
		public void getUpdate() throws InterruptedException
		{
		
			UMR.getUpdate();
	     } 
		
		@AfterClass()
		
		
		public void Teardown() 
		{
		driver.quit();
		}

}
