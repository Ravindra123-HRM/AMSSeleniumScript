package com.ams.qa.usermangement.pages;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ams.qa.base.Log;

public class AssignRoles {
	
	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public AssignRoles(WebDriver driver) throws Exception {

		this.driver = driver;
	}

	private By AssignRoles = By.xpath("//a[contains(text(),'Assign Roles')]");
	private By EmployeeName = By.xpath("//input[@class='autosuggest form-control ui-autocomplete-input']");
	private By Modules = By.id("ctl00_MainContent_chkbModules");
	private By ADD = By.xpath("//input[@id='ctl00_MainContent_btnAdd']");
	private By Edit = By.xpath("//span[contains(text(),'Ravindra Chavan (103760) ')]//following::td[6]//a[@class='fa fa-edit']");
	private By update = By.xpath("//input[@id='ctl00_MainContent_btnUpdate']");
	
	
	public void getAssignRoles() throws InterruptedException {

		Thread.sleep(2000);
		WebElement assignRoles = driver.findElement(AssignRoles);
		assignRoles.click();
           Log.info("AssignRoles is selected");
	}

	
	public void getEmployeeID() throws InterruptedException {

		
		WebElement employeeName = driver.findElement(EmployeeName);
		employeeName.click();
		employeeName.sendKeys("103760");
		Thread.sleep(3000);
		employeeName.sendKeys(Keys.ARROW_DOWN);
        employeeName.sendKeys(Keys.ENTER);
	     Log.info("Employee ID has enter value");
	}
	
	
	public void getCheckbox() throws InterruptedException {

		
		
		
		String[] names= {"HR","Admin"};//div[@class='block_content']//following::label//a
   	 List<WebElement> Size= driver.findElements(By.xpath("//input[@type='checkbox']//following::label"));
   
		  int j=0;
		 
		 // WebElement Name=driver.findElement(By.xpath("//label[@for='layered_id_attribute_group_1']//a[contains(text(),'S')]"));
		  
		    for(int i=0;i<Size.size();i++)
		    {
		    		String[] check=Size.get(i).getText().split(" ");
		    		 System.out.println(check);
		    		String formattedName=check[0].trim();
		   
		    		List checkboxlist=Arrays.asList(names);
		    		if(checkboxlist.contains(formattedName))
		    		{
		    			j++;
		        Thread.sleep(2000);
		    	driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
               if(j==names.length)//ul[@class='col-lg-12 layered_filter_ul']//li//div
		    	{
		    	break;
		    	}
		    	
		    		}
		    	 
		     }
	
		//driver.findElement(By.id("ctl00_MainContent_chkbRoles_20")).click();
        
		  
		  Log.info("RolesName has enter value");
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
