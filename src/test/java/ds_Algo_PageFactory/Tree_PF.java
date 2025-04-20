package ds_Algo_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;

public class Tree_PF extends BasePageFactory {

	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]/div/div/a[text()='Get Started']")
	WebElement getstartbutton;
	@FindBy(linkText = "Overview of Trees")
	WebElement overviewoftreeButton;
	@FindBy(linkText = "Practice Questions")
	WebElement practicequestions;
	@FindBy(xpath = "//a[text()='Terminologies']")
	WebElement terminologiesbutton;
	@FindBy(xpath = "//a[text()='Types of Trees']")
	WebElement typesoftreebutton;
	@FindBy(xpath = "//a[text()='Tree Traversals']")
	WebElement treetraversalbutton;
	@FindBy(xpath = "//a[text()='Traversals-Illustration']")
	WebElement travelIllustrationbutton;
	@FindBy(xpath = "//a[text()='Binary Trees']")
	WebElement binarytreesbutton;
	@FindBy(xpath = "//a[text()='Types of Binary Trees']")
	WebElement typesofbinarytreebutton;
	@FindBy(xpath = "//a[text()='Implementation in Python']")
	WebElement implementationinpythonbutton;
	@FindBy(xpath = "//a[text()='Binary Tree Traversals']")
	WebElement binarytreetraversalbutton;
	@FindBy(xpath = "//a[text()='Implementation of Binary Trees']")
	WebElement implementationofbinarytreebutton;
	@FindBy(xpath = "//a[text()='Applications of Binary trees']")
	WebElement applicationofbinarytreebutton;
	@FindBy(xpath = "//a[text()='Binary Search Trees']")
	WebElement binarysearchtreebutton;
	@FindBy(xpath = "//a[text()='Implementation Of BST']")
	WebElement implementationofbstbutton;

	public void clickGetStartButton() {
		getstartbutton.click();
	}

	public void clickOverviewOfTree() {
		overviewoftreeButton.click();
	}

	public void clickPracticeQuestion() {
		practicequestions.click();
	}

	public void clickTerminologies() {
		terminologiesbutton.click();
	}

	public void clickTypesOfTree() {
		typesoftreebutton.click();
	}

	public void clickTreeTraversal() {
		treetraversalbutton.click();
	}

	public void clickTraversalIllustration() {
		travelIllustrationbutton.click();
	}

	public void clickBinaryTree() {
		binarytreesbutton.click();
	}

	public void clickTypesOfBinaryTree() {
		typesofbinarytreebutton.click();
	}

	public void clickImplementationInPython() {
		implementationinpythonbutton.click();
	}

	public void clickBinaryTreeTraversal() {
		binarytreetraversalbutton.click();
	}

	public void clickImplementationOfBinaryTree() {
		implementationofbinarytreebutton.click();
	}

	public void clickApplicationsOfBinaryTree() {
		applicationofbinarytreebutton.click();
	}

	public void clickBinarySearchTree() {
		binarysearchtreebutton.click();
	}

	public void clickImplementationOfBST() {
		implementationofbstbutton.click();
	}

	public void treeLinksUrl(String string) {
		String currenturl = driver.getCurrentUrl();
		String url = "";
		switch (string) {
		case "Overview of Trees":
			url = "overview-of-trees/";
			break;
		case "Terminologies":
			url = "terminologies/";
			break;
		case "Types of Trees":
			url = "types-of-trees/";
			break;
		case "Tree Traversals":
			url = "tree-traversals/";
			break;
		case "Traversals-Illustration":
			url = "traversals-illustration/";
			break;
		case "Binary Trees":
			url = "binary-trees/";
			break;
		case "Types of Binary Trees":
			url = "types-of-binary-trees/";
			break;
		case "Implementation in python":
			url = "implementation-in-python/";
			break;
		case "Binary Tree Traversals":
			url = "binary-tree-traversals/";
			break;
		case "Implementation of Binary Trees":
			url = "implementation-of-binary-trees/";
			break;
		case "Application of Binary Trees":
			url = "applications-of-binary-trees/";
			break;
		case "Binary Search Trees":
			url = "binary-search-trees/";
			break;
		case "Implementation of BST":
			url = "implementation-of-bst/";
			break;

		case "Practice Questions":
			url = "practice";
			break;

		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/tree/" + url;
		if (!currenturl.equals(Expectedurl)) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		System.out.println("The User is in the Tree page of :" + currenturl);
	}

	public void treeUrlIterate(String string) {
		String currenturl = driver.getCurrentUrl();
		String url = "";
		switch (string) {
		case "Overview of Trees":
			url = "overview-of-trees/";
			break;
		case "Terminologies":
			url = "terminologies/";
			break;
		case "Types of Trees":
			url = "types-of-trees/";
			break;
		case "Tree Traversals":
			url = "tree-traversals/";
			break;
		case "Traversals-Illustration":
			url = "traversals-illustration/";
			break;
		case "Binary Trees":
			url = "binary-trees/";
			break;
		case "Types of Binary Trees":
			url = "types-of-binary-trees/";
			break;
		case "Implementation in Python":
			url = "implementation-in-python/";
			break;
		case "Binary Tree Traversals":
			url = "binary-tree-traversals/";
			break;
		case "Implementation of Binary Trees":
			url = "implementation-of-binary-trees/";
			break;
		case "Applications of Binary trees":
			url = "applications-of-binary-trees/";
			break;
		case "Binary Search Trees":
			url = "binary-search-trees/";
			break;
		case "Implementation Of BST":
			url = "implementation-of-bst/";
			break;

		case "Practice Questions":
			url = "practice";
			break;

		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/tree/" + url;
		if (!currenturl.equals(Expectedurl)) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);

	}

}
