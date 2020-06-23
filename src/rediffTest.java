import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hjjgtrbnb");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("6866tu9");
		driver.findElement(By.xpath("//input[contains(@name='procee')]")).click();
		
	}

}
