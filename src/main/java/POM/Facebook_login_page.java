package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login_page 
{
	//declaration
	//address of email text field
	@FindBy(id="email")
	private WebElement emailTf;
	
	//address of password text field
	@FindBy(name="pass")
	private WebElement passwordTf;
	
	//address of login button
	@FindBy(xpath="//button[@name='login']")
		private WebElement loginBtn;
	
	
	//initialization
	public  Facebook_login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
		//getter methods

	public WebElement getEmailTf() {
		return emailTf;
	}


	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}


	public WebElement getPasswordTf() {
		return passwordTf;
	}


	public void setPasswordTf(WebElement passwordTf) {
		this.passwordTf = passwordTf;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	//Business libraries
	
	public void emailTextfield(String data) {
		emailTf.sendKeys(data);
	}
	public void passwordtextfield(String data) {
		passwordTf.sendKeys(data);
	}
	public void loginButton() {
		loginBtn.click();
	}
}
