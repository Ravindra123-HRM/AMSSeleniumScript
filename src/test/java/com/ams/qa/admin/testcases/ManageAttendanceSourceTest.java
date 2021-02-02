package com.ams.qa.admin.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ams.qa.admin.pages.ManageAttendanceSource;
import com.ams.qa.base.TestBase;
import com.ams.qa.usermangement.pages.LoginPage;
import com.ams.qa.usermangement.pages.UserMangementManageRoles;

public class ManageAttendanceSourceTest extends TestBase {

	public static LoginPage lp;
	public static  UserMangementManageRoles UMR;
	public static ManageAttendanceSource MAS;
	
	@BeforeClass
	
	public  void setup() throws Exception
	{
		
		driver=Initialization();
	      lp=new LoginPage();
	      UMR=new UserMangementManageRoles(driver); 
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
	public void getManageAttendanceSourse() throws InterruptedException
	{
	
		MAS.getManageAttendanceSourse();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getManageAttendanceSourse"})
	public void getCostcenter() throws InterruptedException
	{
	
		MAS.getCostcenter();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getCostcenter"})
	public void getDepartment() throws InterruptedException
	{
	
		MAS.getDepartment();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getDepartment"})
	public void getSubDepartment() throws InterruptedException
	{
	
		MAS.getSubDepartment();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getSubDepartment"})
	public void getSkillSet() throws InterruptedException
	{
	
		MAS.getSkillSet();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getSkillSet"})
	public void getSubSkillSet() throws InterruptedException
	{
	
		MAS.getSubSkillSet();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getSubSkillSet"})
	public void getType() throws InterruptedException
	{
	
		MAS.getType();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getType"})
	public void getPrimarysource() throws InterruptedException
	{
	
		MAS.getPrimarysource();
     } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"getPrimarysource"})
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
