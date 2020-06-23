import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nehagirdenia");
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("356771");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		

	}

}
