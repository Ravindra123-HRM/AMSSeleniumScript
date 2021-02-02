package com.ams.qa.usermanagement.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ams.qa.base.TestBase;
import com.ams.qa.usermangement.pages.AssignRoles;
import com.ams.qa.usermangement.pages.AssignSubDepartmentToManageEscalation;
import com.ams.qa.usermangement.pages.LoginPage;
import com.ams.qa.usermangement.pages.UserMangementManageRoles;

public class AssignSubDepartmentToManageEscalationTest extends TestBase {
	
	public static LoginPage lp;
	public static  UserMangementManageRoles UMR;
	public static AssignSubDepartmentToManageEscalation ASDTME;
	@BeforeClass
	
	public  void setup() throws Exception
	{
		
		driver=Initialization();
	      lp=new LoginPage();
	      UMR=new UserMangementManageRoles(driver); 
	      ASDTME=new AssignSubDepartmentToManageEscalation(driver);
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
	public void getAssignSubDepartmentToManageEscalation() throws InterruptedException
	{
	
		ASDTME.getAssignSubDepartmentToManageEscalation();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAssignSubDepartmentToManageEscalation"})
	public void getRole() throws InterruptedException
	{
	
		ASDTME.getRole();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getRole"})
	public void getEmployee() throws InterruptedException
	{
	
		ASDTME.getEmployee();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getEmployee"})
	public void getCostCenter() throws InterruptedException
	{
	
		ASDTME.getCostCenter();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getCostCenter"})
	public void getSubDepartment() throws InterruptedException
	{
	
		ASDTME.getSubDepartment();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getSubDepartment"})
	public void getAdd() throws InterruptedException
	{
	
		ASDTME.getAdd();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAdd"})
	public void getEdit() throws InterruptedException
	{
	
		ASDTME.getEdit();
     } 
	@Test(groups= {"Regression"},dependsOnMethods= {"getEdit"})
	public void getUpdate() throws InterruptedException
	{
	
		ASDTME.getUpdate();
     } 
	
	@AfterClass()
	
	
	public void Teardown() 
	{
	driver.quit();
	}

}
