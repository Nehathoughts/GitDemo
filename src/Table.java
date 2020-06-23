import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilg\\Downloads\\selenium Pre-Requitste\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22773/nz-vs-ind-1st-t20i-india-tour-of-new-zealand-2020");
		int totalrun=0;
		//List<WebElement> runscored=driver.findElements(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr .cb-col.cb-col-8.text-right.text-bold"));
		WebElement Table=driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		List<WebElement> Row=Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		int count=Row.size();
		
		for(int i=0;i<count-2;i++)
		{
			System.out.println(Row.get(i).getText());
			String run=Row.get(i).getText();
			int runs = Integer.parseInt(run);
			totalrun=totalrun+runs;
			
		}
		
		String extrarun=Table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extras=Integer.parseInt(extrarun);
		System.out.println("Total run:"+(totalrun+extras));
		System.out.println(Table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		
		System.out.println(Table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());//System.out.println("total scored run"+totalrun);
	}

}
