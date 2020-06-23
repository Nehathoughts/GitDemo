import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("//a[@title='Lightning fast free email']/following-sibling::a[2]")).click();
		driver.findElement(By.xpath("//a[@title='Lightning fast free email']/parent::div")).click();
	}

}
