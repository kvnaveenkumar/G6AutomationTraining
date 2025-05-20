package firstMavenProject.firstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		
		Dropdown.openBrowser();
				
				String a=Dropdown.baseURL();
				
				driver.get(a+"select.xhtml;jsessionid=node01mif0zdzdo9az154dtnli2xsaq930207.node0");
				
				WebElement automationTool=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
				
				Select dd=new Select(automationTool);
				//dd.selectByIndex(2);
				//dd.selectByValue("eggs");
				dd.selectByVisibleText("Puppeteer");
				
	}
	
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static String baseURL() {
		String url="https://www.leafground.com/";
		return url;
	}

}
