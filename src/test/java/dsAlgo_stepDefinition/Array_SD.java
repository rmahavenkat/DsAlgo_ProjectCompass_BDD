package dsAlgo_stepDefinition;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.Array_PF;
import io.cucumber.java.en.*;
public class Array_SD {
	WebDriver driver = driverfactory.getDriver();
	Array_PF array = new Array_PF(driver);
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() throws IOException {
		driver.get(ConfigReader.getApplicationUrl());
		array.clicksigninBtn();
		array.enterusername(ExcelReader.getvalidusername());
		array.enterpassword(ExcelReader.getvalidpassword());
	    array.clickloginBtn();
	    Assertion assertion = new Assertion();
	    String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://dsportalapp.herokuapp.com/home";
	    assertion.assertEquals(actualUrl, expectedUrl);
	}

	@When("The user clicks the \"\"Getting Started\"\" button in Array Panel OR The user select Array item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_array_panel_or_the_user_select_array_item_from_the_drop_down_menu() {
		array.clickArrayGetStartBtn();
	}

	@Then("The user be directed to {string} Data Structure Page")
	public void the_user_be_directed_to_data_structure_page(String string) {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/array/";
	    Assertion assertion = new Assertion();
	    assertion.assertEquals(actualUrl,expectedUrl);
	}
	@Given("The user is in the {string} page after Sign in")
	public void the_user_is_in_the_page_after_sign_in(String string) {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/array/";
	    Assertion assertion = new Assertion();
	    assertion.assertEquals(actualUrl,expectedUrl);
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		array.clickArrayInpython();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		String currenturl = driver.getCurrentUrl(); 
		String url = "";
		switch (string) {
		case "Arrays in Python":
			url = "arrays-in-python/";
			break;
		case "Arrays using list":
			url = "arrays-using-list/";
			break;
		case "Basic operations in lists":
			url = "basic-operations-in-lists/";
			break;
		case "Applications of array":
			url = "applications-of-array/";
			break;
			
		case "Practice":
			url = "practice";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/array/" + url;
		if (url != Expectedurl) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
		   
	}
	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
		String currenturl = driver.getCurrentUrl();	 
		String url = "";
		switch (string) {
		case "Arrays in Python":
			url = "arrays-in-python/";
			break;
		case "Arrays using list":
			url = "arrays-using-list/";
			break;
		case "Basic operations in lists":
			url = "basic-operations-in-lists/";
			break;
		case "Applications of array":
			url = "applications-of-array/";
			break;
		case "Practice":
			url = "practice";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/array/" + url;
		if (url != Expectedurl) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);		
	}

	@When("The user clicks {string} button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page(String string) {
		array.clickArrayInpythonTryHere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String arraypage = driver.getCurrentUrl();
		   String expecturl = "https://dsportalapp.herokuapp.com/tryEditor";
		   Assertion assertion = new Assertion();
		    assertion.assertEquals(arraypage, expecturl);
	}
	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
		String arraypage = driver.getCurrentUrl();
		   String expecturl = "https://dsportalapp.herokuapp.com/tryEditor";
		   Assertion assertion = new Assertion();
		    assertion.assertEquals(arraypage, expecturl);
	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() throws InterruptedException {
		array.click_runBtn();
	}

