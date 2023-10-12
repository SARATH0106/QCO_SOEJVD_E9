package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_write_excelfile {

	public static void main(String[] args) throws Throwable 
	{
		//reading data
		FileInputStream fis = new FileInputStream ("src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get(url);
		String title = driver.getTitle();
		
		//writing data
		wb.getSheet("Sheet1").createRow(8).createCell(0).setCellValue(title);
		FileOutputStream fos = new FileOutputStream("src\\\\test\\\\resources\\\\Testdata.xlsx");
		wb.write(fos);
		
		
			
	}

}
