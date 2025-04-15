package dsAlgo_stepDefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.DataStructure_PF;
import ds_Algo_PageFactory.Login_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructure_SD {
	WebDriver driver = driverfactory.getDriver();
	public Login_PF login = new Login_PF(driver);
	Assertion assertion = new Assertion();
	public DataStructure_PF datastruct = new DataStructure_PF(driver);

	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() throws IOException {
	
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/home";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks the {string} button in Data Structures - Introduction")
	public void the_user_clicks_the_button_in_data_structures_introduction(String string) {
		datastruct.clickGetStartedButton();
	}

	@Then("The user should land in {string} Data Structures- Introduction page")
	public void the_user_should_land_in_data_structures_introduction_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
		assertion.assertEquals(currenturl, expectedurl,
				"https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
		assertion.assertEquals(currenturl, expectedurl,
				"https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}

	@When("The user clicks {string} Time Complexity button")
	public void the_user_clicks_time_complexity_button(String string) {
		datastruct.clickTimeComplexityButton();
	}

	@Then("The user should be redirected to {string} Time Complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/";
		assertion.assertEquals(currenturl, expectedurl,
				"https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
	}

	@Given("The user is in the {string} Time Complexity page")
	public void the_user_is_in_the_time_complexity_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/";
		assertion.assertEquals(currenturl, expectedurl,
				"https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
	}

	@When("The user clicks the {string}  Practice Questions button")
	public void the_user_clicks_the_practice_questions_button(String string) {
		datastruct.clickPracticeQues();

	}

	@Then("The user should be redirected to {string} Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/data-structures-introduction/practice";
		assertion.assertEquals(currenturl, expectedurl,
				"https://dsportalapp.herokuapp.com/data-structures-introduction/practice");
		driver.navigate().back();
	}

	@When("The user clicks {string} Try Here button in Time Complexity page")
	public void the_user_clicks_try_here_button_in_time_complexity_page(String string) {
		datastruct.clickTryHereButton();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test in Time Complexity pag")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_time_complexity_pag() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/tryEditor";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/tryEditor");
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/tryEditor";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/tryEditor");
	}

	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		datastruct.clickRunButton();
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		datastruct.alertmessage();
	}

	@When("The user write the invalid code in Editor and click the Run button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button()
			throws IOException, InterruptedException {
		driver.navigate().back();
		datastruct.clickTryHereButton();
		String invalidcode = ExcelReader.getinvalidpythoncode();
		datastruct.enterText(invalidcode);
		datastruct.clickRunButton();
	}

	@When("The user write the valid code in Editor and click the Run button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button()
			throws IOException, InterruptedException {
		driver.navigate().back();
		datastruct.clickTryHereButton();
		String validcode = ExcelReader.getvalidpythoncode();
		datastruct.enterText(validcode);
		datastruct.clickRunButton();
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		datastruct.getOutputText();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		
	}

}
