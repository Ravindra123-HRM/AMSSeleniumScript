package com.ams.qa.usermangement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ams.qa.base.Log;

public class AssignCostCenter {
	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public AssignCostCenter(WebDriver driver) throws Exception {

		this.driver = driver;
	}

	private By AssignCostCenter = By.id("ctl00_liAssignRights");
	private By Role = By.id("ddlRole");
	private By Employee = By.id("ddlEmployee");
	private By checkbox=By.id("ctl00_MainContent_allChkBox");
	private By ADD = By.xpath("//input[@id='ctl00_MainContent_btnAdd']");
	private By Edit = By.xpath("//span[contains(text(),'Contract')]//following::td[3]//a[@class='fa fa-edit']");
	private By update = By.xpath("//input[@id='ctl00_MainContent_btnUpdate']");
	
	
	public void getAssignCostCenter() throws InterruptedException {

		Thread.sleep(2000);
		WebElement assignRoles = driver.findElement(AssignCostCenter);
		assignRoles.click();
           Log.info("AssignRoles is selected");
	}

	
	
public void getRole() throws InterruptedException {

		
		Thread.sleep(2000);
		Select modules=new Select (driver.findElement(Role));
	    modules.selectByVisibleText("Contract");
	     Log.info("Employee is selected");
	}

public void getEmployee() throws InterruptedException {
    Thread.sleep(5000);
	Select modules=new Select (driver.findElement(Employee));
   modules.selectByVisibleText("Ravindra Chavan (103760)");
    Log.info("Role for employee is selected");
}

	
	public void getCheckbox() throws InterruptedException {

		
		
		driver.findElement(checkbox).click();
        
		  
		  Log.info("click on checkBox is selected");
	}
	
	public void getAdd() throws InterruptedException {

		Thread.sleep(2000);
		WebElement add = driver.findElement(ADD);
		add.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
        Log.info("Add button is selected");
	}
	
	public void getEdit() throws InterruptedException {

		Thread.sleep(3000);
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
