import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int count=driver.findElements(By.tagName("a")).size();
		System.out.println("link count"+ count);
		WebElement Header=driver.findElement(By.cssSelector(".jumbotron.text-center.header_style"));
		int headercount=Header.findElements(By.tagName("a")).size();
		System.out.println("Header link count"+ headercount);
		WebElement Footer=driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		int FooterCount=Footer.findElements(By.tagName("a")).size();
		System.out.println("Footer link count"+ FooterCount);
		//WebElement Middle=driver.findElement(arg0)
		WebElement SecondColCoum=Footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		int SecondColcount=SecondColCoum.findElements(By.tagName("a")).size();
		System.out.println("Footer Second link count"+ SecondColcount);
		for(int i=1;i<=SecondColcount;i++)
		{
			String KeyControl=Keys.chord(Keys.CONTROL,Keys.ENTER);
			SecondColCoum.findElements(By.tagName("a")).get(i).sendKeys(KeyControl);
		}
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}