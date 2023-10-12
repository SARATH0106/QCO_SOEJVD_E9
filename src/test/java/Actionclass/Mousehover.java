package Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) throws Throwable 
	{
	
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://www.snapdeal.com/");
		
		//address of sign in
		WebElement signin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		//create an object for action class
		Actions a = new Actions(driver);
		a.moveToElement(signin).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		
	}

}
