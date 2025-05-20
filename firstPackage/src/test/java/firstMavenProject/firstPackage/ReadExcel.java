package firstMavenProject.firstPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.InputUtility;

public class ReadExcel extends InputUtility{
	static WebDriver driver;
	//static String URL="https://www.leafground.com/";

	public static void main(String[] args) throws Exception {
	  ReadExcel.openBrowser();
	  ReadExcel.launchURL(URL);
	  ReadExcel.takeSnapShot("HomePage");
	  ReadExcel.launchURL(URL+"messages.xhtml");
	  ReadExcel.takeSnapShot("Messages Page");
	  
	 
	  
		 	
		
	}
	
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public static void launchURL(String pageURL) {
		driver.get(pageURL);
		
	}
	public static String readExcelValues(int rowNumber,int cellNumber) throws IOException{
		//create excel workbook - done
		
		//Path of the excel file
		FileInputStream file=new FileInputStream("C:\\Users\\Naveen\\Desktop\\AutomationTraining.xlsx");
		
		//Creating a workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//Navigate to sheet
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//Navigate to cell and take the value
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		
	}
	public static void scrollToBottom() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("scroll(0, 2500);");
	}
	public static void takeSnapShot(String fileName) throws Exception{
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("C:\\Users\\Naveen\\eclipse-workspace\\firstPackage\\SeleniumScreenshots\\"+fileName+".jpg"));
		System.out.println("Screenshot is captured");
		}

}
