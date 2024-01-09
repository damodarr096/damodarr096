package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown_handling123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		
	    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement IDENAME = driver.findElement(By.id("ide"));
		Select se=new Select(IDENAME);
		se.selectByIndex(3);
		Thread.sleep(3000);
		se.selectByValue("ec");
		Thread.sleep(3000);
	    se.selectByVisibleText("Visual Studio");
	    Thread.sleep(3000);
	    se.deselectByVisibleText("Eclipse");
	    Thread.sleep(3000);
	    se.selectByVisibleText("Eclipse");
	    driver.quit();
	    
	    
		
	
}

}
