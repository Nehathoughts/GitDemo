import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.findElement(By.linkText("Practice Projects")).click();
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Neha Girdenia");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("neha.girdenia@gmail.com");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.xpath("//*[text()=' Automation Practise - 1']")).click();
		//driver.findElement(By.cssSelector("input[placeholder*='search for']")).sendKeys("Cucumber");
	}

}
