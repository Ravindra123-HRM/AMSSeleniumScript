package com.ams.qa.usermangement.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ams.qa.base.Log;

public class AssignReports {
	
	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public AssignReports(WebDriver driver) throws Exception {

		this.driver = driver;
	}

	private By AssignReports = By.xpath("//a[@title='Assign Reports']");
	private By Role = By.id("ddlRole");
	private By Employee = By.id("ddlEmployee");
	private  By Reports=By.id("ctl00_MainContent_chkbReports");
	private By ADD = By.xpath("//input[@id='ctl00_MainContent_btnAdd']");
	private By Edit = By.xpath("//span[contains(text(),'Contract')]//following::td[2]//a[@class='fa fa-edit']");
	private By update = By.xpath("//input[@id='ctl00_MainContent_btnUpdate']");
	
	
	public void getAssignReports() throws InterruptedException {

		Thread.sleep(2000);
		WebElement assignRoles = driver.findElement(AssignReports);
		assignRoles.click();
           Log.info("AssignReports is selected");
	}

	
	
public void getRole() throws InterruptedException {

		
		Thread.sleep(2000);
		Select modules=new Select (driver.findElement(Role));
	    modules.selectByVisibleText("Contract");
	     Log.info("Role is selected");
	}

public void getReports() throws InterruptedException {
    Thread.sleep(5000);
	Select modules=new Select (driver.findElement(Reports));
     modules.selectByVisibleText("AMS Common Reports");
    Log.info("Reprts for employee is selected");
}

	
	
	public void getAdd() throws InterruptedException {

		Thread.sleep(2000);
		WebElement add = driver.findElement(ADD);
		add.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
        Log.info("Add button is selected");
	}
	
	public void getPagination() throws InterruptedException
	{
		List<WebElement> pagination=driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed']/tbody//tr[12]//following::a"));
		System.out.println(pagination.size());
		
		for(int i=0;i<pagination.size();i++)
		{
			pagination.get(i).click();
			
			 Thread.sleep(2000);
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("scroll(0, 300)");
			WebElement edit = driver.findElement(Edit);
			edit.click();
			Log.info("Edit is selected");
			
		
		}
		
	}
	
	/*public void getEdit() throws InterruptedException {

		Thread.sleep(3000);
		
		
		
	}*/
	
	public void getUpdate() throws InterruptedException {
		
		Thread.sleep(2000);
		Select modules=new Select (driver.findElement(Reports));
	    modules.selectByVisibleText("AMS Anywhere Office Report");
         Log.info("Report Value is selected");
        WebElement Update = driver.findElement(update);
		Update.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
        Log.info("Update button is selected");
	   }


}
