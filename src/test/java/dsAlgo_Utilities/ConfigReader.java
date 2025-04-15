package dsAlgo_Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static String browserType = null;
	private static Properties properties;
	private final static String propertyFilePath = "src/test/resources/dsAlgo_Configurations/config.properties";

	// To get the path of config properties file
	public ConfigReader() {

		try {

			BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));

			properties = new Properties();

			try {

				properties.load(reader);

			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + propertyFilePath);
		}

	}

	// Get the url details from config properties file
	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url is not found in config.properties file.");

	}

	public static void setBrowserType(String browser) {

		browserType = browser;

	}

	// To get the browsers from testng.xml
	public static String getBrowserType() throws Throwable {

		if (browserType != null) {

			return browserType;
		} else {

			throw new RuntimeException("browser is not specified in the testng.xml");

		}

	}

}
