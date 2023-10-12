package Autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAS {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("phones");
		Thread.sleep(3000);
		List<WebElement> allvalues = (List<WebElement>) driver.findElement(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(3000);
		System.out.println(allvalues.size());
		for(WebElement b : allvalues) {
			
			System.out.println(b.getText());
			
		}
		Thread.sleep(3000);
		driver.close();
	}
	
}
