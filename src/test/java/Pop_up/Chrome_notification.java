package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_notification {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe");
		
		//WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get("https://www.redbus.com/");
		
	}

}
