package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions; 

public class Implici_explicit_wait {

	public static void main(String[] args) 
	{
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
         //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		//explicit wait method
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		// to open the application
		driver.get("https://www.facebook.com/");
		//address of email text field
		driver.findElement(By.id("email")).sendKeys("Sarath");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
	}

}
