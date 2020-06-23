import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.jvm.hotspot.tools.SysPropsDumper;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\facebook.com");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.id("identify_email")).sendKeys("nehamishra.71086@gmail.com");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement top=driver.findElement(By.className("loggedout_menubar_container"));
		System.out.println(top.findElements(By.tagName("a")).size());
		WebElement Bottom=driver.findElement(By.xpath("//*[@id='pageFooter']"));
		System.out.println(Bottom.findElements(By.tagName("a")).size());
		WebElement Middle=driver.findElement(By.xpath("//*[@class='gradientContent']"));
		System.out.println(Middle.findElements(By.tagName("a")).size());
	}

}
