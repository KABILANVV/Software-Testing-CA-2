package CIA2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question3 {
  @Test
  public void qn3() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.trivago.in/en-IN/srl/cheap-hotels-pondicherry-india?search=200-64948;dr-20230511-20230512;so-4");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Pondicherry Hotels | Find & compare great deals on trivago"))
			System.out.println("Title validated");
		else 
			System.out.println("Title  not validated");

		Thread.sleep(32000);
		
		
	  List<WebElement> sele = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section"));

      System.out.println(sele.size());
      int i=0;
      for (WebElement webElement : sele) {
    	  if(i==5)
    		  break;
          String name = webElement.getText();
          System.out.println(name);
          i++;
      }
	  
  }
}
