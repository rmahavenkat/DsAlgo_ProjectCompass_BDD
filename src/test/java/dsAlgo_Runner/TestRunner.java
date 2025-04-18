package dsAlgo_Runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.LoggerReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		plugin = { "pretty", "html:target/reports.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"com.aventstack.chaintest.plugins.ChainTestCucumberListener:" }, // reporting purpose
		dryRun = false, monochrome = true, // console output color
		// tags = "@stackScenario", // tags from feature file
		features = { "src/test/resources/dsAlgo_FeatureFiles" }, // location of feature files
		glue = { "dsAlgo_stepDefinition" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	@Parameters("browser")

	public void defineBrowser(@Optional("chrome") String browser) throws Throwable {
		ConfigReader.setBrowserType(browser);
		driverfactory.initdriver(browser);// get new driver instance
	}

	@AfterTest
	public static void teardown() throws Throwable {
		LoggerReader.info("Closing browser after all tests");
		driverfactory.quitDriver();
	}

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();

	}

}
