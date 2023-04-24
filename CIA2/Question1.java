package CIA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
  @Test
  public void qn1() throws InterruptedException {
	  	WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.trivago.in/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("trivago.in - Compare hotel prices worldwide"))
			System.out.println("Title validated");
		else 
			System.out.println("Title  not validated");

		Thread.sleep(2000);
		WebElement loc=driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]"));
		loc.click();
		Thread.sleep(2000);
		
		WebElement sel=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[1]"));
		sel.click();
		Thread.sleep(4000);
		
		
		WebElement s1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[11]"));
		s1.click();
		Thread.sleep(4000);
		
		WebElement s2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[12]"));
		s2.click();
		Thread.sleep(4000);
		
		WebElement p1=driver.findElement(By.id("checkbox-13"));
		p1.click();
		Thread.sleep(2000);
		
		WebElement apply=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/button"));
		apply.click();
		Thread.sleep(30000);
        
		WebElement sel1=driver.findElement(By.name("guest_rating_filters"));
		Select se1=new Select(sel1);
		se1.selectByIndex(0);
		Thread.sleep(2000);
		
		
		WebElement h1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/button"));
		h1.click();
		Thread.sleep(2000);
		
		
		
		WebElement f1=driver.findElement(By.xpath("//*[@id=\"checkbox-257\"]"));
		f1.click();
		Thread.sleep(2000);
		
		WebElement f2=driver.findElement(By.xpath("//*[@id=\"checkbox-394\"]"));
		f2.click();
		Thread.sleep(2000);
		
  }

}
