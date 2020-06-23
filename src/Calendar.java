import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		while(!driver.findElement(By.cssSelector(".ui-datepicker-month")).getText().contains("October"))
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector(".ui-state-default"));
		int datecount=dates.size();
		for(int i=0;i<=datecount;i++)
		{
			String date=dates.get(i).getText();
			if(date.equalsIgnoreCase("23"))
			{
				dates.get(i).click();
				break;
			}
		}
		//driver.quit();
	}

}
