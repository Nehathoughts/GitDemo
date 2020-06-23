import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		WebElement Frametop=driver.findElement(By.xpath(("//frame[@name='frame-top']")));
		
		WebElement FrameMiddle=driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		
		driver.switchTo().frame(Frametop);
	
		driver.switchTo().frame(FrameMiddle);
		
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
