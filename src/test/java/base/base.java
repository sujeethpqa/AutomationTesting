package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static WebDriver driver;
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static String path = System.getProperty("user.dir");
	public static EventFiringDecorator e_driver;
	public static WebDriverListener eventListener;
	
	public static String readProperty(String name) throws IOException {
		file = new File(path + "\\src\\test\\resources\\config.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		return prop.getProperty(name);
	}

	public static void launchApplication() throws IOException {
		String im = readProperty("implicitTmeout");
		Long impTime= Long.parseLong(im);
		switch (readProperty("browser")) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("Launching browser...");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			driver = new ChromeDriver();
			break;
		}
		
//		eventListener = new WebEventListener();
//		WebDriver decorated = new EventFiringDecorator(listener).decorate(original);
//		
//		e_driver = new EventFiringDecorator(driver);
//		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		eventListener = new WebEventListener();
//		e_driver.register(eventListener);
//		driver = e_driver;
//		
		
//		WebDriver doriginal = new FirefoxDriver();
//		   WebDriverListener listener = new MyListener();
//		   WebDriver decorated = new EventFiringDecorator(listener).decorate(driver);
//		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impTime));
		driver.get(readProperty("url"));
	} 

	
	public static void quits() {
		driver.quit();
	}

}
