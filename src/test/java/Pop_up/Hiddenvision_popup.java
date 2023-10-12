package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hiddenvision_popup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe");
		
		//WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new ChromeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://www.redbus.com/");
        driver.findElement(By.xpath("//span[text()='Date']")).click();
        driver.findElement(By.xpath("//div[text()='Sep']/ancestor::div[@class='sc-jzJRlG dPBSOp']//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw'] "));
       
	}

}
