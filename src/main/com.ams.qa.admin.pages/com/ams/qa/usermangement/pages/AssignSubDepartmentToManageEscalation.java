package com.ams.qa.usermangement.pages;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ams.qa.base.Log;

public class AssignSubDepartmentToManageEscalation {
	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public AssignSubDepartmentToManageEscalation(WebDriver driver) throws Exception {

		this.driver = driver;
	}

	private By AssignSubDepartmentToManageEscalation = By.xpath("//a[contains(text(),'Assign Sub Departments to Manage Escalations')]");
	private By Role = By.id("ddlRole");
	private By Employee = By.id("ddlEmployee");
	private By checkbox=By.id("ctl00_MainContent_allChkBox");
	private By CostCenter=By.id("ddlCostCentre");
	private By ADD = By.xpath("//input[@id='ctl00_MainContent_btnAdd']");
	private By Edit = By.xpath("//span[contains(text(),'Manaswi Humbe (104043)')]//following::td[4]//a[@class='fa fa-edit']");
	private By update = By.xpath("//input[@id='ctl00_MainContent_btnUpdate']");
	
	
	public void getAssignSubDepartmentToManageEscalation() throws InterruptedException {

		Thread.sleep(2000);
		WebElement assignRoles = driver.findElement(AssignSubDepartmentToManageEscalation);
		assignRoles.click();
           Log.info("AssignSubDepartmentToManageEscalation is selected");
	}

	
	
public void getRole() throws InterruptedException {

		
		Thread.sleep(2000);
		Select modules=new Select (driver.findElement(Role));
	    modules.selectByVisibleText("HR");
	     Log.info("Role  is selected");
	}

public void getEmployee() throws InterruptedException {
    Thread.sleep(5000);
	Select modules=new Select (driver.findElement(Employee));
   modules.selectByVisibleText("Maria D'Souza (6476)");
    Log.info(" Employee Name is selected");
}

public void getCostCenter() throws InterruptedException {
    Thread.sleep(5000);
	Select costcenter=new Select (driver.findElement(CostCenter));
   costcenter.selectByVisibleText("Relish");
    Log.info(" Employee Name is selected");
}

	public void getSubDepartment() throws InterruptedException {
		
		List<WebElement> ListOfCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		  System.out.println("Number of check boxes present are: "+ListOfCheckBoxes.size());
		 for(WebElement ele:ListOfCheckBoxes)
		 {
			 ele.click(); 
		 }
		  
		  Log.info("click on checkBox is selected");
	}
		
       // driver.findElement(checkbox).click();
        
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
		 Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-2000,0)");
		WebElement Update = driver.findElement(update);
		Update.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
        Log.info("Update button is selected");
	   }


}
