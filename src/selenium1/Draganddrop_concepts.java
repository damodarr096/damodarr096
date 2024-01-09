package selenium1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop_concepts {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
//		=================================================================
		
//		driver.get("https://demo.guru99.com/test/drag_drop.html");		
//      WebElement dragelement=driver.findElement(By.xpath("//a[text()=\" 5000 \"]"));
//      WebElement dropelement= driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
//      act.dragAndDrop(dragelement, dropelement).build().perform();
//      WebElement drageElement=driver.findElement(By.xpath("(//a[@style=\"color:#FFFFFF;\"])[5]"));
//     WebElement dropelElement= driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
//     act.dragAndDrop(drageElement, dropelElement).build().perform();     
//     WebElement dragelemElement=driver.findElement(By.xpath("//a[text()=\" SALES \"]"));
//     WebElement dropelElement2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
//     act.dragAndDrop(dragelemElement, dropelElement2).build().perform();
//     WebElement dragElement2= driver.findElement(By.xpath("//a[text()=\" 5000\"]"));
//     WebElement dropelememt=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));      
//     act.dragAndDrop(dragElement2, dropelememt).build().perform();          
//   TakesScreenshot AA=(TakesScreenshot)driver;
//   File BB= AA.getScreenshotAs(OutputType.FILE);
//   File target=new File("E:\\automition training\\damodar.png");
//   FileUtils.copyFile(BB, target);   
//   WebElement draw= driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
//   File www=draw.getScreenshotAs(OutputType.FILE);
//   File sss=new File("E:\\automition training\\dmr.png");
//   FileUtils.copyFile(www, sss);
//  driver.quit();
		
//		========================================================================
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement dragelement=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement dropelement=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
      act.dragAndDrop(dragelement, dropelement).build().perform();
      WebElement drageElement=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
      WebElement dropelElement=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
      act.dragAndDrop(drageElement, dropelElement).build().perform();
      WebElement dragelElement=  driver.findElement(By.xpath("//*[@id=\"box1\"]"));
      WebElement dropeElement= driver.findElement(By.xpath("//*[@id=\"box101\"]"));
      act.dragAndDrop(dragelElement, dropeElement).build().perform();
      WebElement dragelElement2=driver.findElement(By.xpath("//*[@id=\"box4\"]"));
      WebElement dropeElement2=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
      act.dragAndDrop(dragelElement2, dropeElement2).build().perform();
      WebElement dragelElement3= driver.findElement(By.xpath("//*[@id=\"box5\"]"));
      WebElement dropelElement2=driver.findElement(By.xpath("//*[@id=\"box105\"]"));
      act.dragAndDrop(dragelElement3, dropelElement2).build().perform();
      WebElement dragelElement4=driver.findElement(By.xpath("//*[@id=\"box2\"]"));
      WebElement dropeElement3=driver.findElement(By.xpath("//*[@id=\"box102\"]"));
      act.dragAndDrop(dragelElement4, dropeElement3).build().perform();
      WebElement dragElement2=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
      WebElement dropeElement4=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
      act.dragAndDrop(dragElement2, dropeElement4).build().perform();
       //screenshot particular page  
      WebElement draw1= driver.findElement(By.xpath("//div[@id=\"countries\"]"));
      File www=draw1.getScreenshotAs(OutputType.FILE);
      File sss=new File("C:\\Users\\user\\Desktop\\charani_infotec\\damo.png");
      FileUtils.copyFile(www, sss);

      
      
      
      
	}

}
