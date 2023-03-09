package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class SignInPage extends BaseSetup {
	
	public SignInPage () {
		PageFactory.initElements(getDriver(), this);
		
	}
//	@FindBy(xpath ="//a[text()='TEKSCHOOL']")
//	public WebElement tekSchoolLogo;
	
	@FindBy(id = "signinLink")
	public WebElement signInOption;
	
	@FindBy(name = "email")
	public WebElement emailField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(id = "loginBtn")
	public WebElement logInButton;
	
	@FindBy(id = "accountLink")
	public WebElement accountOption;
	
	@FindBy(id = "newAccountBtn")
	public WebElement createNewAccountBtn;
	
	@FindBy(id = "//h1[@class='signup__subtitle']")
	public List<WebElement> signUpInfo;
	
	@FindBy(id = "signupBtn")
	public WebElement signUpBtn;
	
	@FindBy(id = "nameInput")
	public WebElement accountNameField;
	
	@FindBy(id = "emailInput")
	public WebElement accountEmailField;
	
	@FindBy(id = "passwordInput")
	public WebElement accountPasswordField;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement confirmPasswordField;
	
	@FindBy(xpath = "//h1[@class='account__information-username']")
	public WebElement logInAccountPage;

}
