package firstMavenProject.firstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.InputUtility;

public class ReadFileFromClass {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ReadExcel.openBrowser();
		  //ReadExcel.launchURL(URL+"messages.xhtml");
		  driver.get("https://www.leafground.com/messages.xhtml");
		  
		  WebElement firstName_txtbox=driver.findElement(By.id("j_idt100:firstname"));
		  firstName_txtbox.sendKeys("test");
		  //firstName_txtbox.sendKeys(firstNameValue);
		  
		  WebElement lastName_txtbox=driver.findElement(By.id("j_idt100:lastname"));
		 // lastName_txtbox.sendKeys(lastNameValue);
		  
		  WebElement email_txtbox=driver.findElement(By.id("j_idt100:email"));
		  //email_txtbox.sendKeys(emailValue);
		 

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
}
