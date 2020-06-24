import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");
		Select s1=new Select(driver.findElement(By.id("Childrens")));
		s1.selectByValue("2");
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		System.out.println("branching");
		System.out.println("branching1");
		System.out.println("branching2");

	}

}
