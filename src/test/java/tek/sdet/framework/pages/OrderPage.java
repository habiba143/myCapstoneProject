package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class OrderPage extends BaseSetup{
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}	
	@FindBy(id = "orderLink")
	public WebElement orderBtn;
	
	@FindBy(xpath = "//h1[contains(text(),'Your Orders')]")
	public WebElement firstOrderInList;
	
	@FindBy(xpath = "//button[@id='cancelBtn']")
	public WebElement cancelOrderBtn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement cancelationReason;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]")
	public WebElement cancelationSuccessMassage;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement cancelationBtn;
	
	@FindBy(xpath = "//button[@id='returnBtn']")
	public WebElement returnItemBtn;

	@FindBy(xpath = "//select[@name='reason']")
	public WebElement returnReason;
	
	@FindBy(xpath = "//select[@name='dropOff']")
	public WebElement dropOff;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement returnBtn;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement returnSuccessMessage;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineField;

	@FindBy(id = "descriptionInput")
	public WebElement reviewField;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addReviewBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement addReviewSuccessMessage;

}

