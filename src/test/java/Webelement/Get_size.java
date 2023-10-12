package Webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_size 
{
	public static void main(String[] args) {
		
	
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
	Dimension size = emailTF.getSize();
	int h= size.getHeight();
	int w = size.getWidth();
	System.out.println(h);
	System.out.println(w);
	
	}
}
