package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://www.amazon.com/");
		
		//down casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/amazon.png");
		FileUtils.copyFile(src, dest);

	}

}
