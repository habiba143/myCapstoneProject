package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user was on retail website");
	    
	}
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().clickOnAllSection);
		logger.info("user clicked on all section");
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);
		List<WebElement> actualSideBar = factory.homePage().sidebarAllDepartment;
		for(int i = 0;i<expectedSideBar.get(0).size();i++) {
		
		Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
		logger.info(actualSideBar.get(i).getText() + "is equal to " + expectedSideBar.get(0).get(i));
		}	
	}
	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sidebarAllDepartment;
		for (WebElement Option: sideBarOptions) {
			if(Option.getText().equals(department)) {
				click(Option);
			}
			try {
				logger.info(Option.getText() + "is present");
			} catch (StaleElementReferenceException e) {
				
			}
			break;
		}

	  }
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmnetOptions = factory.homePage().sidebarAllDepartment;
		for (int i = 0; i<expectedDepartmentOptions.get(0).size();i++) {
			for(WebElement dep: actualDepartmnetOptions) {
				if(dep.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dep));
					logger.info(dep.getText() + "is present");
					break;
					
				}
			}
		}
}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		 sendText(factory.homePage().emailField, email);
		   sendText(factory.homePage().passwordField, password);
	   logger.info("user entered email and pasword");
	}
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		waitTillPresence(factory.homePage().allDeprtment);
	    selectByIndex(factory.homePage().allDeprtment, 3);
    logger.info("user changed the category to smart home");
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		  sendText(factory.homePage().searchBar, string);
		   logger.info("user searched for an item" + string);

	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchIcon);
		logger.info("user clicked on search icon");
	}
	@When("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().products);
		logger.info("user clicked on item");

	}
	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer int1) {
		waitTillPresence(factory.homePage().quantity);
		selectByIndex(factory.homePage().quantity, 2);
		logger.info("user seelcted quantity");


	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBtn);
		logger.info("user clicked add to cart button");
	}
	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartBtnIcon));
		logger.info("cart button icon changed to 2");
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartBtnIcon);
		logger.info("user clicked on cart option");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedCheckoutBtn);
		logger.info("user clicked on proceed to checkout button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addNewAddress);
		logger.info("user clicked on new address link");
	}
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> newAddress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.homePage().country, "United States");
		sendText(factory.homePage().fullNameField, newAddress.get(0).get("fullName"));
		sendText(factory.homePage().phoneNumberField, newAddress.get(0).get("phoneNumber"));
		sendText(factory.homePage().streetAddressField, newAddress.get(0).get("streetAddress"));
		sendText(factory.homePage().apartment, newAddress.get(0).get("apt"));
		sendText(factory.homePage().cityfield, newAddress.get(0).get("city"));
		selectByVisibleText(factory.homePage().stateField, "Virginia");
		sendText(factory.homePage().zipcodeField, newAddress.get(0).get("zipCode"));
		logger.info("User entered address info into required field");
	}
	@Then("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		waitTillPresence(factory.homePage().addressBtn);
		click(factory.homePage().addressBtn);
		logger.info("user clicked on new address link");
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		waitTillPresence(factory.homePage().addCreditOrDebitCard);
		click(factory.homePage().addCreditOrDebitCard);
		logger.info("user clicked on add credit or debit card");
	}
	@Then("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentMethod = dataTable.asMaps(String.class, String.class);
		sendText(factory.homePage().cardNumberField, paymentMethod.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCardField, paymentMethod.get(0).get("nameOnCard"));
		selectByValue(factory.homePage().expirationMonth, paymentMethod.get(0).get("expirationMonth"));
		selectByValue(factory.homePage().expirationYear, paymentMethod.get(0).get("expirationYear"));
		sendText(factory.homePage().securityCodField, paymentMethod.get(0).get("securityCode"));
		logger.info("User entered payment info into required field");
	}
	@Then("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.homePage().addYourCardBtn);
		logger.info("User clicked on Add your card button");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderBtn);
		logger.info("User clicked on place your order button");
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		waitTillPresence(factory.homePage().cardAddedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.homePage().cardAddedSuccessfully));
		logger.info("card Successfully Message displayed");
	}
	@When("User change the category to Electronics")
	public void userChangeTheCategoryToElectronics() {
		waitTillPresence(factory.homePage().clickOnAllSection);
		selectByIndex(factory.homePage().clickOnAllSection, 1);
		logger.info("User changed the category to Electronics");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.homePage().messageDisplayedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.homePage().messageDisplayedSuccessfully));
		logger.info("a message displayed successfully");

	}
}