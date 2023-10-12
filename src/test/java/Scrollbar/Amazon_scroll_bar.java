package Scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_scroll_bar {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://www.amazon.com/");
		WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));
		
		//downcasting
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView()", careers);
		Thread.sleep(3000);
		//career.click();
		js.executeScript("arguments[0].click()", careers);
		

	}

}
