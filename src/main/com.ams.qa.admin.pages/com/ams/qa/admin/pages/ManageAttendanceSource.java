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

public class ManageAttendanceSource {
	
	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public ManageAttendanceSource(WebDriver driver) throws Exception {

		this.driver = driver;
	}
	
	private By Togglelinkation=By.xpath("//span[@id='tooglebtn']");
	private By Admin = By.xpath(" //div[@class='menutext'][contains(text(),'Admin')]");
	private By ManageAttendanceSourse = By.xpath("//a[@id='ctl00_liSourceConfiguration']");
	private By Costcenter = By.xpath("//select[@id='ddlCostCentre']");
	private By Department = By.xpath("//select[@id='ddlDepartment']");
	private By SubDepartment = By.xpath("//select[@id='ddlsubdepartment']");
	private By SkillSet = By.xpath("//select[@id='ddlSkillset']");
	private By SubSkillSet = By.xpath("//select[@id='ddlSubSkillset']");
	private By Type = By.xpath("//select[@id='ddlType']");
	private By Primarysource = By.xpath("//select[@id='ddlSource']");
    private By ADD = By.xpath("//input[@id='ctl00_MainContent_btnSave']");
	private By Edit = By.xpath("//span[contains(text(),'Joint')]//following::td[13]//a[@class='fa fa-edit']");
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

	
	public void getManageAttendanceSourse() throws InterruptedException {

		Thread.sleep(2000);
		WebElement manageAttendanceSourse = driver.findElement(ManageAttendanceSourse);
		manageAttendanceSourse.click();
           Log.info("MangeAttendanceSource is selected");
	}

	
	public void getSubDepartment() throws InterruptedException {

		Thread.sleep(2000);
	
		Select subDepartment=new Select (driver.findElement(SubDepartment));

		 
		subDepartment.selectByVisibleText("HR_Operations");
			
		
			 
        Log.info("SubDepartment drop down is selected");
	}
	
	public void getSkillSet() throws InterruptedException {

		Thread.sleep(2000);
	
		Select costcenter=new Select (driver.findElement(SkillSet));

		 
		costcenter.selectByVisibleText("HR OPERATIONS");
			
		
			 
        Log.info("SkillSet drop down is selected");
	}
	
	public void getCostcenter() throws InterruptedException {

		Thread.sleep(2000);
	
		Select costcenter=new Select (driver.findElement(Costcenter));

		 
		costcenter.selectByVisibleText("Joint");
			
		
			 
        Log.info("coscenter drop down is selected");
	}
	
	public void getDepartment() throws InterruptedException {

		Thread.sleep(2000);
	
		Select costcenter=new Select (driver.findElement(Department));

		 
		costcenter.selectByVisibleText("HR_Operations");
			
		
			 
        Log.info("Department drop down is selected");
	}
	
	public void getSubSkillSet() throws InterruptedException {

		Thread.sleep(2000);
	
		Select costcenter=new Select (driver.findElement(SubSkillSet));
        
		costcenter.selectByVisibleText("HR OPERATIONS");
		 
        Log.info("SubSkillSet drop down is selected");
	}
	
	public void getType() throws InterruptedException {

		Thread.sleep(2000);
	
		Select costcenter=new Select (driver.findElement(Type));
        
		costcenter.selectByVisibleText("NCT");
		 
        Log.info("Type drop down is selected");
	}
	
	public void getPrimarysource() throws InterruptedException {

		Thread.sleep(2000);
	
		Select costcenter=new Select (driver.findElement(Primarysource));
        
		costcenter.selectByVisibleText("Smart");
		 
        Log.info("Primarysource drop down is selected");
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
		/*List<WebElement>datetimer=driver.findElements(Edit);
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
			
		}*/
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
