package ds_Algo_PageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queue_PF {
	public WebDriver driver;
	@FindBy(xpath = "//a[contains(text(), 'Data')]") WebElement datastdrdown;
	@FindBy(xpath = "//a[contains(@href, 'queue')]")
	WebElement Queuedropdown;
	@FindBy(xpath = "//a[contains(text(), 'Implementation of Queue in Python')]")
	WebElement implementaionofqueue;
	@FindBy(xpath = "//a[contains(text(), 'Practice Questions')]")
	WebElement practice;
	@FindBy(xpath = "//a[contains(@href, 'try')]")
	WebElement tryhere;
	@FindBy(xpath = "//*[@id='answer_form']/div/div/div[1]/textarea")
	WebElement editor;
	@FindBy(xpath = "//button[contains(text(), 'Run')]") WebElement runbtn;
	@FindBy (id="output")
	WebElement validoutputmsg;
	
	public Queue_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void alertmessage() {
		try {
		Alert confirmation = driver.switchTo().alert();
		String alerttext = confirmation.getText();
		System.out.println(alerttext);
		confirmation.accept();

		}
		catch(NoAlertPresentException e){
			System.out.println("Bug:user should be able to see an alert messge but showing No alert"); 
		}
		
	}
	
	public void clickdata() {
		datastdrdown.click();
	}
	
	public void clickqueue() {
		Queuedropdown.click();
	}
	public void implementationofqueuepage() {
		implementaionofqueue.click();
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
	public void practicequestionspage() {
		practice.click();
	}
	public void getoutput() {
		System.out.println(validoutputmsg.getText());
	}
}


