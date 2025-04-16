package dsAlgo_stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;

import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.DataStructure_PF;
import ds_Algo_PageFactory.Graph_PF;
import ds_Algo_PageFactory.Login_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graph_SD {

	WebDriver driver = driverfactory.getDriver();
	public Login_PF login = new Login_PF(driver);
	public DataStructure_PF datastruct = new DataStructure_PF(driver);
	public Graph_PF graph = new Graph_PF(driver);

	Assertion assertion = new Assertion();

	@When("The user clicks the {string} button in Graph Panel or The user select Graph item from the drop down menu")
	public void the_user_clicks_the_button_in_graph_panel_or_the_user_select_graph_item_from_the_drop_down_menu(
			String string) {
		graph.clickGetStartButton();
	}

	@Then("The user be directed to {string} Graph Data Structure Page")
	public void the_user_be_directed_to_graph_data_structure_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/graph/");
	}

	@Given("The user is in the {string} graph page in data Stucture page")
	public void the_user_is_in_the_graph_page_in_data_stucture_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/graph/");
	}

	@When("The user clicks {string} graph Link in graph data Structure page")
	public void the_user_clicks_graph_link_in_graph_data_structure_page(String string) {
		graph.clickgraph();
	}

	@Then("The user should be redirected to\"Graph\" Graph page")
	public void the_user_should_be_redirected_to_graph_graph_page() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/graph/";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/graph/graph/");
	}

	@Given("The user is in the {string} graph page")
	public void the_user_is_in_the_graph_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/graph/";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/graph/graph/");
	}

	@When("The user clicks {string} try here button in Graph page")
	public void the_user_clicks_try_here_button_in_graph_page(String string) {
		graph.clickTryHereButton();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test in graph")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_graph() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/tryEditor";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/tryEditor");
	}

	
	@Then("The user should able to see output in the console Graph")
	public void the_user_should_able_to_see_output_in_the_console_graph() {
		graph.getOutputText();
		driver.navigate().back();
	}

	@Given("The user is in the Graph  page")
	public void the_user_is_in_the_graph_page() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/graph/";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/graph/graph/");
	}

	@When("The user clicks the {string} button in graph")
	public void the_user_clicks_the_button_in_graph(String string) {
		graph.clickPracticeQues();
	}

	@Then("The user is in Practice Question page of graph")
	public void the_user_is_in_practice_question_page_of_graph() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/practice";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/graph/practice");
		driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");

	}

	@When("The user clicks {string} Graph Representations Link in graph data Structure page")
	public void the_user_clicks_graph_representations_link_in_graph_data_structure_page(String string) {
		graph.clickGraphRepresentaion();
	}

	@Then("The user should be redirected to\"Graph Representations\"  Graph Representations page")
	public void the_user_should_be_redirected_to_graph_representations_graph_representations_page() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/graph-representations/";
		assertion.assertEquals(currenturl, expectedurl,
				"https://dsportalapp.herokuapp.com/graph/graph-representations/");
	}

	@Given("The user is in the {string} Graph Representations page")
	public void the_user_is_in_the_graph_representations_page(String string) {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/graph-representations/";
		assertion.assertEquals(currenturl, expectedurl,
				"https://dsportalapp.herokuapp.com/graph/graph-representations/");
	}

	@When("The user clicks {string} try here button in Graph Representations page")
	public void the_user_clicks_try_here_button_in_graph_representations_page(String string) {
		graph.clickTryHereButton();
	}

	/*@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/tryEditor";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/tryEditor");
	}*/

	@When("The user clicks the Run Button without entering the code in the Editor	 of Graph Representations")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_of_graph_representations() {
		graph.clickRunButton();
	}

	@When("The user write the invalid code in Editor and click the Run Button	of Graph Representations")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_of_graph_representations()
			throws IOException, InterruptedException {
		driver.navigate().back();
		datastruct.clickTryHereButton();
		// String invalidcode=ConfigReader.getinvalidcode();
		String invalidcode = ExcelReader.getinvalidpythoncode();
		datastruct.enterText(invalidcode);
		datastruct.clickRunButton();
	}

	@Then("The user should able to see output in the console of Graph Representations")
	public void the_user_should_able_to_see_output_in_the_console_of_graph_representations() {
		graph.getOutputText();
		driver.navigate().back();
	}

	@Given("The user is in the Graph Representation page")
	public void the_user_is_in_the_graph_representation_page() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/graph-representations/";
		assertion.assertEquals(currenturl, expectedurl,
				"https://dsportalapp.herokuapp.com/graph/graph-representations/");
	}

	@When("The user clicks the {string} practice Ques button	of Graph Representations")
	public void the_user_clicks_the_practice_ques_button_of_graph_representations(String string) {
		graph.clickPracticeQues();
	}

	@Then("The user is in Practice Question page of Graph Representations")
	public void the_user_is_in_practice_question_page_of_graph_representations() {
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://dsportalapp.herokuapp.com/graph/practice";
		assertion.assertEquals(currenturl, expectedurl, "https://dsportalapp.herokuapp.com/graph/practice");
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");

	}

}
