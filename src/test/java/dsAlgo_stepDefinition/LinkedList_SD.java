package dsAlgo_stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import dsAlgo_DriverFactory.driverfactory;
import ds_Algo_PageFactory.DataStructure_PF;
import ds_Algo_PageFactory.LinkedList_PF;
import ds_Algo_PageFactory.Login_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList_SD {
	WebDriver driver = driverfactory.getDriver();
	Assertion assertion = new Assertion();
	public Login_PF login = new Login_PF(driver);
	public DataStructure_PF datastruct = new DataStructure_PF(driver);
	public LinkedList_PF linkedlist = new LinkedList_PF(driver);

	@When("The user clicks the {string} Getting Started button in Linked List panel OR The user select Linked List item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_linked_list_panel_or_the_user_select_linked_list_item_from_the_drop_down_menu(
			String string) {
		linkedlist.clickGetStartedButton();
	}

	@Then("The user should land in {string}")
	public void the_user_should_land_in(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/linked-list/";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/linked-list/");
	}

	@Given("The user is in the {string} page Sign in")
	public void the_user_is_in_the_page_sign_in(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/linked-list/";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/linked-list/");

	}

	@When("The user clicks {string} Introduction button")
	public void the_user_clicks_introduction_button(String string) {
		linkedlist.clickIntroduction();

	}

	@Then("The user should be redirected to {string} Linked List page.")
	public void the_user_should_be_redirected_to_linked_list_page(String string) {
		linkedlist.urlIterate(string);
	}

	@Given("The user is in the {string}")
	public void the_user_is_in_the(String string) {
		linkedlist.urlIterate(string);
	}

	@When("The user clicks the {string} Practice Questions button")
	public void the_user_clicks_the_practice_questions_button(String string) {
		linkedlist.clickpracticeQuestion();
	}

	@When("The user clicks {string} Try Here button")
	public void the_user_clicks_try_here_button(String string) {
		linkedlist.clicktryhereButton();
	}

	@When("The user clicks {string} creating Linked List button")
	public void the_user_clicks_creating_linked_list_button(String string) {
		linkedlist.clickcreatingLinkedListButton();
	}

	@When("The user clicks {string} types of Linked List button")
	public void the_user_clicks_types_of_linked_list_button(String string) {
		linkedlist.clickTypesOfLinkedListButton();
	}

	@When("The user clicks {string} Implement Linked List in phyton button")
	public void the_user_clicks_implement_linked_list_in_phyton_button(String string) {
		linkedlist.clickImplementLinkedListInPythonButton();
	}

	@When("The user clicks {string} Traversal button")
	public void the_user_clicks_traversal_button(String string) {
		linkedlist.clickTraversalButton();
	}

	@When("The user clicks {string} Insertion button")
	public void the_user_clicks_insertion_button(String string) {
		linkedlist.clickInsertionButton();
	}

	@When("The user clicks {string} Deletion button")
	public void the_user_clicks_deletion_button(String string) {
		linkedlist.clickDeletionButton();
	}
}
