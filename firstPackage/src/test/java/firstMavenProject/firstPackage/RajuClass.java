package firstMavenProject.firstPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RajuClass {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		//Path of the excel file
		FileInputStream fs = new FileInputStream("C:\\Users\\Naveen\\Desktop\\AutomationTraining.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		

	}
	

}
