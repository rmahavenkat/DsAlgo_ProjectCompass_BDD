package ds_Algo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.driverfactory;

public class BasePageFactory {

	protected WebDriver driver = driverfactory.getDriver();

    public BasePageFactory() {
        PageFactory.initElements(driver, this);
    }
}
