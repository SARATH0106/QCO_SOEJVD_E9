package Basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable 
	{

		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
         //maximizing the window
		driver.manage().window().maximize();
		// to open the application
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();;
	}

}
