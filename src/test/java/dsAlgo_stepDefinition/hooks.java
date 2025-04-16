package dsAlgo_stepDefinition;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.LoggerReader;
import java.io.ByteArrayInputStream;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import java.io.File;
import java.io.IOException;

public class hooks {

	public static WebDriver driver;
	public static boolean isDriverInitialized = true;
	@Before
	public void setup() throws Throwable {
		if (!isDriverInitialized) {
			String browser = ConfigReader.getBrowserType(); // Make sure this returns a value
			driver = driverfactory.initdriver(browser); // initializing driver here
			driver.get(ConfigReader.getApplicationUrl()); // Also ensure this returns a proper URL
			isDriverInitialized = true;
		}
	}
	
	@AfterStep
	public void afterstep(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			LoggerReader.error("Steps Failed, Taking Screenshot");
			
			// For allure reports
			TakesScreenshot screenshotTaker = (TakesScreenshot) driverfactory.getDriver();
			final byte[] screenshot = screenshotTaker.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot", new ByteArrayInputStream(screenshot));

			/*// For Extent Reports
			File screenshot_Extent = (File) driverfactory.getDriver();
			byte[] fileContent = FileUtils.readFileToByteArray(screenshot_Extent);
			scenario.attach(fileContent, "image/png", "screenshot");*/
			// Extent reports or saving file
			File screenshotFile = screenshotTaker.getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshotFile);
			scenario.attach(fileContent, "image/png", "screenshot");
		}
	}

	@AfterTest
	public static void teardown() throws Throwable {
		if (driver != null) {
			LoggerReader.info("Closing browser after all tests");
			driverfactory.quitDriver();
		}
	}

}
