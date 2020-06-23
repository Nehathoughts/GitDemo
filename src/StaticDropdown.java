import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Assert.assertFalse(	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		Assert.assertTrue(	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		WebElement Source=driver.findElement(By.id(("glsctl00_mainContent_ddl_originStation1_CTNR")));
		Source.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click();
		Thread.sleep(2000);;
	//WebElement destination=driver.findElement((By.id("glsctl00_mainContent_ddl_destinationStation1_CTNR")));
	//destination.findElement(By.xpath("//a[@value='GWL']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GWL']")).click();
		//driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		driver.findElement(By.id(("divpaxinfo"))).click();
		WebElement Adult=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select s1=new Select(Adult);
		s1.selectByValue("3");
		WebElement child=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		
		Select s2=new Select(child);
		s2.selectByValue("2");
		WebElement infant=driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select s3=new Select(infant);
		s3.selectByValue("2");
		WebElement currency=driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(currency);
		s.selectByValue("USD");
		//driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id(("ctl00_mainContent_btn_FindFlights"))).click();
		
	}

}
