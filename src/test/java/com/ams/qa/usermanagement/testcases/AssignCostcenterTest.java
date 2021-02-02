package com.ams.qa.usermanagement.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ams.qa.base.TestBase;
import com.ams.qa.usermangement.pages.AssignCostCenter;
import com.ams.qa.usermangement.pages.AssignRoles;
import com.ams.qa.usermangement.pages.LoginPage;
import com.ams.qa.usermangement.pages.UserMangementManageRoles;

public class AssignCostcenterTest extends TestBase {
	public static LoginPage lp;
	public static  UserMangementManageRoles UMR;
	public static AssignCostCenter ACC;
	@BeforeClass
	
	public  void setup() throws Exception
	{
		
		driver=Initialization();
	      lp=new LoginPage();
	      UMR=new UserMangementManageRoles(driver); 
	      ACC=new AssignCostCenter(driver);
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
	public void getAssignCostCenter() throws InterruptedException
	{
	
		ACC.getAssignCostCenter();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAssignCostCenter"})
	public void getRole() throws InterruptedException
	{
	
		ACC.getRole();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getRole"})
	public void getEmployee() throws InterruptedException
	{
	
		ACC.getEmployee();
     } 
	@Test(groups= {"Regression"},dependsOnMethods= {"getEmployee"})
	
	public void getCheckbox() throws InterruptedException
	{
	
		ACC.getCheckbox();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getCheckbox"})
	public void getAdd() throws InterruptedException
	{
	
		ACC.getAdd();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAdd"})
	public void getEdit() throws InterruptedException
	{
	
		ACC.getEdit();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getEdit"})
	public void getUpdate() throws InterruptedException
	{
	
		ACC.getUpdate();
     } 
	
@AfterClass()
	
	
	public void Teardown() 
	{
	driver.quit();
	}

}
