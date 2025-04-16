package ds_Algo_PageFactory;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_PF {
	WebDriver driver;
	public Home_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='content']/a/button[text()='Get Started']")
	WebElement getstartedBtn;
	public void clickBtn() {
		getstartedBtn.click();
	}
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	WebElement dropdownBtn;

	public void clickdropdown() {
		dropdownBtn.click();
	}
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> dropdownoptions;

	public List<String> captureDropdownoOptions() {
		List<String> options = new ArrayList<>();// creating array for dropdown
		for (WebElement optiontext : dropdownoptions) {// using for each loop for iterating through list
			options.add(optiontext.getText()); // getting the text from dropdown
		}
		return options;
	}
	@FindBy(xpath = "//a[normalize-space()='Arrays']")
	WebElement array;

	public void clickarray() {
		array.click();
	}

	@FindBy(xpath = "//div[@role='alert']")
	WebElement warningMsg;

	public void warning_msg() {
		warningMsg.getText();
	}
}
