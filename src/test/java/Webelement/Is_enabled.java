package Webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_enabled {

	public static void main(String[] args)
	{
	  
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://www.facebook.com/");
		
		//actions to perform
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		
		if(loginbutton.isEnabled()) {
			
			System.out.println("pass");
			loginbutton.click();
		}
		else{
			System.out.println("fail");
		}
		
	}
}
