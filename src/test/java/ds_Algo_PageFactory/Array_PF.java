package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Array_PF {
	WebDriver driver;

	public Array_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement signBtn;

	public void clicksigninBtn() {
		signBtn.click();
	}

	@FindBy(id = "id_username")
	WebElement username;

	public void enterusername(String user) {
		username.sendKeys(user);
	}

	@FindBy(id = "id_password")
	WebElement password;

	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;

	public void clickloginBtn() {
		loginBtn.click();
	}

	@FindBy(xpath = "//a[@href='array']")
	WebElement A_getstartedBtn;

	public void clickArrayGetStartBtn() {
		A_getstartedBtn.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Data')]")
	WebElement dropdown;

	public void clickdropdown() {
		dropdown.click();
	}

	@FindBy(xpath = "//a[normalize-space()='Arrays']")
	WebElement arrays;

	public void clickarrays() {
		arrays.click();
	}

	@FindBy(xpath = "//a[normalize-space()='Arrays in Python']")
	WebElement arrayInpython;

	public void clickArrayInpython() {
		arrayInpython.click();
	}

	@FindBy(xpath = "//a[contains(@href, 'try')]")
	WebElement arrayInpythonTryHere;

	public void clickArrayInpythonTryHere() {
		arrayInpythonTryHere.click();

	}

	@FindBy(xpath = "//*[@id='answer_form']/button")
	WebElement runBtn;

	public void click_runBtn() {
		// Thread.sleep(1000);
		runBtn.click();
	}

	@FindBy(xpath = "//*[@id='answer_form']/div/div/div[1]/textarea")
	WebElement invalidcodeEditor;

	public void enterinvalid(String code) {
		invalidcodeEditor.sendKeys(code);
	}

	@FindBy(xpath = "//*[@id='answer_form']/div/div/div[1]/textarea")
	WebElement validcodeEditor;

	public void entervalid(String validMsg) {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement editor =
		// wait.until(ExpectedConditions.elementToBeClickable(validcodeEditor));
		validcodeEditor.sendKeys(validMsg);
	}

	@FindBy(xpath = "")
	WebElement output;

	public void seeoutput() {
		System.out.println(validoutputmsg.getText());
	}

	public void clearCodeEditor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.CodeMirror').CodeMirror.setValue('');");
	}

	@FindBy(xpath = "//*[@id='answer_form']/input[2]")
	WebElement submitBtn;

	public void click_submitBtn() {
		submitBtn.click();
	}

	public void alertmessage() {
		try {
			Alert confirmation = driver.switchTo().alert();
			String alerttext = confirmation.getText();
			System.out.println(alerttext);
			confirmation.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Bug:user should be able to see an alert messge but showing No alert");
		}
	}

	@FindBy(id = "output")
	WebElement validoutputmsg;

	public String getoutput() {
		return validoutputmsg.getText();
		// System.out.println(validoutputmsg.getText());
	}

	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")
	WebElement PracticeQBtn;

	public void click_PracticeQBtn() {
		PracticeQBtn.click();
	}

	@FindBy(xpath = "//*[@id='output']")
	WebElement errorMsg;

	public String getErrorMsg() {
		return errorMsg.getText();
	}

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement arrayUsingListTryHere;

	public void clickArrayUsingListTryHere() {
		arrayUsingListTryHere.click();

	}

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement basictryhere;

	public void clickbasictryhere() {
		basictryhere.click();
	}

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement applicationtryhere;

	public void clickapplicationtryhere() {
		applicationtryhere.click();
	}

	public void enterCodeInEditor(String code) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.CodeMirror').CodeMirror.setValue(arguments[0]);", code);
	}

	@FindBy(xpath = "//a[normalize-space()='Search the array']")
	WebElement searchTheArray;

	public void clickSearchTheArray() {
		searchTheArray.click();
	}

	@FindBy(xpath = "//a[normalize-space()='Max Consecutive Ones']")
	WebElement Max;

	public void clickMax() {
		Max.click();
	}

	@FindBy(xpath = "//a[normalize-space()='Find Numbers with Even Number of Digits']")
	WebElement findNum;

	public void clickfindNum() {
		findNum.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Squares of')]")
	WebElement sortedArray;

	public void clicksortedArray() {
		sortedArray.click();
	}

	@FindBy(xpath = "//*[@id='output']")
	WebElement successMsg;

	public void getSuccessMsg() {
		successMsg.getText();
	}

	public String getValidationMessage(WebElement element) {
		return (String) ((org.openqa.selenium.JavascriptExecutor) driver)
				.executeScript("return arguments[0].validationMessage;", element);
	}

}
