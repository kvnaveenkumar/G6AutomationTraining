package firstMavenProject.firstPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserChrome {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * driver.get("https://www.leafground.com/drag.xhtml");
		 * 
		 * //WebElement
		 * dragAndDrop_box=driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		 * 
		 * 
		 * Actions action=new Actions(driver); action.dragAndDropBy(dragAndDrop_box,
		 * 500, 0).build().perform();
		 * 
		 * //WebElement on which drag and drop operation needs to be performed
		 * WebElement fromElement =
		 * driver.findElement(By.xpath("//div[@id='form:drag']"));
		 * 
		 * //WebElement to which the above object is dropped WebElement toElement =
		 * WebElement toElement =
		 * driver.findElement(By.xpath("//div[@id='form:drop']"));
		 * 
		 * //Creating object of Actions class to build composite actions Actions
		 * builder=new Actions(driver);
		 * 
		 * //Building a drag and drop action Action dragAndDrop =
		 * builder.clickAndHold(fromElement) .moveToElement(toElement)
		 * .release(toElement) .build();
		 * 
		 * //Performing the drag and drop action dragAndDrop.perform();
		 * 
		 * Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Dropped!']")).
		 * getText(), "Dropped!");
		 */

		driver.get("https://www.leafground.com/grid.xhtml");
		WebElement searchBox = driver.findElement(By.id("form:dt-products:globalFilter"));

		Actions a = new Actions(driver);
		a.sendKeys(searchBox, "Shirt").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//span[text()='Product Details']")).getText());

		/*
		 * Actions action = new Actions(driver);
		 * action.dragAndDropBy(driver.findElement(By.xpath("//div[@id='form:conpnl']"))
		 * , 50, 300).build().perform();
		 * 
		 * 
		 * //WebElement on which drag and drop operation needs to be performed
		 * WebElement fromElement =
		 * driver.findElement(By.xpath("//div[@id='form:drag']"));
		 * 
		 * //WebElement to which the above object is dropped WebElement toElement =
		 * driver.findElement(By.xpath("//div[@id='form:drop']"));
		 * 
		 * //Creating object of Actions class to build composite actions Actions builder
		 * = new Actions(driver);
		 * 
		 * //Building a drag and drop action Action dragAndDrop =
		 * builder.clickAndHold(fromElement) .moveToElement(toElement)
		 * .release(toElement) .build();
		 * 
		 * //Performing the drag and drop action dragAndDrop.perform();
		 * 
		 * Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Dropped!']")).
		 * getText(), "Dropped!");
		 */

	}

}
