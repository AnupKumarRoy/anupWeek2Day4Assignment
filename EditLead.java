package Week2Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
	    WebElement Element = driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]"));
	    Element.sendKeys("manivel");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='11173']")).click();
        String title = driver.getTitle();
        String title1 = "View Lead | opentaps CRM";
        if(title.equals(title1))
        		{
        		System.out.println("Test Case Pass");
	    }else {
	    	System.out.println("Test Case Fail");    
	}

        driver.findElement(By.xpath("//a[text()='Edit']")).click();
  
        WebElement Element1 = driver.findElement(By.id("updateLeadForm_companyName"));
        Element1.clear();
        Element1.sendKeys("TestLeaf");
        driver.findElement(By.className("smallSubmit")).click();
        
        
        
        
        
}
}