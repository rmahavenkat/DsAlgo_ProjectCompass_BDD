package dsAlgo_stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;

import dsAlgo_DriverFactory.driverfactory;
import ds_Algo_PageFactory.Tree_PF;
import io.cucumber.java.en.*;

public class Tree_SD {

	WebDriver driver = driverfactory.getDriver();
	public Tree_PF tree = new Tree_PF(driver);
	Assertion assertion=new Assertion();
	@When("The user clicks the {string} button in Tree Panel OR the user select Tree item from the drop down menu")
	public void the_user_clicks_the_button_in_tree_panel_or_the_user_select_tree_item_from_the_drop_down_menu(String string) {
		tree.clickGetStartButton();
	}

	@Then("The user be redirected to {string} Tree Data Structure Page")
	public void the_user_be_redirected_to_tree_data_structure_page(String string) {
		String currenturl=driver.getCurrentUrl();
		 String expectedurl="https://dsportalapp.herokuapp.com/tree/";
		 assertion.assertEquals(currenturl,expectedurl,"https://dsportalapp.herokuapp.com/tree/" );
	}

	@Given("The user is in the Tree page")
	public void the_user_is_in_the_tree_page() {
		String currenturl=driver.getCurrentUrl();
		 String expectedurl="https://dsportalapp.herokuapp.com/tree/";
		 assertion.assertEquals(currenturl,expectedurl,"https://dsportalapp.herokuapp.com/tree/" );
	}

	@When("The user clicks {string} Overview of Trees button")
	public void the_user_clicks_overview_of_trees_button(String string) {
		tree.clickOverviewOfTree(); 
	}

	@Then("The user should be redirected to {string} Tree page")
	public void the_user_should_be_redirected_to_tree_page(String string) {
		String currenturl=driver.getCurrentUrl();
		String url = "";
					switch(string) {
			    	case "Overview of Trees":
			    		url="overview-of-trees/";
			    		break;
			    	case "Terminologies":
			    		url="terminologies/";
			    		break;
			    	case "Types of Trees":
			    		url="types-of-trees/";
			    		break;
			    	case "Tree Traversals":
			    		url="tree-traversals/";
			    		break;
			    	case "Traversals-Illustration":
			    		url="traversals-illustration/";
			    		break;
			    	case "Binary Trees":
			    		url="binary-trees/";
			    		break;
			    	case "Types of Binary Trees":
			    		url="types-of-binary-trees/";
			    		break;
			    	case "Implementation in Python":
			    		url="implementation-in-python/";
			    		break;
			    	case "Binary Tree Traversals":
			    		url="binary-tree-traversals/";
			    		break;
			    	case "Implementation of Binary Trees":
			    		url="implementation-of-binary-trees/";
			    		break;
			    	case "Applications of Binary trees":
			    		url="applications-of-binary-trees/";
			    		break;
			    	case "Binary Search Trees":
			    		url="binary-search-trees/";
			    		break;
			    	case "Implementation Of BST":
			    		url="implementation-of-bst/";
			    		break;
			    		
			    	case "Practice Questions":
			    		url="practice";
			    		break;
			    		
			    	}
			    	String Expectedurl="https://dsportalapp.herokuapp.com/tree/"+url;
			    	if(!currenturl.equals(Expectedurl)) {
			    		driver.navigate().to(Expectedurl);
			    	}
			    	currenturl=driver.getCurrentUrl();
			    	Assertion assertion= new Assertion();
			    	assertion.assertEquals(currenturl,Expectedurl);

	}

	@Given("The user is on the {string} Tree page")
	public void the_user_is_on_the_tree_page(String string) {
		String currenturl=driver.getCurrentUrl();
		String url = "";
					switch(string) {
			    	case "Overview of Trees":
			    		url="overview-of-trees/";
			    		break;
			    	case "Terminologies":
			    		url="terminologies/";
			    		break;
			    	case "Types of Trees":
			    		url="types-of-trees/";
			    		break;
			    	case "Tree Traversals":
			    		url="tree-traversals/";
			    		break;
			    	case "Traversals-Illustration":
			    		url="traversals-illustration/";
			    		break;
			    	case "Binary Trees":
			    		url="binary-trees/";
			    		break;
			    	case "Types of Binary Trees":
			    		url="types-of-binary-trees/";
			    		break;
			    	case "Implementation in python":
			    		url="implementation-in-python/";
			    		break;
			    	case "Binary Tree Traversals":
			    		url="binary-tree-traversals/";
			    		break;
			    	case "Implementation of Binary Trees":
			    		url="implementation-of-binary-trees/";
			    		break;
			    	case "Application of Binary Trees":
			    		url="applications-of-binary-trees/";
			    		break;
			    	case "Binary Search Trees":
			    		url="binary-search-trees/";
			    		break;
			    	case "Implementation of BST":
			    		url="implementation-of-bst/";
			    		break;
			    		
			    	case "Practice Questions":
			    		url="practice";
			    		break;
			    		
			    	}
			    	String Expectedurl="https://dsportalapp.herokuapp.com/tree/"+url;
			    	if(!currenturl.equals(Expectedurl)) {
			    		driver.navigate().to(Expectedurl);
			    	}
			    	currenturl=driver.getCurrentUrl();
			    	Assertion assertion= new Assertion();
			    	assertion.assertEquals(currenturl,Expectedurl);
	}

	/*@When("The user clicks {string} Practice Questions button")
	public void the_user_clicks_practice_questions_button(String string) {
		 tree.clickPracticeQuestion();
	}*/

	@When("The user clicks {string} Terminologies button")
	public void the_user_clicks_terminologies_button(String string) {
		tree.clickTerminologies();
	}

	@When("The user clicks {string} Types of Trees button")
	public void the_user_clicks_types_of_trees_button(String string) {
		tree.clickTypesOfTree();
	}

	@When("The user clicks {string} Tree Traversals button")
	public void the_user_clicks_tree_traversals_button(String string) {
		tree.clickBinaryTreeTraversal();
	}

	@When("The user clicks {string} Traversals-Illustration button")
	public void the_user_clicks_traversals_illustration_button(String string) {
		tree.clickTraversalIllustration();
	}

	@When("The user clicks {string} Binary Trees button")
	public void the_user_clicks_binary_trees_button(String string) {
		 tree.clickBinaryTree();
	}

	@When("The user clicks {string} Types of Binary Trees button")
	public void the_user_clicks_types_of_binary_trees_button(String string) {
		tree.clickTypesOfBinaryTree();
	}

	@When("The user clicks {string} Implementation in python button")
	public void the_user_clicks_implementation_in_python_button(String string) {
		tree.clickImplementationInPython();
	}

	@When("The user clicks {string} Binary Tree Traversals button")
	public void the_user_clicks_binary_tree_traversals_button(String string) {
		tree.clickBinaryTreeTraversal();
	}

	@When("The user clicks {string} Implementation of Binary Trees button")
	public void the_user_clicks_implementation_of_binary_trees_button(String string) {
		 tree.clickImplementationOfBinaryTree();
	}

	@When("The user clicks {string} Application of Binary Trees button")
	public void the_user_clicks_application_of_binary_trees_button(String string) {
		tree.clickApplicationsOfBinaryTree();
	}

	@When("The user clicks {string} Binary Search Trees button")
	public void the_user_clicks_binary_search_trees_button(String string) {
		tree.clickBinarySearchTree();
	}

	@When("The user clicks {string} Implementation of BST button")
	public void the_user_clicks_implementation_of_bst_button(String string) {
		tree.clickImplementationOfBST(); 
	}
	
}