	@Then("The user should able to see an error message in alert window")//bug @TC43
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		array.alertmessage();
	}
	@When("The user write the invalid code in Editor and click the Run Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() throws IOException, InterruptedException {
		driver.navigate().back();
		array.clickArrayInpythonTryHere();
		String invalidMsg = ExcelReader.getinvalidpythoncode();
	     array.enterinvalid(invalidMsg);
	     array.click_runBtn();
	}
	@When("The user write the valid code in Editor and click the Run Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() throws IOException, InterruptedException {
		driver.navigate().back();
		array.clickArrayInpythonTryHere();
		String validMsg = ExcelReader.getvalidpythoncode();
	     array.enterinvalid(validMsg);
	     array.click_runBtn();
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    array.seeoutput();
	    driver.navigate().back();
	}
	@When("The user clicks {string} Practice Questions button")
	public void the_user_clicks_practice_questions_button(String string) {
		array.click_PracticeQBtn();
	}
	@When("The user clicks the {string} link")
	public void the_user_clicks_the_link(String string) {
		switch (string) {
        case "Search the array":
        	array.clickSearchTheArray();
            break;
        case "Max Consecutive Ones":
        	array.clickMax();
            break;
        case "Find numbers with even number of digits":
        	array.clickfindNum();
            break;
        case "Square of a sorted array":
        	array.clicksortedArray();
            break;
        
        default:
            throw new IllegalArgumentException("No such button: " + string);
    }
	 
	} 

	@Then("The user should be redirected to {string} page contains a question,and try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_page_contains_a_question_and_try_editor_with_run_and_submit_buttons(String string) {
		String currenturl = driver.getCurrentUrl();	 
		String url = "";
		switch (string) {
		case "Question":
			url = "1";
			break;
		case "Max Consecutive Ones Question":
			url = "2";
			break;
		case "Find numbers with even number of digits Question":
			url = "3";
			break;
		case "Square of a sorted array Question":
			url = "4";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/question/" + url;
		if (url != Expectedurl) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
		
	}
	@Given("The user is on the practice question1 editor")
	public void the_user_is_on_the_practice_question1_editor() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/question/1";
	    Assertion assertion = new Assertion();
	    assertion.assertEquals(actualUrl,expectedUrl); 	
	}
	@When("The user write the invalid code in qs and Click the Run Button")
	public void the_user_write_the_invalid_code_in_qs_and_click_the_run_button() throws IOException, InterruptedException {
	    array.clearCodeEditor();
	    String invalidMsg = ExcelReader.getinvalidpythoncode();
	     array.enterinvalid(invalidMsg);
	     array.click_runBtn(); 
	}
	@When("The user Click the Submit Button")
	public void the_user_click_the_submit_button() {
	    array.click_submitBtn();
	}

	@Then("The user see an error message {string}")
	public void the_user_see_an_error_message(String string) {
		String actualMsg = array.getErrorMsg(); 
		String expectedMsg = "Submission successful";
		Assertion assertion = new Assertion();
	    assertion.assertEquals(actualMsg,expectedMsg);
	}
	@When("The user write the valid code in qs and Click the Run Button")
	public void the_user_write_the_valid_code_in_qs_and_click_the_run_button() throws IOException, InterruptedException {
		array.clearCodeEditor();
	    String validMsg = ExcelReader.getvalidpythoncode();
	     array.enterCodeInEditor(validMsg);
	     array.click_runBtn();
	}
	@Then("The user should able to see output")
	public void the_user_should_able_to_see_output() {
	   array.getoutput();
	}
	@When("The user Click the Submit Button after enter the valid code")
	public void the_user_click_the_submit_button_after_enter_the_valid_code() {
		array.click_submitBtn();
	}
	@Then("The user see success message {string}")
	public void the_user_see_success_message(String string) {
		String actualMsg = array.getErrorMsg(); // error occure sum for valid code
		String expectedMsg = "Submission successful";
		Assertion assertion = new Assertion();
	    assertion.assertEquals(actualMsg,expectedMsg);
	   driver.navigate().back();
	}
	@Given("The user is on the practice question2 editor")
	public void the_user_is_on_the_practice_question2_editor() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/question/2";
	    Assertion assertion = new Assertion();
	    assertion.assertEquals(actualUrl,expectedUrl);
	}
	@Given("The user is on the practice question3 editor")
	public void the_user_is_on_the_practice_question3_editor() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/question/3";
	    Assertion assertion = new Assertion();
	    assertion.assertEquals(actualUrl,expectedUrl);
	}
	@Given("The user is on the practice question4 editor")
	public void the_user_is_on_the_practice_question4_editor() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/question/4";
	    Assertion assertion = new Assertion();
	    assertion.assertEquals(actualUrl,expectedUrl);
	}
	@Then("The user see an error message {string} in console")
	public void the_user_see_an_error_message_in_console(String string) {
		String actualMsg = array.getErrorMsg(); // error occure sum for valid code
		String expectedMsg = "Submission successful";
		Assertion assertion = new Assertion();
	    assertion.assertEquals(actualMsg,expectedMsg);
	}
	@Given("The user is in the {string} page")
	public void the_user_is_in_the_page(String string) {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/array/arrays-in-python/";
	    Assertion assertion = new Assertion();
	    assertion.assertEquals(actualUrl,expectedUrl);
}
}