package firstMavenProject.firstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VennilaScript {
	static WebDriver driver;
	//Assign String varaible
	//Create method for launch URL
	//Create method for browser with if condition
	
	//String,Method,Package
	

	public static void main(String[] args) {
		
		String url="https://www.leafground.com";
		
		//get page title
		VennilaScript.openBrowser(driver,"chrome");
		driver.get(url+"/input.xhtml;jsessionid=node0bbbsiwujdp6i13svmfhdsg3zq432152.node0");
		
		System.out.println(driver.getTitle());
		java.util.List<WebElement> textBoxs= driver.findElements(By.tagName("input"));
		System.out.println(textBoxs.size());
		
		//get attribute
		VennilaScript.openBrowser(driver,"Firefox");
		driver.get(url+"/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		WebElement element= driver.findElement(By.id("j_idt88:j_idt100"));
		String n= element.getText();
		System.out.println(n);
		String n1= element.getAttribute("type");
		System.out.println(n1);
		
		//click,sendkeys
		VennilaScript.openBrowser(driver,"Edge");
		driver.get(url+"/input.xhtml;jsessionid=node0bbbsiwujdp6i13svmfhdsg3zq432152.node0");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement Justmessage_textbox= driver.findElement(By.xpath("//input[@id=\"j_idt106:thisform:age\"]"));
		Justmessage_textbox.click();
		Justmessage_textbox.sendKeys("ERROR MESSAGE");
		Justmessage_textbox.clear();
		Justmessage_textbox.sendKeys("Retype Error");
		
	}
	
	
	public static void openBrowser(WebDriver driver,String browserName) {
		
		if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		}
		else if (browserName.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver1 = new FirefoxDriver();
			driver1.manage().window().maximize();
		}
		else if (browserName.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			WebDriver driver1 = new EdgeDriver();
			driver1.manage().window().maximize();
		}
		
	}

}
