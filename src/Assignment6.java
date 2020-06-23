import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click();;
		
		String text=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
		System.out.println(text);
		Select a=new Select(driver.findElement(By.id("dropdown-class-example")));
		a.selectByVisibleText(text);
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String Result=driver.switchTo().alert().getText();
		
		if(Result.contains(text)) {
			System.out.println("Succeful");
		}
		else
		{
			System.out.println("Failure");
		}
	}

}
