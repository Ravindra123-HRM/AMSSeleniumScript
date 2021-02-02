package com.ams.qa.admin.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ams.qa.admin.pages.ManageAttendanceSource;
import com.ams.qa.admin.pages.ManageCutOffs;
import com.ams.qa.base.TestBase;
import com.ams.qa.usermangement.pages.LoginPage;
import com.ams.qa.usermangement.pages.UserMangementManageRoles;

public class ManageCutOffTest extends TestBase {

	public static LoginPage lp;
	public static  UserMangementManageRoles UMR;
	public static ManageCutOffs MCO;
	public static ManageAttendanceSource MAS;
	
	@BeforeClass
	
	public  void setup() throws Exception
	{
		
		driver=Initialization();
	      lp=new LoginPage();
	      UMR=new UserMangementManageRoles(driver); 
	      MCO= new ManageCutOffs(driver);
	      MAS= new ManageAttendanceSource (driver);
		
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
	public void getAdmin() throws InterruptedException
	{
	
		MAS.getAdmin();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAdmin"})
	public void getManageCutOff() throws InterruptedException
	{
	
		MCO.getManageCutOff();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getManageCutOff"})
	public void getCostcenter() throws InterruptedException
	{
	
		MCO.getCostcenter();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getCostcenter"})
	public void getCutt_offType() throws InterruptedException
	{
	
		MCO.getCutt_offType();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getCutt_offType"})
	public void getCTNCT() throws InterruptedException
	{
	
		MCO.getCTNCT();
     } 
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getCTNCT"})
	public void getNoofDays() throws InterruptedException
	{
	
		MCO.getNoofDays();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getNoofDays"})
	public void getNoofDaysDate() throws InterruptedException
	{
	
		MCO.getNoofDaysDate();
     } 
	
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getNoofDaysDate"})
	public void getAdd() throws InterruptedException
	{
	
		MAS.getAdd();
		
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getAdd"})
	public void getEdit() throws InterruptedException
	{
	
		MAS.getEdit();
		
     } 
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getEdit"})
	public void getupdate() throws InterruptedException
	{
	
		MAS.getUpdate();
		
     } 
	
	
	
	/*@AfterClass()
	
	
	public void Teardown() 
	{
	driver.quit();
	}*/
}
