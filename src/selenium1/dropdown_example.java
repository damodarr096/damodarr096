package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64_118\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		WebElement dateof_birth=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select se =new Select(dateof_birth);
		se.selectByIndex(5);
		WebElement	month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select se1 =new Select(month);
		se1.selectByIndex(3);
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select se12 =new Select(year);
		se12.selectByIndex(26);
//		driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
		driver.findElement(By.name("(sex)[2]")).click();
		
	}

}
