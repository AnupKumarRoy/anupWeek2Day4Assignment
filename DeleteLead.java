package Week2Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    driver.findElement(By.className("decorativeSubmit")).click();
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    driver.findElement(By.linkText("Leads")).click();
		    driver.findElement(By.linkText("Find Leads")).click();
		    driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("aravind");
			driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
			Thread.sleep(2000);
			WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
			String text = leadId.getText();
			leadId.click();
			System.out.println(text);
			driver.findElement(By.linkText("Delete")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			driver.quit();
			
			
			
			
			
			

	}

}
