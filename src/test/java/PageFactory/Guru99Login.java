package PageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login {
	/**
	 * 
	 * All WebElements are identified by @FindBy annotation
	 * 
	 */

	WebDriver driver;

	@FindBy(xpath = "//input[@name='uid']")

	WebElement user99GuruName;
	
	

	@FindBy(xpath = "//input[@type='password']")

	WebElement password99Guru;
	
	

	@FindBy(xpath = "//h2[contains(.,'Guru99 Bank')]")

	WebElement titleText;
	
	

	@FindBy(xpath = "//input[@type='submit']")

	WebElement login;

	
	
	public Guru99Login(WebDriver driver) {
		
		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}
	
	// Set user name in textbox
	
	public void setUserName(String strUserName) {
		
		user99GuruName.sendKeys(strUserName);
	}
	
	
	// Set password in textbox
	
	public void setPassword(String strPassword) {
		
		password99Guru.sendKeys(strPassword);
	}
	
	
	// Click on login button
	
	public void clickLogin() {
		
		login.click();
	}
	
	
	// Get title of Login Page
	
	public String getLoginTitle() {
		
		return titleText.getText();
		
	}
	
	/**
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPassword
	 * 
	 * @return
	 * 
	 */
	
	public void loginToGuru99(String strUserName, String strPassword) {
		
		// Fill user name
		
		this.setUserName(strUserName);
		
		// Fill password
		
		this.setPassword(strPassword);
		
		// Click Login button
		
		this.clickLogin();
	}
	

}
