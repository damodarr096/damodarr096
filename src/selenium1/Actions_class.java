package selenium1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement element=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
	List<WebElement> ul=driver.findElements(By.xpath("//li[contains(@class,\"context-menu-item context-menu-icon\")]"));
														
		for (WebElement Li:ul)
		{
			Actions act= new Actions(driver);
			act.contextClick(element).build().perform();
			Li.click();
			Thread.sleep(1000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
       }
		driver.quit();
		System.out.println("Operation completed.........!");
		
		
	   }

       }

