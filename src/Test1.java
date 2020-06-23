import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:\\facebook.com");
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
	driver.findElement(By.id("u_0_m")).sendKeys("Neha");
	driver.findElement(By.id("u_0_o")).sendKeys("Mishra");
	driver.findElement(By.name("reg_email__")).sendKeys("nehamishra.71086@gmail.com");
	
	Select S=new Select(driver.findElement(By.id("day")));
	S.selectByVisibleText("7");
	Select S1=new Select(driver.findElement(By.name("birthday_month")));
	S1.selectByValue("10");
	Select S2=new Select(driver.findElement(By.name("birthday_year")));
	S2.selectByVisibleText("1986");
	driver.findElement(By.id("u_0_6")).click();
	driver.findElement(By.name("websubmit")).click();
		
		
	
	
	
	}

}
