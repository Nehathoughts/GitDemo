import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String Country=("return document.getElementById(\"autocomplete\").value;");
		String CountryName=(String) js.executeScript(Country);
		while(!CountryName.equalsIgnoreCase("INDIA"))
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			CountryName=(String) js.executeScript(Country);
			
		}
		System.out.println(CountryName);
	}

}
