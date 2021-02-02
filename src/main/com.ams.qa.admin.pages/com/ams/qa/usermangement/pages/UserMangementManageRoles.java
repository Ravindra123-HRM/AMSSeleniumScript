
package com.ams.qa.usermangement.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ams.qa.base.Listeners;
import com.ams.qa.base.Log;
public class UserMangementManageRoles {
	
	


		
		
		
			public WebDriver driver;

			// private static Logger logger=Logger.getLogger(Log.class.getName());

			public UserMangementManageRoles(WebDriver driver) throws Exception {

				this.driver = driver;
			}
			
			private By Togglelinkation=By.xpath("//span[@id='tooglebtn']");
			private By Usermanagement = By.xpath("//div[contains(text(),'User Management')]");
			private By MangeRoles = By.xpath("//a[contains(text(),'Manage Roles')]");
			private By RolesName = By.cssSelector("input.form-control");
			private By Modules = By.id("ctl00_MainContent_chkbModules");
			private By ADD = By.id("ctl00_MainContent_btnAdd");
			private By Edit = By.xpath("//span[contains(text(),'Contract')]//following::td[6]//a[@class='fa fa-edit ']");
			private By update = By.xpath("//input[@id='ctl00_MainContent_btnUpdate']");
			
			
			
			public void getToggleLinkbutton() throws InterruptedException {
				Thread.sleep(2000);
				WebElement userregisteration = driver.findElement(Togglelinkation);
				userregisteration.click();
	           Log.info("Togglelinkation  is selected");

			}
			
			public void getUserMnagement() throws InterruptedException {
				Thread.sleep(2000);
				WebElement usermanagement = driver.findElement(Usermanagement);
				usermanagement.click();
	           Log.info("Usermanagement is selected");

			}

			
			public void getManagerRoles() throws InterruptedException {

				Thread.sleep(2000);
				WebElement mangeRoles = driver.findElement(MangeRoles);
				mangeRoles.click();
		           Log.info("MangeRoles is selected");
			}

			
			public void getRoles() throws InterruptedException {

				Thread.sleep(2000);
				WebElement rolesName = driver.findElement(RolesName);
				rolesName.sendKeys("Contract");
	            Log.info("RolesName has enter value");
			}
			public void getModules() throws InterruptedException {

				Thread.sleep(2000);
			
				Select modules=new Select (driver.findElement(Modules));
		
				 
					 modules.selectByVisibleText("AMA Report");
					 modules.selectByVisibleText("AMS LMS View Mapping");
					 modules.selectByValue("19");
					 modules.selectByValue("26");
					
				
					 
	            Log.info("Modules is selected");
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
				WebElement edit = driver.findElement(Edit);
				edit.click();
	            Log.info("Edit is selected");
			}

			public void getUpdate() throws InterruptedException {

				Thread.sleep(3000);
				WebElement Update = driver.findElement(update);
				Update.click();
	            Log.info("Update button is selected");
			   }

}

