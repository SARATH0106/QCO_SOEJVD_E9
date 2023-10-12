package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_index {

	public static void main(String[] args) 
	{
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the empty edge browser
				WebDriver driver = new EdgeDriver();
		         //maximizing the window
				driver.manage().window().maximize();
				// to open the application
				driver.get("https://demoapp.skillrary.com/");
				
				driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).click();
				
	}

}
