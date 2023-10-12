package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

public class id_name_linktext_partiallinktext {

	public static void main(String[] args) throws Throwable {
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the empty edge browser
				WebDriver driver = new EdgeDriver();
		         //maximizing the window
				driver.manage().window().maximize();
				// to open the application
				driver.get("https://www.facebook.com/");
               //address of email text field
				driver.findElement(By.id("email")).sendKeys("Sarath");
				Thread.sleep(3000);
				// address of password text field
				driver.findElement(By.name("pass")).sendKeys("123456789");
				Thread.sleep(3000);
				// address of login button
				//driver.findElement(By.name("login")).click();
				// select the create page option
				driver.findElement(By.linkText("Create a Page")).click();
				
	}

}
