package Drop_downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Skillrary_multi_dd {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://demoapp.skillrary.com/ ");
		
		WebElement dD = driver.findElement(By.xpath("//select[@id='cars']"));	
		//handling drop downs
		Select s = new Select(dD);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		
		Thread.sleep(3000);
		s.selectByValue("199");
		Thread.sleep(3000);
		s.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		Thread.sleep(3000);
		s.deselectByIndex(0);
		s.deselectByValue("199");
		s.deselectByVisibleText("INR 300 - INR 399 ( 1 )");
		List<WebElement> values = s.getAllSelectedOptions();
		
         for(WebElement b : values) {
        	 	System.out.println(b.getText());
         }

	}

}
