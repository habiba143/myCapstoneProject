package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().signInOption);
		logger.info("user clicked on signin option");
	}
	@And("And User enter email 'gulpato@gmail.com' and password 'Pato@123'")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered emial " + email + "and password " + password);
	}
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().logInButton);
		logger.info("user clicked on login button");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountOption));
	}
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountBtn);
		logger.info("user clicked on creat new Account button");

	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> newAccount = dataTable.asMaps(String.class, String.class);
		
		sendText(factory.signInPage().accountNameField, newAccount.get(0).get("name"));
		sendText(factory.signInPage().accountEmailField, newAccount.get(0).get("email"));
		sendText(factory.signInPage().accountPasswordField, newAccount.get(0).get("password"));
		waitTillPresence(factory.signInPage().confirmPasswordField);
		sendText(factory.signInPage().confirmPasswordField, newAccount.get(0).get("confirmPassword"));

		logger.info("User entered Account info into required field");
	    
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		waitTillPresence(factory.signInPage().signUpBtn);

		click(factory.signInPage().signUpBtn);
		logger.info("user clicked on signup button");
	    
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().logInAccountPage));
		logger.info("user loged in into Account page");
	}

}          
