package org.pafefactory;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	WebElement usertextbox;

	
	@FindBy(name="password")
	WebElement passwordtextbox;
	
	@FindBy(name="login")
	WebElement loginbutton;
	

	public void loginPageMethods(String username,String Password) {
	
		usertextbox.sendKeys(username);
		
		passwordtextbox.sendKeys(Password);
		
		loginbutton.click();
	}}
	
	

	
	

