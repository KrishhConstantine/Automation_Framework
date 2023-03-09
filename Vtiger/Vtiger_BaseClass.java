package Vtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class Vtiger_BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	public FileInputStream FIS;
	public Properties prop;
	public String URL;
	public Vtiger_POM pom;
	public SoftAssert SA;

	@BeforeClass
	public void openbrowser() throws IOException 
	{
		driver = new ChromeDriver();
		FIS = new FileInputStream("./Data/Vtiger_Datadriven_framework.txt");
		prop = new Properties();
		prop.load(FIS);
		URL = prop.getProperty("url");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		SA = new SoftAssert();
	}

	@BeforeMethod
	public void Enter_Homepage() {
		Reporter.log("Vtiger Homepage",true);
		pom = new  Vtiger_POM();
		PageFactory.initElements(driver, pom);
	}

	@AfterMethod
	public void Exit_Homepage() {
		Reporter.log("Exit_Homepage",true);
	}

	@AfterClass
	public void Close_Browser() {
		driver.quit();
	}
}
