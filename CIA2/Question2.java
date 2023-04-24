package CIA2;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {
	
  @Test
  public void qn1() throws InterruptedException {
	  	WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.trivago.in/en-IN/lm/hotels-pondicherry-india?search=200-64948;dr-20230511-20230512");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Pondicherry Hotels | Find & compare great deals on trivago"))
			System.out.println("Title validated");
		else 
			System.out.println("Title  not validated");

		Thread.sleep(32000);
		
		
		WebElement sel1=driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
		Select se1=new Select(sel1);
		se1.selectByIndex(3);
		Thread.sleep(2000);
		

		List<WebElement> sele = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section"));

	      int i=0;
	      for (WebElement webElement : sele) {
	    	  if(i==1)
	    		  break;
	          String name = webElement.getText();
	          System.out.println(name);
	          i++;
	      }
		
		WebElement h3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span[2]"));
		System.out.println(h3.getText());
		Thread.sleep(2000);

		WebElement h4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]"));
		System.out.println(h4.getText());
		Thread.sleep(2000);
  }

}
