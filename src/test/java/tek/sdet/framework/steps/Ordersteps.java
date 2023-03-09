package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class Ordersteps extends CommonUtility {
	private POMFactory factory = new POMFactory();

	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	   click(factory.orderPage().orderBtn);
	   logger.info("user clicked on order button");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().firstOrderInList);
		   logger.info("user clicked on first order ");
	    
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelOrderBtn);
		   logger.info("user clicked on cancel order button");
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String string) {
		selectByIndex(factory.orderPage().cancelationReason, 1);
		logger.info("user selected the cancelation reason");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelationBtn);
		   logger.info("user clicked on cancel order button");
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelationSuccessMassage));
		   logger.info("cancelation message displayed successfully");
}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		waitTillPresence(factory.orderPage().returnItemBtn);
		click(factory.orderPage().returnItemBtn);
		   logger.info("user clicked on return button");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String string) {
		selectByIndex(factory.orderPage().returnReason, 2);
		logger.info("user selected the return reason item damage");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String string) {
		waitTillPresence(factory.orderPage().dropOff);
		selectByIndex(factory.orderPage().dropOff, 2);
		logger.info("user selected the drop off");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		waitTillPresence(factory.orderPage().returnBtn);
		click(factory.orderPage().returnBtn);
		   logger.info("user clicked on return order button");
	    
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String string) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnSuccessMessage));
		   logger.info("cancelation message displayed successfully");
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewBtn);
		waitTillPresence(factory.orderPage().reviewBtn);
		   logger.info("user clicked on return order button");
	    
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String review) {
	    sendText(factory.orderPage().headlineField, headline);
	    sendText(factory.orderPage().reviewField, review);
	    logger.info("user wrote a review ");

	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addReviewBtn);
		   logger.info("user clicked on add your review button");
	    
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewSuccessMessage) {
		waitTillPresence(factory.orderPage().addReviewSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().addReviewSuccessMessage));
		logger.info("review message displayed successfully");
	    
	}


}
