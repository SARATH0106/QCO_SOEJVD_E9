package Drop_downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_single_DD {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://www.amazon.com/");
		
		WebElement dD = driver.findElement(By.xpath("//select[@class='nav-search-facade']"));
		
		//handling drop downs
		Select s = new Select(dD);
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.deselectByVisibleText("Books");
		System.out.println(s.isMultiple());
				List<WebElement> all = s.getOptions();
				System.out.println(all.size());
         for(WebElement b : all) {
        	 	System.out.println(b.getText());
         }
	}

	
}
