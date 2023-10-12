package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Preceding_method {

	public static void main(String[] args) {
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the empty edge browser
				WebDriver driver = new EdgeDriver();
		         //maximizing the window
				driver.manage().window().maximize();
				// to open the application
				driver.get("https://www.facebook.com/");
				
				//following method
				driver.findElement(By.xpath("//a[text()='New Releases']/preceding-sibling::a[@data-csa-c-content-id='nav_cs_gb']"));

	}

}
