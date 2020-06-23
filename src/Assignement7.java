import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.id("product"));	
		List<WebElement> Rows=table.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		int rowCount=Rows.size();
		System.out.println("Row Count"+ rowCount);
		int colCount=driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println("Column Count"+colCount);
		for(int i=0;i<=colCount;i++) {
			String text=driver.findElements(By.xpath("//table[@id='product']/tbody/tr[3]/td")).get(i).getText();
			System.out.println(text);
		}
		
		
	}

}
