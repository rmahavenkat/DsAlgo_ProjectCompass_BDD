package dsAlgo_stepDefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.Queue_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queue_SD {
	WebDriver driver = driverfactory.getDriver();
	public Queue_PF queue = new Queue_PF(driver);

	@When("The user clicks the {string} button in Queue Panel OR The user select Queue item from the drop down menu")
	public void the_user_clicks_the_button_in_queue_panel_or_the_user_select_queue_item_from_the_drop_down_menu(
			String string) throws InterruptedException {
		queue.clickdata();
		Thread.sleep(1000);
		queue.clickqueue();
	}

	@Then("The user be redirected to {string} Data Structure Page")
	public void the_user_be_redirected_to_data_structure_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/queue/";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	@Given("The user is in the {string} Data Structure Page")
	public void the_user_is_in_the_data_structure_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String url = "";
		switch (string) {
		case "Implementation of Queue in Python":
			url = "implementation-lists/";
			break;
		case "Implementation using collections.deque":
			url = "implementation-collections/";
			break;
		case "Implementation using array":
			url = "Implementation-array/";
			break;
		case "Queue Operations":
			url = "QueueOp/";
			break;
		case "Practice Questions":
			url = "practice";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/queue/" + url;
		if (url != Expectedurl) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	@When("The user clicks {string} button in the Queue page")
	public void the_user_clicks_button_in_the_queue_page(String string) {
		queue.implementationofqueuepage();
	}

	@Then("The user be redirected to {string} page")
	public void the_user_be_redirected_to_page(String string) {

		String currenturl = driver.getCurrentUrl();
		String url = "";
		switch (string) {
		case "Implementation of Queue in Python":
			url = "implementation-lists/";
			break;
		case "Implementation using collections.deque":
			url = "implementation-collections/";
			break;
		case "Implementation using array":
			url = "Implementation-array/";
			break;
		case "Queue Operations":
			url = "QueueOp/";
			break;
		case "Practice Questions":
			url = "practice";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/queue/" + url;
		if (url != Expectedurl) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
		driver.navigate().back();
	}

	@When("The user clicks {string} button in Implementation of Queue in Python page")
	public void the_user_clicks_button_in_implementation_of_queue_in_python_page(String string) {
		queue.tryeditorpage();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/tryEditor";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);

	}

	@Given("The user is in the tryEditor page for {string}")
	public void the_user_is_in_the_try_editor_page_for(String string) {
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://dsportalapp.herokuapp.com/tryEditor";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	@When("The user clicks the Run Button without entering the code in the tryEditor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_try_editor() {
		queue.runbtntest();
	}

	@Then("The user should able to see an error message in alert window for {string}")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_for(String string) {
		queue.alertmessage();
	}

	@When("The user write the invalid code in tryEditor and click the Run Button")
	public void the_user_write_the_invalid_code_in_try_editor_and_click_the_run_button()
			throws InterruptedException, IOException {
		driver.navigate().back();
		queue.tryeditorpage();
		String invalidmsg = ExcelReader.getinvalidpythoncode();
		queue.texteditor(invalidmsg);
		queue.runbtntest();
	}

	@When("The user write the valid code in tryEditor and click the Run Button")
	public void the_user_write_the_valid_code_in_try_editor_and_click_the_run_button()
			throws InterruptedException, IOException {
		driver.navigate().back();
		queue.tryeditorpage();
		String validmsg = ExcelReader.getvalidpythoncode();
		queue.texteditor(validmsg);
		queue.runbtntest();
	}

	@Then("The user should able to see output in console")
	public void the_user_should_able_to_see_output_in_console() {
		queue.getoutput();
		driver.navigate().back();
	}

	@Given("The user is in the {string} Page")
	public void the_user_is_in_the_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String url = "";
		switch (string) {
		case "Implementation of Queue in Python":
			url = "implementation-lists/";
			break;
		case "Implementation using collections.deque":
			url = "implementation-collections/";
			break;
		case "Implementation using array":
			url = "Implementation-array/";
			break;
		case "Queue Operations":
			url = "QueueOp/";
			break;
		case "Practice Questions":
			url = "practice";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/queue/" + url;
		if (url != Expectedurl) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	@When("The user clicks  {string} button in Implementation using collections.deque page")
	public void the_user_clicks_button_in_implementation_using_collections_deque_page(String string) {
		queue.tryeditorpage();
	}

	@When("The user clicks  {string} button in Implementation using array page")
	public void the_user_clicks_button_in_implementation_using_array_page(String string) {
		queue.tryeditorpage();
	}

	@When("The user clicks  {string} button in Queue Operations page")
	public void the_user_clicks_button_in_queue_operations_page(String string) {
		queue.tryeditorpage();
	}

}
