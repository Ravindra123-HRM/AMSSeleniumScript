package com.ams.qa.usermangement.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ams.qa.base.TestBase;




public class LoginPage extends TestBase {

	public LoginPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
		// driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="ddlCostCentres")
	WebElement costcenter;
	
	@FindBy(id="tbLoginId")
	WebElement username;
	
	@FindBy(id="tbPassword")
	WebElement password;
	
	@FindBy(id="ibLogin")
	WebElement Login;
	
	
	public Select costcenter() {

		Select costcenter1 = new Select(costcenter);
		costcenter1.selectByVisibleText("JOINT");
		return costcenter1;
	}
	
	public void Login(String un,String Pwd) throws Exception
	{
		username.sendKeys(un);
		password.sendKeys(Pwd);
		Login.click();
	}

}
