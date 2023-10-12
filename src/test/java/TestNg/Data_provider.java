package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_provider {
	@DataProvider
	public Object[][] getdata(){
		Object[][] a = new Object[3][2];
		a[0][0]= "Sarath";
		a[0][1]= "!23";
		
		a[1][0]="Java";
		a[1][1]="Selenium";
		
		a[2][0]="Qspider";
		a[2][1]="Java";		
		
		return a;
	}
	
	@Test(dataProvider="getdata")
	public void facebook(String data,String data1) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(data);
		driver.findElement(By.id("pass")).sendKeys(data1);
	}

}
