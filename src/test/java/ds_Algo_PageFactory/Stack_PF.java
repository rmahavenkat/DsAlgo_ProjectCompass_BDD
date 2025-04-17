package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack_PF {

	public WebDriver driver;
	@FindBy(xpath = "//a[contains(text(), 'Sign in')]")
	WebElement signin;
	@FindBy(id = "id_username")
	WebElement username;
	@FindBy(id = "id_password")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;
	@FindBy(xpath = "//a[contains(text(), 'Data')]")
	WebElement datastdrdown;
	@FindBy(xpath = "//a[contains(@href, 'stack')]")
	WebElement Stackdropdown;
	@FindBy(xpath = "//a[contains(text(), 'Operations')]")
	WebElement operationsinstack;
	@FindBy(xpath = "//a[contains(text(), 'Implement')]")
	WebElement implementaion;
	@FindBy(xpath = "//a[contains(text(), 'Applications')]")
	WebElement application;
	@FindBy(xpath = "//a[contains(text(), 'Practice Questions')]")
	WebElement practice;
	@FindBy(xpath = "//a[contains(@href, 'try')]")
	WebElement tryhere;
	@FindBy(xpath = "//*[@id='answer_form']/div/div/div[1]/textarea")
	WebElement editor;
	@FindBy(xpath = "//button[contains(text(), 'Run')]")
	WebElement runbtn;
	@FindBy(id = "output")
	WebElement validoutputmsg;

	public Stack_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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

	public void signin() {
		signin.click();

	}

	public void setUserName(String uname) {

		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void login() {
		login.click();

	}

	public void clickdata() {
		datastdrdown.click();
	}

	public void clickstack() {
		Stackdropdown.click();
	}

	public void operationsinstackpage() {
		operationsinstack.click();
	}

	public void implementationinstackpage() {
		implementaion.click();
	}

	public void applicationsstackpage() {
		application.click();
	}

	public void practicequestionspage() {
		practice.click();
	}

	public void tryeditorpage() {
		tryhere.click();
	}

	public void texteditor(String edit) throws InterruptedException {

		editor.sendKeys(edit);
	}

	public void runbtntest() {
		runbtn.click();
	}

	public void getoutput() {
		System.out.println(validoutputmsg.getText());
	}

}
