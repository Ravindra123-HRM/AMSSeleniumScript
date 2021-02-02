package com.ams.qa.admin.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ams.qa.base.Log;

public class ManageCutOffs {
	

	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public ManageCutOffs(WebDriver driver) throws Exception {

		this.driver = driver;
	}
	
	private By Togglelinkation=By.xpath("//span[@id='tooglebtn']");
	private By Admin = By.xpath(" //div[@class='menutext'][contains(text(),'Admin')]");
	private By ManageCutOff = By.xpath("//a[@id='ctl00_liAttendanceCutoff']");
	private By Costcenter = By.id("ddlCostCentre");
	private By Cutt_offType = By.id("ddlCutoffType");
	private By CTNCT = By.xpath("//select[@id='ddlCTNCT']");

	private By NoofDays = By.xpath("//input[@id='ctl00_MainContent_rbCount']");
	private By NoofDaysDate = By.xpath("//input[@id='txtNo']");
	private By ADD = By.xpath("//input[@id='ctl00_MainContent_btnSave']");
	//input[@id='ctl00_MainContent_rbCount']
	private By Edit = By.xpath("//span[contains(text(),'Australia')]//following::td[10]//a[@class='fa fa-edit']");
	private By update = By.xpath("//input[@id='ctl00_MainContent_btnUpdate']");
	
	
	
	public void getToggleLink() throws InterruptedException {
		Thread.sleep(2000);
		WebElement userregisteration = driver.findElement(Togglelinkation);
		userregisteration.click();
       Log.info("Togglelinkation  is selected");

	}
	
	public void getAdmin() throws InterruptedException {
		Thread.sleep(2000);
		WebElement admin = driver.findElement(Admin);
		admin.click();
       Log.info("Admin is selected");

	}

	
	public void getManageCutOff() throws InterruptedException {

		Thread.sleep(2000);
		WebElement manageAttendanceSourse = driver.findElement(ManageCutOff);
		manageAttendanceSourse.click();
           Log.info("ManageCutOff is selected");
	}

	
	public void getCostcenter() throws InterruptedException {

		Thread.sleep(2000);
	
		Select subDepartment=new Select (driver.findElement(Costcenter));

		 
		subDepartment.selectByVisibleText("Australia");
			
		
			 
        Log.info("Costcenter drop down is selected");
	}
	
	public void getCutt_offType() throws InterruptedException {

		Thread.sleep(2000);
	
		Select costcenter=new Select (driver.findElement(Cutt_offType));

		 
		costcenter.selectByVisibleText("Refresh Attendance");
			
		
			 
        Log.info("Cutt_offType drop down is selected");
	}
	
	public void getCTNCT() throws InterruptedException {

		Thread.sleep(2000);
	
		Select costcenter=new Select (driver.findElement(CTNCT));

		 
		costcenter.selectByVisibleText("NCT");
			
		
			 
        Log.info("CTNCT drop down is selected");
	}
	
	
	
	public void getNoofDays() throws InterruptedException {

		Thread.sleep(2000);
	
		WebElement noofDays=driver.findElement(NoofDays);
		noofDays.click();
		
			 
        Log.info("NoofDays Radio Button is click");
	}
	
	
	
	public void getNoofDaysDate() throws InterruptedException {

		Thread.sleep(2000);
	
		WebElement noofDaysDate=driver.findElement(NoofDaysDate);
        
		noofDaysDate.sendKeys("22");
		 
        Log.info("NoofDaysDate is entered");
	}
	
	
	public void getAdd() throws InterruptedException {

		Thread.sleep(2000);
		WebElement add = driver.findElement(ADD);
		add.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
        Log.info("Add is selected");
	}

	public void getEdit() throws InterruptedException {

		Thread.sleep(3000);
		List<WebElement>datetimer=driver.findElements(Edit);
		for(WebElement ele:datetimer)
		{
			 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			 
			 //get current date time with Date()
			 Date date = new Date();
			 
			 // Now format the date
			 String datez= dateFormat.getTimeZone().getDisplayName();
			 String date1= dateFormat.format(date);
			 
			 // Print the Date
			 System.out.println("Current date and time is " +date1);
	
			 if(datez.equalsIgnoreCase(date1))
					 {
				 ele.click();
				 break;
				 
				 }
			
		}
		WebElement edit = driver.findElement(Edit);
		edit.click();
        Log.info("Edit is selected");
	}

	public void getUpdate() throws InterruptedException {

		Thread.sleep(3000);
		WebElement Update = driver.findElement(update);
		Update.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
        Log.info("Update button is selected");
	   }


}
