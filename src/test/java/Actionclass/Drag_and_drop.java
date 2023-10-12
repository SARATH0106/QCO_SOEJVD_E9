package Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
					
public class Drag_and_drop {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
         //maximizing the window
		driver.manage().window().maximize();
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// to open the application
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement block1 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[1]"));
		WebElement block4 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[4]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(block1, block4).perform();
		
	}

	
}
	