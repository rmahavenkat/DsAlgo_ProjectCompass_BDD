package ds_Algo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph_PF {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]/div/div/a[text()='Get Started']")
	WebElement getStartButton;
	@FindBy(xpath = "//div/ul/a[text()='Graph']")
	WebElement graphlink;
	@FindBy(linkText = "Try here>>>")
	WebElement tryhereButton;
	@FindBy(linkText = "Practice Questions")
	WebElement practiceQuesButton;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement runButton;
	@FindBy(xpath = "//div/ul/a[text()='Graph Representations']")
	WebElement graphRepresentationlink;
	@FindBy(xpath = "//*[@id='output']")
	WebElement output;

	public Graph_PF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickGetStartButton() {
		getStartButton.click();
	}

	public void clickgraph() {
		graphlink.click();
	}

	public void clickTryHereButton() {
		tryhereButton.click();
	}

	public void clickRunButton() {
		runButton.click();
	}

	public void clickPracticeQues() {
		practiceQuesButton.click();
	}

	public void clickGraphRepresentaion() {
		graphRepresentationlink.click();
	}

	public void getOutputText() {
		System.out.println(output.getText());
	}

}
