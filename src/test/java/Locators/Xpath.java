package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
         //maximizing the window
		driver.manage().window().maximize();
		// to open the application
		driver.get("https://www.facebook.com/");
		
		// getting address of email text field using xpath attributes
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sarath");
        
        // address of pswd text field using xpath contains attribute
        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("12345678");
        
        
       //address of forgotten pswd using xpath text
        driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

}
