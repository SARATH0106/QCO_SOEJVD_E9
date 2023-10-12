package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

import org.openqa.selenium.By;

public class css_selector {

	public static void main(String[] args)
	{
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the empty edge browser
				WebDriver driver = new EdgeDriver();
		         //maximizing the window
				driver.manage().window().maximize();
				// to open the application
				driver.get("https://www.facebook.com/");
				//address of email text field
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Sarath");
	}

}
