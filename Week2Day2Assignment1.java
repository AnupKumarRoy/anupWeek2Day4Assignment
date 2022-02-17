package WeekDay3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day2Assignment1 {
public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Create Contact")).click();
    driver.findElement(By.id("firstNameField")).sendKeys("Anup");
    driver.findElement(By.id("lastNameField")).sendKeys("Roy");
    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
    WebElement findElement2 = driver.findElement(By.id("createContactForm_description"));
    findElement2.sendKeys("All is well");
    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Roy@gmail.com");
    WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
    
    Select Text = new Select(findElement);
    Text.selectByVisibleText("Arizona");
    driver.findElement(By.className("smallSubmit")).click();
    driver.findElement(By.xpath("//a[text()='Edit']")).click();
    Thread.sleep(5000);
    driver.findElement(By.name("importantNote")).sendKeys("Everythings is allright");
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.name("submitButton")).click();
    String title = driver.getTitle();
    System.out.println(title);
    
   
    
    
    
    
}
}
