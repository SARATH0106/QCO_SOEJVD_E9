package Webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_selected {

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
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//actions to perform
		WebElement feRadiobutton = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		
		if(feRadiobutton.isSelected()) {
			System.out.println("pass");
			feRadiobutton.click();
		}
		else {
			System.out.println("fail");
		}
		
      
	}

}
