package firstMavenProject.firstPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelFile {
	static WebDriver driver;
    static String URL = "https://www.leafground.com/";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFile.openBrowser();
		ExcelFile.launchURL(URL+"message.xhtml");

        WebElement firstName_txtbox = driver.findElement(By.id("j_idt100:firstName"));
        firstName_txtbox.sendKeys(ExcelFile.readExcelValues(1, 1));

        WebElement lastName_txtbox = driver.findElement(By.id("j_idt100:lastname"));
        lastName_txtbox.sendKeys(ExcelFile.readExcelValues(2, 1));

	}
	public static void openBrowser() {
        // Implementation needed
    }
	public static void launchURL(String pageURL) {
        // Implementation needed
    }
	public static String readExcelValues(int rowNumber, int cellNumber) throws IOException {
        // Implementation needed
    	FileInputStream file=new FileInputStream("C:\\Users\\vaishnavi-G6\\Downloads");
		
		//Creating a workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//Navigate to sheet
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		
		//Navigate to cell and take the value
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();

    }

}
