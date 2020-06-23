import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded= {"Tomato","Corn","Beetroot"};
		ItemsNeeded(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[(text(),'PROCEED TO CHECKOUT')]")).click();
				
			
	}
		public static void ItemsNeeded(WebDriver driver,String[] itemsNeeded)
		{
			List<WebElement> products=driver.findElements(By.className("product-name"));
			for(int i=0;i<=products.size();i++)
			{
			String[] name=products.get(i).getText().split("-");
			String FormattedName=name[0].trim();
		
			List<String> itemNeededList=Arrays.asList(itemsNeeded);
			if(itemNeededList.contains(FormattedName))
			{
				int j=0;
				j++;
				driver.findElements(By.xpath("//button[@type='button']")).get(i).click();
				if(j==itemNeededList.size())
				{
					break;
				}
				
			}
			}
		}

	}


