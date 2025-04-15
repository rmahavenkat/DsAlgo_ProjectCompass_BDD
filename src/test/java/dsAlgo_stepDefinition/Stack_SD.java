package dsAlgo_stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import dsAlgo_DriverFactory.driverfactory;
import ds_Algo_PageFactory.Stack_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack_SD {

	WebDriver driver = driverfactory.getDriver();
	public Stack_PF stack = new Stack_PF(driver);

	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() throws IOException {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/home";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);

	}

	@When("{string}{string}{string}")
	public void string_string_string(String string, String string2, String string3) throws InterruptedException {
		stack.clickdata();
		Thread.sleep(1000);
		System.out.println("user logged in");
		stack.clickstack();
	}

	@Then("The user be directed to {string} Data Structure Page")
	public void the_user_be_directed_to_data_structure_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/stack/";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);

	}

	@Given("The user is in the {string} page after Sign in")
	public void the_user_is_in_the_page_after_sign_in(String string) {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/stack/";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);

	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		stack.operationsinstackpage();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		String currenturl = driver.getCurrentUrl();

		String url = "";

		switch (string) {
		case "Operations in Stack":
			url = "operations-in-stack/";
			break;
		case "Implementation":
			url = "implementation/";
			break;
		case "Applications":
			url = "stack-applications/";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/stack/" + url;
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);

	}

	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
		String currenturl = driver.getCurrentUrl();

		String url = "";

		switch (string) {
		case "Operations in Stack":
			url = "operations-in-stack/";
			break;
		case "Implementation":
			url = "implementation/";
			break;
		case "Applications":
			url = "stack-applications/";
			break;
		case "Practice Questions":
			url = "practice";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/stack/" + url;
		if (url != Expectedurl) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);

	}

	@When("The user clicks {string} button in Operations in Stack page")
	public void the_user_clicks_button_in_operations_in_stack_page(String string) {
		stack.tryeditorpage();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/tryEditor";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);

	}

	@When("The user clicks {string} Implementation button")
	public void the_user_clicks_implementation_button(String string) {
		stack.implementationinstackpage();
	}

	@Then("The user should be redirected to {string} Implementation page")
	public void the_user_should_be_redirected_to_implementation_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/stack/implementation/";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	@When("The user clicks {string} button in Implementation page")
	public void the_user_clicks_button_in_implementation_page(String string) {
		stack.tryeditorpage();
	}

	@Given("The user is in the {string} page")
	public void the_user_is_in_the_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/stack/implementation/";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	@When("The user clicks {string} Applications button")
	public void the_user_clicks_applications_button(String string) {
		stack.applicationsstackpage();
	}

	@When("The user clicks {string} button in Applications page")
	public void the_user_clicks_button_in_applications_page(String string) {
		stack.tryeditorpage();
	}

	@When("The user clicks {string} button to test")
	public void the_user_clicks_button_to_test(String string) {
		stack.practicequestionspage();
	}

	@Then("The user should be redirected to {string} Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/stack/practice";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
		// driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		// driver.navigate().to("https://dsportalapp.herokuapp.com/home");

	}
}
