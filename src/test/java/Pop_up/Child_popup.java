package Pop_up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
	     //maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
						
		// to open the application
		driver.get("https://skillrary.com/");	
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' English ']")).click();
		driver.findElement(By.xpath("(//a[@class='multi_lang'])[1]")).click();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
			Set<String> child = driver.getWindowHandles();
			
			for(String b : child) {
				driver.switchTo().window(b);
			}
          driver.findElement(By.id("mytext")).sendKeys("Sarath");
          Thread.sleep(3000);
          driver.switchTo().window(parent);
          driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
			
			
	}

}
