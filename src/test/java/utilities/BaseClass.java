package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.DashboardPage;
import pageObject.LoginPage;

public class BaseClass {
	private static WebDriver driver;

	@BeforeTest
	public static WebDriver getDriver() {
		if (driver == null) {
			switch (BaseClass.getProperty("browser")) {
			case ("chrome"):
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");
				driver = new ChromeDriver();
				break;
			case ("firefox"):
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case ("safari"):
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case ("edge"):
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			}// switch statement
			driver.get(BaseClass.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Constants.implicit_wait_time, TimeUnit.SECONDS);
			PageInitializer.initialize();
		} // if statement

		return driver;
	}// getDriver Method

	LoginPage lp = new LoginPage();
	DashboardPage dp = new DashboardPage();

	@BeforeClass
	public void login() {
	
		getDriver();
		lp.username.sendKeys(BaseClass.getProperty("userName"));
		lp.password.sendKeys(BaseClass.getProperty("password"));
		lp.button.click();
		Assert.assertEquals(dp.dashboardPageText.getText(), "Dashboard");
	}

	private static Properties properties;

	static {
		try {
			String filePath = Constants.propertiesFilePath;
			FileInputStream file = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(file);
			file.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getProperty(String keyName) {

		return properties.getProperty(keyName);
	}

	

}
