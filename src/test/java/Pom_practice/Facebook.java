package Pom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.Facebook_login_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get("https://www.facebook.com/");
		
		//object creation
		Facebook_login_page fbl = new Facebook_login_page (driver);
		
	fbl.emailTextfield("Sarath");
    fbl.passwordtextfield("Sarath123");
    fbl.loginButton();
    
	
	}

}
