package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement course_1=driver.findElement(By.xpath("//*[@id=\"course\"]"));
		Select se=new Select(course_1);
		se.selectByIndex(2);
		Thread.sleep(3000);
		se.selectByValue("python");
		Thread.sleep(4000);
		se.selectByVisibleText("Dot Net");
		Thread.sleep(4000);
		se.selectByValue("js");
		
	}

}
