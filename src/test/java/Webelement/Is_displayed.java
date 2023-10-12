package Webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_displayed {

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
		WebElement emailTF = driver.findElement(By.xpath("//input[@id='email']"));
		
		if(emailTF.isDisplayed()) {
			System.out.println("pass");
			emailTF.sendKeys("Sarath");
		}
		else {
			System.out.println("fail");
		}
		
		
		

	}

}
