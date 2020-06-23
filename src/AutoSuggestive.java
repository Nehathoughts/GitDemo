import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.id("fromPlaceName")).click();
		//BENGALURU INTERNATION AIRPORT
		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		int i=0;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 String script= "return document.getElementById(\"fromPlaceName\").value;";
		 String text=(String) js.executeScript(script);
		 System.out.println(text);
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			
		i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
				//System.out.println("element not found");
				break;
			}
		}
		if(i>10)
		{
			System.out.println("element not found");
			
		}
		else
		{
			System.out.println("element found");	
		}
	}

}
