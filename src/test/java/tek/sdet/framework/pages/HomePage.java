package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class HomePage extends BaseSetup {
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
    @FindBy(xpath ="//a[text()='TEKSCHOOL']")
    public WebElement tekSchoolLogo;
    
    @FindBy(xpath ="//select[@id='search']")
    public WebElement clickOnAllSection;
    
    @FindBy(xpath = "//select[@id='search']")
    public WebElement allDeprtment;
    
    @FindBy(xpath = "//span[text()='Electronics']")
    public WebElement electronics;
    
    @FindBy(xpath = "//span[text()='Computers']]")
    public WebElement computers;
    
    @FindBy(xpath = "//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/div[2]/div[4]")
    public WebElement sports;
    
    @FindBy(xpath = "//span[text()='Automative']")
    public WebElement automative;
    
    @FindBy(xpath = "//div[@class='sidebar_content-item']/Span")
    public List<WebElement> sidebarAllDepartment;
    
    @FindBy(name = "email")
    public WebElement emailField;
    
    @FindBy(name = "password")
    public WebElement passwordField;
    
    @FindBy(xpath = "//span[contains(text(),'Smart Home')]")
    public WebElement smartHome;
    
    @FindBy(id = "searchInput")
    public WebElement searchBar;
    
    @FindBy(xpath = "//p[@class='products__name']")
    public WebElement products;
    
    @FindBy(id = "searchBtn")
    public WebElement searchIcon;
    
    @FindBy(xpath = "//select[@class='product__select']")
    public WebElement quantity;
    
    @FindBy(xpath = "//option[contains(text(),'2')]")
	public WebElement cartQuantityConfirmationQty2;
    
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	public WebElement addQty;
    
    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCartBtn;
    
    @FindBy(id = "cartBtn")
    public WebElement cartBtnIcon;

    @FindBy(xpath = "//div[@id='cartBtn']")
    public WebElement cartBtnOption;
    
    @FindBy(id = "proceedBtn")
    public WebElement proceedCheckoutBtn;
    
    @FindBy(xpath = "//select[@id='countryDropdown']")
    public WebElement country;
    
    @FindBy(xpath = "//option[contains(text(),'United States')]")
    public WebElement countrySelection;
    
    @FindBy(id = "fullNameInput")
    public WebElement fullNameField;
    
    @FindBy(id = "phoneNumberInput")
    public WebElement phoneNumberField;
    
    @FindBy(id = "addAddressBtn")
    public WebElement addNewAddress;
    
    @FindBy(id = "streetInput")
    public WebElement streetAddressField;
    
    @FindBy(id = "cityInput")
    public WebElement cityfield;

    @FindBy(id = "zipCodeInput")
    public WebElement zipcodeField;
    
    @FindBy(xpath = "//select[@name='state']")
    public WebElement stateField;
    
    @FindBy(id = "apartmentInput")
    public WebElement apartment;
    
    @FindBy(xpath = "//button[@class='account__btn-submit']")
    public WebElement addressBtn;
    
    @FindBy(id = "/div[contains(text(),'Address Added Successfully')]")
    public WebElement addressSuccessfullMasseg;
    
    @FindBy(xpath = "//button[@class='checkout__payment-btn']")
    public WebElement addCreditOrDebitCard;
    
    @FindBy(xpath = "//input[@class='account__payment-new-input']")
    public WebElement cardNumberField;
    
    @FindBy(id = "nameOnCardInput")
    public WebElement nameOnCardField;
    
    @FindBy(id = "expirationMonthInput")
    public WebElement expirationMonth;
    
    @FindBy(id = "//select[@value='8']")
    public WebElement expirationMonthConfiguration;
    
    @FindBy(id = "expirationYearInput")
    public WebElement expirationYear;
    
    @FindBy(id = "//select[@value='2025']")
    public WebElement expirationYearConfiguration;
    
    @FindBy(id = "securityCodeInput")
    public WebElement securityCodField;
    
    @FindBy(id = "paymentSubmitBtn")
    public WebElement addYourCardBtn;
    
 @FindBy(xpath = "// div[text()='Payment Method added sucessfully']")
 public WebElement cardAddedSuccessfully;
 
 @FindBy(id = "placeOrderBtn")
 public WebElement placeOrderBtn;

 @FindBy(xpath = "//div[text()='Order Placed Successfully']")
 public WebElement placeOrderConfirmationMsg;
 
 @FindBy(xpath = "//span[text()='Electronics']")
 public WebElement ElectronicsChanged;
 
 @FindBy(xpath = "//div[contains(text(),'Order Placed Successfully')]")
 public WebElement messageDisplayedSuccessfully;

}
