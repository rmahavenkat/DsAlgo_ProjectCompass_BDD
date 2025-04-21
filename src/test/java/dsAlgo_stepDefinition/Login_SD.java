package dsAlgo_stepDefinition;

import java.io.IOException;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.BasePageFactory;
import ds_Algo_PageFactory.Login_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_SD extends BasePageFactory {
	Assertion assertion = new Assertion();
	public Login_PF login = new Login_PF();
	BasePageFactory base = new BasePageFactory();

	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() throws InterruptedException {
		base.dsAlgoPageUrl();
	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
		login.clickSignin();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		System.out.println("user in login page");
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/login";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/login");

	}

	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		base.dsAlgoPageUrl();
	}

	@When("The user clicks login button after leaving the {string} textbox and {string} textbox empty")
	public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_empty(String string,
			String string2) {
		login.leaveUsernameBlank();
		login.leavePasswordBlank();
		login.clickLogin();
	}

	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String string) {
		String actualMessage = login.getValidationMessage(login.getUsernameField());
		String expectedMessage = "Please fill out this field.";
		assertion.assertEquals(actualMessage, expectedMessage, "Please fill out this field.");
	}

	@When("The user clicks login button after entering the {string} and leaves {string} textbox empty")
	public void the_user_clicks_login_button_after_entering_the_and_leaves_textbox_empty(String string, String string2)
			throws IOException {
		String username = ExcelReader.getvalidusername();
		login.enterUsername(username);
		login.leavePasswordBlank();
		login.clickLogin();
	}

	@Then("The login error message {string} appears below Password textbox")
	public void the_error_message_appears_below_password_textbox(String string) {
		String actualMessage = login.getValidationMessage(login.getPasswordField());
		String expectedMessage = "Please fill out this field.";
		assertion.assertEquals(actualMessage, expectedMessage, "Please fill out this field.");
	}

	@When("The user clicks login button after entering the Password only")
	public void the_user_clicks_login_button_after_entering_the_password_only() throws IOException {
		login.leaveUsernameBlank();
		// String password = ConfigReader.getpassword();
		String password = ExcelReader.getvalidpassword();
		login.enterPassword(password);
		login.clickLogin();
	}

	@When("The user clicks login button after entering invalid username and valid password")
	public void the_user_clicks_login_button_after_entering_invalid_username_and_valid_password()
			throws IOException, InterruptedException {
		String invalidusername = ExcelReader.getinvalidusername();
		String invalidpassword = ExcelReader.getinvalidpassword();
		login.enterUsername(invalidusername);
		login.enterPassword(invalidpassword);
		login.clickLogin();
	}

	@Then("The user should able to see an error message {string}.")
	public void the_user_should_able_to_see_an_error_message(String string) {
		String actualMessage = login.invalidCredentialsErrorMessage();
		String expectedMessage = "Invalid Username and Password";
		assertion.assertEquals(actualMessage, expectedMessage, "Invalid Username and Password");
	}

	@When("The user clicks login button after entering valid username and valid password")
	public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() throws IOException {
		String username = ExcelReader.getvalidusername();
		String password = ExcelReader.getvalidpassword();
		System.out.println("Username from config: " + username);
		System.out.println("Username from config: " + password);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
	}

	@Then("The user should land in Data Structure Home Page with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
		String messageText = login.loginSuccessMessage();
		// Verify the message is displayed
		Assert.assertEquals(messageText, "You are logged in");
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/home";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/home");
	}

	

}
