package br.com.dextra.expertus.environment;

import org.openqa.selenium.WebDriver;

/**
 * Environment is an abstract class that represents a test environment. It has
 * the objects that you need to implement your selenium tests.
 * 
 * @author leandro.guimaraes
 */
public abstract class Environment {

	protected static final String ENVIRONMENT_PLATFORM = "expertus.environment.platform";

	protected static final String ENVIRONMENT_BROWSER = "expertus.environment.browser";

	protected static final String ENVIRONMENT_BROWSER_VERSION = "expertus.environment.browser.version";

	private WebDriver driver;

	public abstract WebDriver createDriver();

	public WebDriver getDriver() {
		return this.driver;
	}

}
