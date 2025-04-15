package dsAlgo_stepDefinition;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.Register_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class Register_SD {

	WebDriver driver = driverfactory.getDriver();
	public Register_PF register = new Register_PF(driver);

	@Given("The user is on the home page")
	public void the_user_is_on_the_home_page() {
		String url = ConfigReader.getApplicationUrl();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@When("The user clicks {string} link on the Home page")
	public void the_user_clicks_link_on_the_home_page(String string) {
		register.Register();

	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		String url = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(url, "https://dsportalapp.herokuapp.com/register");
		System.out.println("user is in register form");

	}

	@Given("The user is on the user registration page")
	public void the_user_is_on_the_user_registration_page() {
		String url = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(url, "https://dsportalapp.herokuapp.com/register");
		System.out.println("user is in register form");
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
		System.out.println("--------------------------");
		register.register1();
	}

	@Then("The error {string} appears below Username textbox")
	public void the_error_appears_below_username_textbox(String string) {
		System.out.println("=================================================================================");
		register.validationmessage();
	}

	@When("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() throws IOException {
		String username = ExcelReader.getvalidusername();
		register.setUserName(username);
		register.register1();
	}

	@Then("The error message {string} appears below Password textbox")
	public void the_error_message_appears_below_password_textbox(String string) {
		System.out.println("=================================================================================");
		register.validationmessage();
	}

	@When("The user clicks Register button after entering Password and Username with Password Confirmation empty")
	public void the_user_clicks_register_button_after_entering_password_and_username_with_password_confirmation_empty()
			throws IOException {
		String password = ExcelReader.getvalidpassword();
		register.setPassword(password);
		register.register1();
	}

	@Then("The error message {string} appears below Password Confirmation textbox")
	public void the_error_message_appears_below_password_confirmation_textbox(String string) {
		System.out.println("=================================================================================");
		register.validationmessage();
	}

	
	@When("The user clicks Register button after entering a username with spacebar characters other than digits and Special Characters")
	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and_special_characters() throws IOException {
		register.clearusername();
		String invalidusername = ExcelReader.getinvalidusername();
		register.setUserName(invalidusername);
		String password = ExcelReader.getvalidpassword();
		register.setPassword(password);
		register.setPasswordConfirm(password);
		register.register1();
	}

	@Then("The user is not able to see error msg after entering invalid data")
	public void the_user_is_not_able_to_see_error_msg_after_entering_invalid_data() {
		System.out.println("=================================================================================");
		String actualMessage = register.ErrorMessage();
		String expectedMessage = "Invalid username";
		Assertion assertion = new Assertion();
		assertion.assertEquals(actualMessage, expectedMessage);
	}

	@When("The user clicks Register button after entering a password with numeric data")
	public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data() throws IOException {
		
		String username = ExcelReader.getvalidusername();
		register.setUserName(username);
		register.clearpwd();
		String invalidpassword = ExcelReader.getinvalidpassword();
		register.setPassword(invalidpassword);
		register.setPasswordConfirm(invalidpassword);
		register.register1();
	}

	@Then("The user is not able to see error msg after entering invalid password")
	public void the_user_is_not_able_to_see_error_msg_after_entering_invalid_password() {
		String actualMessage = register.ErrorMessage();
		String expectedMessage = "Invalid password";
		Assertion assertion = new Assertion();
		assertion.assertEquals(actualMessage, expectedMessage);
	}

	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields()
			throws IOException {
		register.clearpwd();
		String password = ExcelReader.getvalidpassword();
		register.setPassword(password);
		String invalidpassword = ExcelReader.getinvalidpassword();
		register.setPasswordConfirm(invalidpassword);
		register.register1();

	}

	@Then("The user should able to see an password warning message {string}")
	public void the_user_should_able_to_see_an_password_warning_message(String string) {
		String emsg = register.ErrorMessage();
		System.out.println("===================================");
		System.out.println(emsg);
	}

	@When("The user clicks Register button after entering with valid username, password and password confirmation in related textboxes")
	public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes()
			throws Exception {
		register.clearpwd();
		String username = ExcelReader.getvalidusername() + "." + System.currentTimeMillis();
		register.setUserName(username);
		String password = ExcelReader.getvalidpassword();
		register.setPassword(password);
		register.setPasswordConfirm(password);
		register.register1();
		Thread.sleep(1000L);
	}

	@Then("The user should be redirected to Home Page of DS Algo with message {string}")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message(String string) {
		String accmsg = register.acccreatedmessage();
		System.out.println("===================================");
		System.out.println(accmsg);
	}

	@When("The user clicks {string} Sign out link on the Home page")
	public void the_user_clicks_sign_out_link_on_the_home_page(String string) {
		// register.signout();
	}

	@Then("The user should be redirected to home page with message \"Logged out successfully\"Logged out successfully")
	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully_logged_out_successfully() {
//		String logmsg = register.logoutmessage();
//		System.out.println("===================================");
//		System.out.println(logmsg);
	}

}

