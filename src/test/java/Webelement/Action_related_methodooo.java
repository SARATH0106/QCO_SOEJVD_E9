package Webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_related_methodooo {

	public static void main(String[] args) throws Throwable 
	{
	
		//edge driver related statement
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
				
				 emailTF.sendKeys("sarath");
				 Thread.sleep(3000);
				 emailTF.clear();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//button[@type='submit']")).submit();
				
				 
		
	}

}
