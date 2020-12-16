package Hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import QA.Factory.DriverFactory;
import Utillity.ConfigReader;
import io.cucumber.java.Before;

public class SFHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();

	}
	
	@Before(order = 1)
	public void launchBrowser() {
		
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driverFactory.init_driver(browserName);
		
	}

}
