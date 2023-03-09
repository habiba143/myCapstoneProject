package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class AccountPage extends BaseSetup {
	public AccountPage () {
		PageFactory.initElements(getDriver(), this);
	}	
	
	@FindBy(id = "profileImage")
	public WebElement profilePicture;
	
	@FindBy(id = "nameInput")
	public WebElement profileNameField;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneField;
	
	@FindBy(xpath = "//button[@class='account__btn-submit']")
	public WebElement profileUpdateBtn;
	
	@FindBy(css = "#emailInput")
	public WebElement profileEmailfield;
	
	@FindBy(id = "accountLink")
	public WebElement accountBtn;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement UpdatedSuccessfullyMessage;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPassword;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmNewPassword;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePasswordBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passwordUpdateSuccessfullyMessage;

	@FindBy(xpath = "//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement addPaymentMethodLink;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement PaymentMethodAddedSuccesfullyMessage;


	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	public WebElement editcardBtn;
	
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement updateCardNumberField;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement updateNameOnCardField;
	
	@FindBy(xpath = "//select[@name='expirationMonth']")
	public WebElement updateCardExpirationMonthInput;

	
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement UpdateCardExpirationYearInput;
	
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement updateCardSecurityCodeInnput;

	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement updateCardBtn;
		
	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement updatePaymentMethodSuccesMessage;
		

}
