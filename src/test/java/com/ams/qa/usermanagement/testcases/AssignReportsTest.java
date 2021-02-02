package com.ams.qa.usermanagement.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ams.qa.base.TestBase;
import com.ams.qa.usermangement.pages.AssignCostCenter;
import com.ams.qa.usermangement.pages.AssignReports;
import com.ams.qa.usermangement.pages.LoginPage;
import com.ams.qa.usermangement.pages.UserMangementManageRoles;

public class AssignReportsTest extends TestBase {
	public static LoginPage lp;
	public static  UserMangementManageRoles UMR;
	public static AssignReports AR;
	@BeforeClass
	
	public  void setup() throws Exception
	{
		
		driver=Initialization();
	      lp=new LoginPage();
	      UMR=new UserMangementManageRoles(driver); 
	      AR=new AssignReports(driver);
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
	public void getAssignReports() throws InterruptedException
	{
	
		AR.getAssignReports();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAssignReports"})
	public void getRole() throws InterruptedException
	{
	
		AR.getRole();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getRole"})
	public void getEmployee() throws InterruptedException
	{
	
		AR.getReports();
     } 
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getEmployee"})
	public void getAdd() throws InterruptedException
	{
	
		AR.getAdd();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAdd"})
	public void getPagination() throws InterruptedException
	{
	
		AR.getPagination();
		
     } 
	
	
	/*@Test(groups= {"Regression"},dependsOnMethods= {"getPagination"})
	public void getEdit() throws InterruptedException
	{
	
		AR.getEdit();
     } */
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getPagination"})
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
