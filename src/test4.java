import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hjhjj");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bjhbkjuyh");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hjhjj");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("bjhbkjuyh");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}
