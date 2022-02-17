package Week2Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
	    driver.findElement(By.xpath("//span[text()='Email']")).click();
	    driver.findElement(By.name("emailAddress")).sendKeys("rrr@gmail.com");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='10451']")).click();
	    driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	    driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    String title1 = "Duplicate Lead | opentaps CRM";
	    if(title.equals(title1)) {
	    	System.out.println("Test Case Pass");
	    }else {
	    	System.out.println("Test Case Fail");
	    }
	    

	

}
}