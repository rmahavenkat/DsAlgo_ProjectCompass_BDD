package dsAlgo_stepDefinition;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.LoggerReader;
import java.io.ByteArrayInputStream;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import java.io.File;
import java.io.IOException;

public class hooks {

	public static WebDriver driver;

	@BeforeAll
	public static void setupAll() throws Throwable {
		LoggerReader.info("browser opened");
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
		driverfactory.initdriver(browser);
		LoggerReader.info("browser initialized");
		LoggerReader.info("browser opened get driver");
		driverfactory.getDriver().get(ConfigReader.getApplicationUrl());
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
			
			// Extent reports or saving file
			File screenshotFile = screenshotTaker.getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshotFile);
			scenario.attach(fileContent, "image/png", "screenshot");
		}
	}

	@AfterAll
	public static void teardown() throws Throwable {

		LoggerReader.info("Closing browser after all tests");
		driverfactory.getDriver().close();
	}
}
