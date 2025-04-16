package dsAlgo_stepDefinition;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;
import ds_Algo_PageFactory.Home_PF;
import io.cucumber.java.en.*;

public class Home_SD {
	WebDriver driver = driverfactory.getDriver();
	Home_PF Home = new Home_PF(driver);

	@Given("The user has browser open")
	public void the_user_has_browser_open() {

		System.out.println("brower is open");
	}

	@When("The user enter correct dsAlgo portal URL")
	public void the_user_enter_correct_ds_algo_portal_url() {
		String url = ConfigReader.getApplicationUrl();
		driver.navigate().to(url);
	}

	@Then("The user should be able to land on dsAlgo portal with Get Started button")
	public void the_user_should_be_able_to_land_on_ds_algo_portal_with_get_started_button() {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	@Given("The user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {

		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {

		Home.clickBtn();
	}

	@Then("The user should be navigated to the Data Structure Introduction page, which displays the {string} and {string} links.")
	public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_and_links(
			String string, String string2) {
		String appurl = driver.getCurrentUrl();
		String homeurl = "https://dsportalapp.herokuapp.com/home";
		Assertion assertion = new Assertion();
		assertion.assertEquals(homeurl, appurl);
	}

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		String appurl = driver.getCurrentUrl();
		String homeurl = "https://dsportalapp.herokuapp.com/home";
		Assertion assertion = new Assertion();
		assertion.assertEquals(homeurl, appurl);
	}

	@When("The user clicks the Data Structures dropdown")
	public void the_user_clicks_the_data_structures_dropdown() {
		Home.clickdropdown();
	}

	@Then("The user should able to see {int} options {string} in dropdown menu")
	public void the_user_should_able_to_see_options_in_dropdown_menu(Integer expectedCount, String optionText) {
		List<String> expectedoptions = Arrays.asList(optionText.split(","));
		List<String> actualoptions = Home.captureDropdownoOptions();
		System.out.println("Expected: " + expectedoptions);
		System.out.println("Actual: " + actualoptions);
		Assert.assertEquals(actualoptions, expectedoptions);
	}

	@When("The user selects {string} from the drop down without Sign in.")
	public void the_user_selects_from_the_drop_down_without_sign_in(String optionText) {
		if (optionText.equalsIgnoreCase("Arrays")) {
			Home.clickarray();
		}
	}

	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) {
		Home.warning_msg();
	}

	@When("The user clicks {string} buttons of {string} on the homepage without Sign in")
	public void the_user_clicks_buttons_of_on_the_homepage_without_sign_in(String string, String string2) {

	}
}
