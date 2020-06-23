import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement FirstColCoum=Footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		int FirstColcount=FirstColCoum.findElements(By.tagName("a")).size();
		System.out.println("Footer link count"+ FirstColcount);
		for(int i=1;i<=FirstColcount;i++)
		{
			//FirstColCoum.findElements(By.tagName("a")).get(i).click();
		String Clickon=	Keys.chord(Keys.CONTROL,Keys.ENTER);
			FirstColCoum.findElements(By.tagName("a")).get(i).sendKeys(Clickon);
			System.out.println(FirstColCoum.findElements(By.tagName("a")).get(i).getText());
			//Thread.sleep(5000);
		}
			
		Set<String> id=driver.getWindowHandles();
			java.util.Iterator<String> it=id.iterator();
			
			while(it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				driver.close();
				
			}
		
		
		
		
		
		
	}

}
