package Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubleclick {

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
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		
		//address of plus icon
		WebElement plusicon = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.doubleClick(plusicon).perform();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
	}

}
