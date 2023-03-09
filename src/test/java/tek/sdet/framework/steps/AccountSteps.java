package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();

	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
	    click(factory.accountPage().accountBtn);
	    logger.info("user clicked on account button");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phonNumber) {
		clearTextUsingSendKeys(factory.accountPage().profileNameField);
		sendText(factory.accountPage().profileNameField, name);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneField);
		sendText(factory.accountPage().profilePhoneField, phonNumber);
		logger.info("user updated name and phone number in profile page");

	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		waitTillPresence(factory.accountPage().profileUpdateBtn);
	    click(factory.accountPage().profileUpdateBtn);
	    logger.info("user clicked on update button");
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().UpdatedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().UpdatedSuccessfullyMessage));
		logger.info("user profile information updated successfully");
	   
	}
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> PasswordChangeField = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword, PasswordChangeField.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPassword, PasswordChangeField.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmNewPassword, PasswordChangeField.get(0).get("confirmPassword"));
		logger.info("User entered required information");
	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		waitTillClickable(factory.accountPage().changePasswordBtn);
		click(factory.accountPage().changePasswordBtn);
		logger.info("User clicked on Change Password button");
	}
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().passwordUpdateSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdateSuccessfullyMessage));
		logger.info("a message displayed ‘Password Updated Successfully’");
		
	}
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	    click(factory.accountPage().addPaymentMethodLink);
	    logger.info("user clicked on add payment method link");
	}
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountPage().PaymentMethodAddedSuccesfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodAddedSuccesfullyMessage));
		logger.info("a message displayed ‘Payment Method added successfully’");
	}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editcardBtn);
		logger.info("User clicked on Edit button of card section");
	    
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> EditCardInfo = dataTable.asMaps(String.class, String.class);
		waitTillPresence(factory.accountPage().updateCardBtn);
		clearTextUsingSendKeys(factory.accountPage().updateCardNumberField);
		sendText(factory.accountPage().updateCardNumberField, EditCardInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().updateNameOnCardField);
		sendText(factory.accountPage().updateNameOnCardField, EditCardInfo.get(0).get("nameOnCard"));
		selectByIndex(factory.accountPage().updateCardExpirationMonthInput, 3);
		selectByIndex(factory.accountPage().UpdateCardExpirationYearInput, 3);
		clearTextUsingSendKeys(factory.accountPage().updateCardSecurityCodeInnput);
		sendText(factory.accountPage().updateCardSecurityCodeInnput, EditCardInfo.get(0).get("securityCode"));
		logger.info("user successfully edited information with required data");
	}	    
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		waitTillPresence(factory.accountPage().updateCardBtn);
		click(factory.accountPage().updateCardBtn);
		logger.info("user clicked on update your card button");
	    
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().updatePaymentMethodSuccesMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatePaymentMethodSuccesMessage));
		logger.info("a message displayed successfully");
	    
	}



}
