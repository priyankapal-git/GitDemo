package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sumitpal/Documents/selenium/Drivers/chromedriver");
	
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9302026%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-qbG9oH7-QIVkpFmAh1jOgOUEAAYASAAEgIyy_D_BwE");
		driver.manage().window().maximize();
		WebElement day_d= driver.findElement(By.id("day"));
		Select oSelect=new Select(day_d);
		Thread.sleep(1000);
        oSelect.selectByIndex(23);
        WebElement months=driver.findElement(By.id("month"));
	    Select month_m1=new Select(months);
	    Thread.sleep(1000);
	    month_m1.selectByVisibleText("Feb");
	    WebElement year_y=driver.findElement(By.id("year"));
	    Select year=new Select(year_y);
	    Thread.sleep(4000);
	    year.selectByValue("2020");
	     driver.findElement(By.cssSelector("#u_0_b_PF")).sendKeys("priyanka");
	     
	     driver.findElement(By.xpath("//input[@id=\"u_0_b_PF\"]")).sendKeys("Priyanka");
    
	}

}


